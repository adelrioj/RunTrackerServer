package es.eina.tfg.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link es.eina.tfg.service.http.RaceServiceSoap}.
 *
 * @author adelrioj
 * @see es.eina.tfg.service.http.RaceServiceSoap
 * @generated
 */
public class RaceSoap implements Serializable {
    private long _raceId;
    private long _userId;
    private long _routeId;
    private String _type;
    private int _userHeight;
    private int _userWeight;

    public RaceSoap() {
    }

    public static RaceSoap toSoapModel(Race model) {
        RaceSoap soapModel = new RaceSoap();

        soapModel.setRaceId(model.getRaceId());
        soapModel.setUserId(model.getUserId());
        soapModel.setRouteId(model.getRouteId());
        soapModel.setType(model.getType());
        soapModel.setUserHeight(model.getUserHeight());
        soapModel.setUserWeight(model.getUserWeight());

        return soapModel;
    }

    public static RaceSoap[] toSoapModels(Race[] models) {
        RaceSoap[] soapModels = new RaceSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static RaceSoap[][] toSoapModels(Race[][] models) {
        RaceSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new RaceSoap[models.length][models[0].length];
        } else {
            soapModels = new RaceSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static RaceSoap[] toSoapModels(List<Race> models) {
        List<RaceSoap> soapModels = new ArrayList<RaceSoap>(models.size());

        for (Race model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new RaceSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _raceId;
    }

    public void setPrimaryKey(long pk) {
        setRaceId(pk);
    }

    public long getRaceId() {
        return _raceId;
    }

    public void setRaceId(long raceId) {
        _raceId = raceId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public long getRouteId() {
        return _routeId;
    }

    public void setRouteId(long routeId) {
        _routeId = routeId;
    }

    public String getType() {
        return _type;
    }

    public void setType(String type) {
        _type = type;
    }

    public int getUserHeight() {
        return _userHeight;
    }

    public void setUserHeight(int userHeight) {
        _userHeight = userHeight;
    }

    public int getUserWeight() {
        return _userWeight;
    }

    public void setUserWeight(int userWeight) {
        _userWeight = userWeight;
    }
}
