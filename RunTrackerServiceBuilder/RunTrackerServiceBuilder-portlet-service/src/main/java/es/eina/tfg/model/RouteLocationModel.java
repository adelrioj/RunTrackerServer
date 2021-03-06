package es.eina.tfg.model;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import es.eina.tfg.service.persistence.RouteLocationPK;

import java.io.Serializable;

/**
 * The base model interface for the RouteLocation service. Represents a row in the &quot;GL_RouteLocation&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link es.eina.tfg.model.impl.RouteLocationModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link es.eina.tfg.model.impl.RouteLocationImpl}.
 * </p>
 *
 * @author adelrioj
 * @see RouteLocation
 * @see es.eina.tfg.model.impl.RouteLocationImpl
 * @see es.eina.tfg.model.impl.RouteLocationModelImpl
 * @generated
 */
public interface RouteLocationModel extends BaseModel<RouteLocation> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a route location model instance should use the {@link RouteLocation} interface instead.
     */

    /**
     * Returns the primary key of this route location.
     *
     * @return the primary key of this route location
     */
    public RouteLocationPK getPrimaryKey();

    /**
     * Sets the primary key of this route location.
     *
     * @param primaryKey the primary key of this route location
     */
    public void setPrimaryKey(RouteLocationPK primaryKey);

    /**
     * Returns the id route location of this route location.
     *
     * @return the id route location of this route location
     */
    public long getIdRouteLocation();

    /**
     * Sets the id route location of this route location.
     *
     * @param idRouteLocation the id route location of this route location
     */
    public void setIdRouteLocation(long idRouteLocation);

    /**
     * Returns the id route of this route location.
     *
     * @return the id route of this route location
     */
    public long getIdRoute();

    /**
     * Sets the id route of this route location.
     *
     * @param idRoute the id route of this route location
     */
    public void setIdRoute(long idRoute);

    /**
     * Returns the latitude of this route location.
     *
     * @return the latitude of this route location
     */
    public double getLatitude();

    /**
     * Sets the latitude of this route location.
     *
     * @param latitude the latitude of this route location
     */
    public void setLatitude(double latitude);

    /**
     * Returns the longitude of this route location.
     *
     * @return the longitude of this route location
     */
    public double getLongitude();

    /**
     * Sets the longitude of this route location.
     *
     * @param longitude the longitude of this route location
     */
    public void setLongitude(double longitude);

    /**
     * Returns the elevation of this route location.
     *
     * @return the elevation of this route location
     */
    public double getElevation();

    /**
     * Sets the elevation of this route location.
     *
     * @param elevation the elevation of this route location
     */
    public void setElevation(double elevation);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(es.eina.tfg.model.RouteLocation routeLocation);

    @Override
    public int hashCode();

    @Override
    public CacheModel<es.eina.tfg.model.RouteLocation> toCacheModel();

    @Override
    public es.eina.tfg.model.RouteLocation toEscapedModel();

    @Override
    public es.eina.tfg.model.RouteLocation toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
