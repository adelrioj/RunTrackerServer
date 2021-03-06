package es.eina.tfg.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import es.eina.tfg.model.UserAndEvent;
import es.eina.tfg.model.UserAndEventModel;
import es.eina.tfg.service.persistence.UserAndEventPK;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the UserAndEvent service. Represents a row in the &quot;GL_UserAndEvent&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link es.eina.tfg.model.UserAndEventModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link UserAndEventImpl}.
 * </p>
 *
 * @author adelrioj
 * @see UserAndEventImpl
 * @see es.eina.tfg.model.UserAndEvent
 * @see es.eina.tfg.model.UserAndEventModel
 * @generated
 */
public class UserAndEventModelImpl extends BaseModelImpl<UserAndEvent>
    implements UserAndEventModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a user and event model instance should use the {@link es.eina.tfg.model.UserAndEvent} interface instead.
     */
    public static final String TABLE_NAME = "GL_UserAndEvent";
    public static final Object[][] TABLE_COLUMNS = {
            { "idUser", Types.BIGINT },
            { "idEvent", Types.BIGINT },
            { "idRace", Types.BIGINT },
            { "participationNumber", Types.INTEGER }
        };
    public static final String TABLE_SQL_CREATE = "create table GL_UserAndEvent (idUser LONG not null,idEvent LONG not null,idRace LONG,participationNumber INTEGER,primary key (idUser, idEvent))";
    public static final String TABLE_SQL_DROP = "drop table GL_UserAndEvent";
    public static final String ORDER_BY_JPQL = " ORDER BY userAndEvent.id.idUser ASC, userAndEvent.id.idEvent ASC";
    public static final String ORDER_BY_SQL = " ORDER BY GL_UserAndEvent.idUser ASC, GL_UserAndEvent.idEvent ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.es.eina.tfg.model.UserAndEvent"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.es.eina.tfg.model.UserAndEvent"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.es.eina.tfg.model.UserAndEvent"),
            true);
    public static long IDEVENT_COLUMN_BITMASK = 1L;
    public static long IDRACE_COLUMN_BITMASK = 2L;
    public static long IDUSER_COLUMN_BITMASK = 4L;
    public static long PARTICIPATIONNUMBER_COLUMN_BITMASK = 8L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.es.eina.tfg.model.UserAndEvent"));
    private static ClassLoader _classLoader = UserAndEvent.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            UserAndEvent.class
        };
    private long _idUser;
    private long _originalIdUser;
    private boolean _setOriginalIdUser;
    private long _idEvent;
    private long _originalIdEvent;
    private boolean _setOriginalIdEvent;
    private long _idRace;
    private long _originalIdRace;
    private boolean _setOriginalIdRace;
    private int _participationNumber;
    private int _originalParticipationNumber;
    private boolean _setOriginalParticipationNumber;
    private long _columnBitmask;
    private UserAndEvent _escapedModel;

    public UserAndEventModelImpl() {
    }

    @Override
    public UserAndEventPK getPrimaryKey() {
        return new UserAndEventPK(_idUser, _idEvent);
    }

    @Override
    public void setPrimaryKey(UserAndEventPK primaryKey) {
        setIdUser(primaryKey.idUser);
        setIdEvent(primaryKey.idEvent);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return new UserAndEventPK(_idUser, _idEvent);
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((UserAndEventPK) primaryKeyObj);
    }

    @Override
    public Class<?> getModelClass() {
        return UserAndEvent.class;
    }

    @Override
    public String getModelClassName() {
        return UserAndEvent.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("idUser", getIdUser());
        attributes.put("idEvent", getIdEvent());
        attributes.put("idRace", getIdRace());
        attributes.put("participationNumber", getParticipationNumber());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long idUser = (Long) attributes.get("idUser");

        if (idUser != null) {
            setIdUser(idUser);
        }

        Long idEvent = (Long) attributes.get("idEvent");

        if (idEvent != null) {
            setIdEvent(idEvent);
        }

        Long idRace = (Long) attributes.get("idRace");

        if (idRace != null) {
            setIdRace(idRace);
        }

        Integer participationNumber = (Integer) attributes.get(
                "participationNumber");

        if (participationNumber != null) {
            setParticipationNumber(participationNumber);
        }
    }

    @Override
    public long getIdUser() {
        return _idUser;
    }

    @Override
    public void setIdUser(long idUser) {
        _columnBitmask |= IDUSER_COLUMN_BITMASK;

        if (!_setOriginalIdUser) {
            _setOriginalIdUser = true;

            _originalIdUser = _idUser;
        }

        _idUser = idUser;
    }

    public long getOriginalIdUser() {
        return _originalIdUser;
    }

    @Override
    public long getIdEvent() {
        return _idEvent;
    }

    @Override
    public void setIdEvent(long idEvent) {
        _columnBitmask |= IDEVENT_COLUMN_BITMASK;

        if (!_setOriginalIdEvent) {
            _setOriginalIdEvent = true;

            _originalIdEvent = _idEvent;
        }

        _idEvent = idEvent;
    }

    public long getOriginalIdEvent() {
        return _originalIdEvent;
    }

    @Override
    public long getIdRace() {
        return _idRace;
    }

    @Override
    public void setIdRace(long idRace) {
        _columnBitmask |= IDRACE_COLUMN_BITMASK;

        if (!_setOriginalIdRace) {
            _setOriginalIdRace = true;

            _originalIdRace = _idRace;
        }

        _idRace = idRace;
    }

    public long getOriginalIdRace() {
        return _originalIdRace;
    }

    @Override
    public int getParticipationNumber() {
        return _participationNumber;
    }

    @Override
    public void setParticipationNumber(int participationNumber) {
        _columnBitmask |= PARTICIPATIONNUMBER_COLUMN_BITMASK;

        if (!_setOriginalParticipationNumber) {
            _setOriginalParticipationNumber = true;

            _originalParticipationNumber = _participationNumber;
        }

        _participationNumber = participationNumber;
    }

    public int getOriginalParticipationNumber() {
        return _originalParticipationNumber;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public UserAndEvent toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (UserAndEvent) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        UserAndEventImpl userAndEventImpl = new UserAndEventImpl();

        userAndEventImpl.setIdUser(getIdUser());
        userAndEventImpl.setIdEvent(getIdEvent());
        userAndEventImpl.setIdRace(getIdRace());
        userAndEventImpl.setParticipationNumber(getParticipationNumber());

        userAndEventImpl.resetOriginalValues();

        return userAndEventImpl;
    }

    @Override
    public int compareTo(UserAndEvent userAndEvent) {
        UserAndEventPK primaryKey = userAndEvent.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof UserAndEvent)) {
            return false;
        }

        UserAndEvent userAndEvent = (UserAndEvent) obj;

        UserAndEventPK primaryKey = userAndEvent.getPrimaryKey();

        if (getPrimaryKey().equals(primaryKey)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return getPrimaryKey().hashCode();
    }

    @Override
    public void resetOriginalValues() {
        UserAndEventModelImpl userAndEventModelImpl = this;

        userAndEventModelImpl._originalIdUser = userAndEventModelImpl._idUser;

        userAndEventModelImpl._setOriginalIdUser = false;

        userAndEventModelImpl._originalIdEvent = userAndEventModelImpl._idEvent;

        userAndEventModelImpl._setOriginalIdEvent = false;

        userAndEventModelImpl._originalIdRace = userAndEventModelImpl._idRace;

        userAndEventModelImpl._setOriginalIdRace = false;

        userAndEventModelImpl._originalParticipationNumber = userAndEventModelImpl._participationNumber;

        userAndEventModelImpl._setOriginalParticipationNumber = false;

        userAndEventModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<UserAndEvent> toCacheModel() {
        UserAndEventCacheModel userAndEventCacheModel = new UserAndEventCacheModel();

        userAndEventCacheModel.idUser = getIdUser();

        userAndEventCacheModel.idEvent = getIdEvent();

        userAndEventCacheModel.idRace = getIdRace();

        userAndEventCacheModel.participationNumber = getParticipationNumber();

        return userAndEventCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{idUser=");
        sb.append(getIdUser());
        sb.append(", idEvent=");
        sb.append(getIdEvent());
        sb.append(", idRace=");
        sb.append(getIdRace());
        sb.append(", participationNumber=");
        sb.append(getParticipationNumber());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("es.eina.tfg.model.UserAndEvent");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>idUser</column-name><column-value><![CDATA[");
        sb.append(getIdUser());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>idEvent</column-name><column-value><![CDATA[");
        sb.append(getIdEvent());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>idRace</column-name><column-value><![CDATA[");
        sb.append(getIdRace());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>participationNumber</column-name><column-value><![CDATA[");
        sb.append(getParticipationNumber());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
