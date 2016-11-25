package es.eina.tfg.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import es.eina.tfg.model.RouteLocation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing RouteLocation in entity cache.
 *
 * @author adelrioj
 * @see RouteLocation
 * @generated
 */
public class RouteLocationCacheModel implements CacheModel<RouteLocation>,
    Externalizable {
    public long idRouteLocation;
    public long idRoute;
    public double latitude;
    public double longitude;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{idRouteLocation=");
        sb.append(idRouteLocation);
        sb.append(", idRoute=");
        sb.append(idRoute);
        sb.append(", latitude=");
        sb.append(latitude);
        sb.append(", longitude=");
        sb.append(longitude);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public RouteLocation toEntityModel() {
        RouteLocationImpl routeLocationImpl = new RouteLocationImpl();

        routeLocationImpl.setIdRouteLocation(idRouteLocation);
        routeLocationImpl.setIdRoute(idRoute);
        routeLocationImpl.setLatitude(latitude);
        routeLocationImpl.setLongitude(longitude);

        routeLocationImpl.resetOriginalValues();

        return routeLocationImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        idRouteLocation = objectInput.readLong();
        idRoute = objectInput.readLong();
        latitude = objectInput.readDouble();
        longitude = objectInput.readDouble();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(idRouteLocation);
        objectOutput.writeLong(idRoute);
        objectOutput.writeDouble(latitude);
        objectOutput.writeDouble(longitude);
    }
}
