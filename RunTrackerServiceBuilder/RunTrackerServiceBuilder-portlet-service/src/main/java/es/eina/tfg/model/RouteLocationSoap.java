package es.eina.tfg.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link es.eina.tfg.service.http.RouteLocationServiceSoap}.
 *
 * @author adelrioj
 * @see es.eina.tfg.service.http.RouteLocationServiceSoap
 * @generated
 */
public class RouteLocationSoap implements Serializable {
    private long _routePositionId;
    private long _routeId;
    private double _latitude;
    private double _longitude;

    public RouteLocationSoap() {
    }

    public static RouteLocationSoap toSoapModel(RouteLocation model) {
        RouteLocationSoap soapModel = new RouteLocationSoap();

        soapModel.setRoutePositionId(model.getRoutePositionId());
        soapModel.setRouteId(model.getRouteId());
        soapModel.setLatitude(model.getLatitude());
        soapModel.setLongitude(model.getLongitude());

        return soapModel;
    }

    public static RouteLocationSoap[] toSoapModels(RouteLocation[] models) {
        RouteLocationSoap[] soapModels = new RouteLocationSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static RouteLocationSoap[][] toSoapModels(RouteLocation[][] models) {
        RouteLocationSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new RouteLocationSoap[models.length][models[0].length];
        } else {
            soapModels = new RouteLocationSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static RouteLocationSoap[] toSoapModels(List<RouteLocation> models) {
        List<RouteLocationSoap> soapModels = new ArrayList<RouteLocationSoap>(models.size());

        for (RouteLocation model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new RouteLocationSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _routePositionId;
    }

    public void setPrimaryKey(long pk) {
        setRoutePositionId(pk);
    }

    public long getRoutePositionId() {
        return _routePositionId;
    }

    public void setRoutePositionId(long routePositionId) {
        _routePositionId = routePositionId;
    }

    public long getRouteId() {
        return _routeId;
    }

    public void setRouteId(long routeId) {
        _routeId = routeId;
    }

    public double getLatitude() {
        return _latitude;
    }

    public void setLatitude(double latitude) {
        _latitude = latitude;
    }

    public double getLongitude() {
        return _longitude;
    }

    public void setLongitude(double longitude) {
        _longitude = longitude;
    }
}
