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
    public long routePositionId;
    public long routeId;
    public double latitude;
    public double longitude;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{routePositionId=");
        sb.append(routePositionId);
        sb.append(", routeId=");
        sb.append(routeId);
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

        routeLocationImpl.setRoutePositionId(routePositionId);
        routeLocationImpl.setRouteId(routeId);
        routeLocationImpl.setLatitude(latitude);
        routeLocationImpl.setLongitude(longitude);

        routeLocationImpl.resetOriginalValues();

        return routeLocationImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        routePositionId = objectInput.readLong();
        routeId = objectInput.readLong();
        latitude = objectInput.readDouble();
        longitude = objectInput.readDouble();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(routePositionId);
        objectOutput.writeLong(routeId);
        objectOutput.writeDouble(latitude);
        objectOutput.writeDouble(longitude);
    }
}
