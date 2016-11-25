package es.eina.tfg.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link UserAndRoute}.
 * </p>
 *
 * @author adelrioj
 * @see UserAndRoute
 * @generated
 */
public class UserAndRouteWrapper implements UserAndRoute,
    ModelWrapper<UserAndRoute> {
    private UserAndRoute _userAndRoute;

    public UserAndRouteWrapper(UserAndRoute userAndRoute) {
        _userAndRoute = userAndRoute;
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

    /**
    * Returns the primary key of this user and route.
    *
    * @return the primary key of this user and route
    */
    @Override
    public es.eina.tfg.service.persistence.UserAndRoutePK getPrimaryKey() {
        return _userAndRoute.getPrimaryKey();
    }

    /**
    * Sets the primary key of this user and route.
    *
    * @param primaryKey the primary key of this user and route
    */
    @Override
    public void setPrimaryKey(
        es.eina.tfg.service.persistence.UserAndRoutePK primaryKey) {
        _userAndRoute.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the id user of this user and route.
    *
    * @return the id user of this user and route
    */
    @Override
    public long getIdUser() {
        return _userAndRoute.getIdUser();
    }

    /**
    * Sets the id user of this user and route.
    *
    * @param idUser the id user of this user and route
    */
    @Override
    public void setIdUser(long idUser) {
        _userAndRoute.setIdUser(idUser);
    }

    /**
    * Returns the id route of this user and route.
    *
    * @return the id route of this user and route
    */
    @Override
    public long getIdRoute() {
        return _userAndRoute.getIdRoute();
    }

    /**
    * Sets the id route of this user and route.
    *
    * @param idRoute the id route of this user and route
    */
    @Override
    public void setIdRoute(long idRoute) {
        _userAndRoute.setIdRoute(idRoute);
    }

    @Override
    public boolean isNew() {
        return _userAndRoute.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _userAndRoute.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _userAndRoute.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _userAndRoute.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _userAndRoute.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _userAndRoute.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _userAndRoute.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _userAndRoute.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _userAndRoute.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _userAndRoute.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _userAndRoute.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new UserAndRouteWrapper((UserAndRoute) _userAndRoute.clone());
    }

    @Override
    public int compareTo(es.eina.tfg.model.UserAndRoute userAndRoute) {
        return _userAndRoute.compareTo(userAndRoute);
    }

    @Override
    public int hashCode() {
        return _userAndRoute.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<es.eina.tfg.model.UserAndRoute> toCacheModel() {
        return _userAndRoute.toCacheModel();
    }

    @Override
    public es.eina.tfg.model.UserAndRoute toEscapedModel() {
        return new UserAndRouteWrapper(_userAndRoute.toEscapedModel());
    }

    @Override
    public es.eina.tfg.model.UserAndRoute toUnescapedModel() {
        return new UserAndRouteWrapper(_userAndRoute.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _userAndRoute.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _userAndRoute.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _userAndRoute.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof UserAndRouteWrapper)) {
            return false;
        }

        UserAndRouteWrapper userAndRouteWrapper = (UserAndRouteWrapper) obj;

        if (Validator.equals(_userAndRoute, userAndRouteWrapper._userAndRoute)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public UserAndRoute getWrappedUserAndRoute() {
        return _userAndRoute;
    }

    @Override
    public UserAndRoute getWrappedModel() {
        return _userAndRoute;
    }

    @Override
    public void resetOriginalValues() {
        _userAndRoute.resetOriginalValues();
    }
}
