package es.eina.tfg.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import es.eina.tfg.model.UserAndRoute;
import es.eina.tfg.model.UserAndRouteModel;
import es.eina.tfg.service.persistence.UserAndRoutePK;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the UserAndRoute service. Represents a row in the &quot;GL_UserAndRoute&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link es.eina.tfg.model.UserAndRouteModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link UserAndRouteImpl}.
 * </p>
 *
 * @author adelrioj
 * @see UserAndRouteImpl
 * @see es.eina.tfg.model.UserAndRoute
 * @see es.eina.tfg.model.UserAndRouteModel
 * @generated
 */
public class UserAndRouteModelImpl extends BaseModelImpl<UserAndRoute>
    implements UserAndRouteModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a user and route model instance should use the {@link es.eina.tfg.model.UserAndRoute} interface instead.
     */
    public static final String TABLE_NAME = "GL_UserAndRoute";
    public static final Object[][] TABLE_COLUMNS = {
            { "idUser", Types.BIGINT },
            { "idRoute", Types.BIGINT }
        };
    public static final String TABLE_SQL_CREATE = "create table GL_UserAndRoute (idUser LONG not null,idRoute LONG not null,primary key (idUser, idRoute))";
    public static final String TABLE_SQL_DROP = "drop table GL_UserAndRoute";
    public static final String ORDER_BY_JPQL = " ORDER BY userAndRoute.id.idUser ASC";
    public static final String ORDER_BY_SQL = " ORDER BY GL_UserAndRoute.idUser ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.es.eina.tfg.model.UserAndRoute"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.es.eina.tfg.model.UserAndRoute"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.es.eina.tfg.model.UserAndRoute"),
            true);
    public static long IDUSER_COLUMN_BITMASK = 1L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.es.eina.tfg.model.UserAndRoute"));
    private static ClassLoader _classLoader = UserAndRoute.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            UserAndRoute.class
        };
    private long _idUser;
    private long _originalIdUser;
    private boolean _setOriginalIdUser;
    private long _idRoute;
    private long _columnBitmask;
    private UserAndRoute _escapedModel;

    public UserAndRouteModelImpl() {
    }

    @Override
    public UserAndRoutePK getPrimaryKey() {
        return new UserAndRoutePK(_idUser, _idRoute);
    }

    @Override
    public void setPrimaryKey(UserAndRoutePK primaryKey) {
        setIdUser(primaryKey.idUser);
        setIdRoute(primaryKey.idRoute);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return new UserAndRoutePK(_idUser, _idRoute);
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((UserAndRoutePK) primaryKeyObj);
    }

    @Override
    public Class<?> getModelClass() {
        return UserAndRoute.class;
    }

    @Override
    public String getModelClassName() {
        return UserAndRoute.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("idUser", getIdUser());
        attributes.put("idRoute", getIdRoute());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long idUser = (Long) attributes.get("idUser");

        if (idUser != null) {
            setIdUser(idUser);
        }

        Long idRoute = (Long) attributes.get("idRoute");

        if (idRoute != null) {
            setIdRoute(idRoute);
        }
    }

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

    @Override
    public long getIdRoute() {
        return _idRoute;
    }

    @Override
    public void setIdRoute(long idRoute) {
        _idRoute = idRoute;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public UserAndRoute toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (UserAndRoute) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        UserAndRouteImpl userAndRouteImpl = new UserAndRouteImpl();

        userAndRouteImpl.setIdUser(getIdUser());
        userAndRouteImpl.setIdRoute(getIdRoute());

        userAndRouteImpl.resetOriginalValues();

        return userAndRouteImpl;
    }

    @Override
    public int compareTo(UserAndRoute userAndRoute) {
        int value = 0;

        if (getIdUser() < userAndRoute.getIdUser()) {
            value = -1;
        } else if (getIdUser() > userAndRoute.getIdUser()) {
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

        if (!(obj instanceof UserAndRoute)) {
            return false;
        }

        UserAndRoute userAndRoute = (UserAndRoute) obj;

        UserAndRoutePK primaryKey = userAndRoute.getPrimaryKey();

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
        UserAndRouteModelImpl userAndRouteModelImpl = this;

        userAndRouteModelImpl._originalIdUser = userAndRouteModelImpl._idUser;

        userAndRouteModelImpl._setOriginalIdUser = false;

        userAndRouteModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<UserAndRoute> toCacheModel() {
        UserAndRouteCacheModel userAndRouteCacheModel = new UserAndRouteCacheModel();

        userAndRouteCacheModel.idUser = getIdUser();

        userAndRouteCacheModel.idRoute = getIdRoute();

        return userAndRouteCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{idUser=");
        sb.append(getIdUser());
        sb.append(", idRoute=");
        sb.append(getIdRoute());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(10);

        sb.append("<model><model-name>");
        sb.append("es.eina.tfg.model.UserAndRoute");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>idUser</column-name><column-value><![CDATA[");
        sb.append(getIdUser());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>idRoute</column-name><column-value><![CDATA[");
        sb.append(getIdRoute());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
