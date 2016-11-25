package es.eina.tfg.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import es.eina.tfg.model.Race;
import es.eina.tfg.model.RaceModel;
import es.eina.tfg.model.RaceSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Race service. Represents a row in the &quot;GL_Race&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link es.eina.tfg.model.RaceModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link RaceImpl}.
 * </p>
 *
 * @author adelrioj
 * @see RaceImpl
 * @see es.eina.tfg.model.Race
 * @see es.eina.tfg.model.RaceModel
 * @generated
 */
@JSON(strict = true)
public class RaceModelImpl extends BaseModelImpl<Race> implements RaceModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a race model instance should use the {@link es.eina.tfg.model.Race} interface instead.
     */
    public static final String TABLE_NAME = "GL_Race";
    public static final Object[][] TABLE_COLUMNS = {
            { "idRace", Types.BIGINT },
            { "idUser", Types.BIGINT },
            { "idRoute", Types.BIGINT },
            { "type_", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table GL_Race (idRace LONG not null primary key,idUser LONG,idRoute LONG,type_ VARCHAR(75) null)";
    public static final String TABLE_SQL_DROP = "drop table GL_Race";
    public static final String ORDER_BY_JPQL = " ORDER BY race.idUser ASC";
    public static final String ORDER_BY_SQL = " ORDER BY GL_Race.idUser ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.es.eina.tfg.model.Race"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.es.eina.tfg.model.Race"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.es.eina.tfg.model.Race"),
            true);
    public static long IDUSER_COLUMN_BITMASK = 1L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.es.eina.tfg.model.Race"));
    private static ClassLoader _classLoader = Race.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] { Race.class };
    private long _idRace;
    private long _idUser;
    private long _originalIdUser;
    private boolean _setOriginalIdUser;
    private long _idRoute;
    private String _type;
    private long _columnBitmask;
    private Race _escapedModel;

    public RaceModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static Race toModel(RaceSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        Race model = new RaceImpl();

        model.setIdRace(soapModel.getIdRace());
        model.setIdUser(soapModel.getIdUser());
        model.setIdRoute(soapModel.getIdRoute());
        model.setType(soapModel.getType());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<Race> toModels(RaceSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<Race> models = new ArrayList<Race>(soapModels.length);

        for (RaceSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public long getPrimaryKey() {
        return _idRace;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setIdRace(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _idRace;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return Race.class;
    }

    @Override
    public String getModelClassName() {
        return Race.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("idRace", getIdRace());
        attributes.put("idUser", getIdUser());
        attributes.put("idRoute", getIdRoute());
        attributes.put("type", getType());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long idRace = (Long) attributes.get("idRace");

        if (idRace != null) {
            setIdRace(idRace);
        }

        Long idUser = (Long) attributes.get("idUser");

        if (idUser != null) {
            setIdUser(idUser);
        }

        Long idRoute = (Long) attributes.get("idRoute");

        if (idRoute != null) {
            setIdRoute(idRoute);
        }

        String type = (String) attributes.get("type");

        if (type != null) {
            setType(type);
        }
    }

    @JSON
    @Override
    public long getIdRace() {
        return _idRace;
    }

    @Override
    public void setIdRace(long idRace) {
        _idRace = idRace;
    }

    @JSON
    @Override
    public long getIdUser() {
        return _idUser;
    }

    @Override
    public void setIdUser(long idUser) {
        _columnBitmask = -1L;

        if (!_setOriginalIdUser) {
            _setOriginalIdUser = true;

            _originalIdUser = _idUser;
        }

        _idUser = idUser;
    }

    public long getOriginalIdUser() {
        return _originalIdUser;
    }

    @JSON
    @Override
    public long getIdRoute() {
        return _idRoute;
    }

    @Override
    public void setIdRoute(long idRoute) {
        _idRoute = idRoute;
    }

    @JSON
    @Override
    public String getType() {
        if (_type == null) {
            return StringPool.BLANK;
        } else {
            return _type;
        }
    }

    @Override
    public void setType(String type) {
        _type = type;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            Race.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public Race toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (Race) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        RaceImpl raceImpl = new RaceImpl();

        raceImpl.setIdRace(getIdRace());
        raceImpl.setIdUser(getIdUser());
        raceImpl.setIdRoute(getIdRoute());
        raceImpl.setType(getType());

        raceImpl.resetOriginalValues();

        return raceImpl;
    }

    @Override
    public int compareTo(Race race) {
        int value = 0;

        if (getIdUser() < race.getIdUser()) {
            value = -1;
        } else if (getIdUser() > race.getIdUser()) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Race)) {
            return false;
        }

        Race race = (Race) obj;

        long primaryKey = race.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
        RaceModelImpl raceModelImpl = this;

        raceModelImpl._originalIdUser = raceModelImpl._idUser;

        raceModelImpl._setOriginalIdUser = false;

        raceModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<Race> toCacheModel() {
        RaceCacheModel raceCacheModel = new RaceCacheModel();

        raceCacheModel.idRace = getIdRace();

        raceCacheModel.idUser = getIdUser();

        raceCacheModel.idRoute = getIdRoute();

        raceCacheModel.type = getType();

        String type = raceCacheModel.type;

        if ((type != null) && (type.length() == 0)) {
            raceCacheModel.type = null;
        }

        return raceCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{idRace=");
        sb.append(getIdRace());
        sb.append(", idUser=");
        sb.append(getIdUser());
        sb.append(", idRoute=");
        sb.append(getIdRoute());
        sb.append(", type=");
        sb.append(getType());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("es.eina.tfg.model.Race");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>idRace</column-name><column-value><![CDATA[");
        sb.append(getIdRace());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>idUser</column-name><column-value><![CDATA[");
        sb.append(getIdUser());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>idRoute</column-name><column-value><![CDATA[");
        sb.append(getIdRoute());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>type</column-name><column-value><![CDATA[");
        sb.append(getType());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
