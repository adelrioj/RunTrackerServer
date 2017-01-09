package es.eina.tfg.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link RouteLocation}.
 * </p>
 *
 * @author adelrioj
 * @see RouteLocation
 * @generated
 */
public class RouteLocationWrapper implements RouteLocation,
    ModelWrapper<RouteLocation> {
    private RouteLocation _routeLocation;

    public RouteLocationWrapper(RouteLocation routeLocation) {
        _routeLocation = routeLocation;
    }

    @Override
    public Class<?> getModelClass() {
        return RouteLocation.class;
    }

    @Override
    public String getModelClassName() {
        return RouteLocation.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("idRouteLocation", getIdRouteLocation());
        attributes.put("idRoute", getIdRoute());
        attributes.put("latitude", getLatitude());
        attributes.put("longitude", getLongitude());
        attributes.put("elevation", getElevation());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long idRouteLocation = (Long) attributes.get("idRouteLocation");

        if (idRouteLocation != null) {
            setIdRouteLocation(idRouteLocation);
        }

        Long idRoute = (Long) attributes.get("idRoute");

        if (idRoute != null) {
            setIdRoute(idRoute);
        }

        Double latitude = (Double) attributes.get("latitude");

        if (latitude != null) {
            setLatitude(latitude);
        }

        Double longitude = (Double) attributes.get("longitude");

        if (longitude != null) {
            setLongitude(longitude);
        }

        Double elevation = (Double) attributes.get("elevation");

        if (elevation != null) {
            setElevation(elevation);
        }
    }

    /**
    * Returns the primary key of this route location.
    *
    * @return the primary key of this route location
    */
    @Override
    public es.eina.tfg.service.persistence.RouteLocationPK getPrimaryKey() {
        return _routeLocation.getPrimaryKey();
    }

    /**
    * Sets the primary key of this route location.
    *
    * @param primaryKey the primary key of this route location
    */
    @Override
    public void setPrimaryKey(
        es.eina.tfg.service.persistence.RouteLocationPK primaryKey) {
        _routeLocation.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the id route location of this route location.
    *
    * @return the id route location of this route location
    */
    @Override
    public long getIdRouteLocation() {
        return _routeLocation.getIdRouteLocation();
    }

    /**
    * Sets the id route location of this route location.
    *
    * @param idRouteLocation the id route location of this route location
    */
    @Override
    public void setIdRouteLocation(long idRouteLocation) {
        _routeLocation.setIdRouteLocation(idRouteLocation);
    }

    /**
    * Returns the id route of this route location.
    *
    * @return the id route of this route location
    */
    @Override
    public long getIdRoute() {
        return _routeLocation.getIdRoute();
    }

    /**
    * Sets the id route of this route location.
    *
    * @param idRoute the id route of this route location
    */
    @Override
    public void setIdRoute(long idRoute) {
        _routeLocation.setIdRoute(idRoute);
    }

    /**
    * Returns the latitude of this route location.
    *
    * @return the latitude of this route location
    */
    @Override
    public double getLatitude() {
        return _routeLocation.getLatitude();
    }

    /**
    * Sets the latitude of this route location.
    *
    * @param latitude the latitude of this route location
    */
    @Override
    public void setLatitude(double latitude) {
        _routeLocation.setLatitude(latitude);
    }

    /**
    * Returns the longitude of this route location.
    *
    * @return the longitude of this route location
    */
    @Override
    public double getLongitude() {
        return _routeLocation.getLongitude();
    }

    /**
    * Sets the longitude of this route location.
    *
    * @param longitude the longitude of this route location
    */
    @Override
    public void setLongitude(double longitude) {
        _routeLocation.setLongitude(longitude);
    }

    /**
    * Returns the elevation of this route location.
    *
    * @return the elevation of this route location
    */
    @Override
    public double getElevation() {
        return _routeLocation.getElevation();
    }

    /**
    * Sets the elevation of this route location.
    *
    * @param elevation the elevation of this route location
    */
    @Override
    public void setElevation(double elevation) {
        _routeLocation.setElevation(elevation);
    }

    @Override
    public boolean isNew() {
        return _routeLocation.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _routeLocation.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _routeLocation.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _routeLocation.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _routeLocation.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _routeLocation.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _routeLocation.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _routeLocation.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _routeLocation.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _routeLocation.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _routeLocation.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new RouteLocationWrapper((RouteLocation) _routeLocation.clone());
    }

    @Override
    public int compareTo(es.eina.tfg.model.RouteLocation routeLocation) {
        return _routeLocation.compareTo(routeLocation);
    }

    @Override
    public int hashCode() {
        return _routeLocation.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<es.eina.tfg.model.RouteLocation> toCacheModel() {
        return _routeLocation.toCacheModel();
    }

    @Override
    public es.eina.tfg.model.RouteLocation toEscapedModel() {
        return new RouteLocationWrapper(_routeLocation.toEscapedModel());
    }

    @Override
    public es.eina.tfg.model.RouteLocation toUnescapedModel() {
        return new RouteLocationWrapper(_routeLocation.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _routeLocation.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _routeLocation.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _routeLocation.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof RouteLocationWrapper)) {
            return false;
        }

        RouteLocationWrapper routeLocationWrapper = (RouteLocationWrapper) obj;

        if (Validator.equals(_routeLocation, routeLocationWrapper._routeLocation)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public RouteLocation getWrappedRouteLocation() {
        return _routeLocation;
    }

    @Override
    public RouteLocation getWrappedModel() {
        return _routeLocation;
    }

    @Override
    public void resetOriginalValues() {
        _routeLocation.resetOriginalValues();
    }
}
