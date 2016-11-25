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
    private long _idRace;
    private long _idUser;
    private long _idRoute;
    private String _type;

    public RaceSoap() {
    }

    public static RaceSoap toSoapModel(Race model) {
        RaceSoap soapModel = new RaceSoap();

        soapModel.setIdRace(model.getIdRace());
        soapModel.setIdUser(model.getIdUser());
        soapModel.setIdRoute(model.getIdRoute());
        soapModel.setType(model.getType());

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
        return _idRace;
    }

    public void setPrimaryKey(long pk) {
        setIdRace(pk);
    }

    public long getIdRace() {
        return _idRace;
    }

    public void setIdRace(long idRace) {
        _idRace = idRace;
    }

    public long getIdUser() {
        return _idUser;
    }

    public void setIdUser(long idUser) {
        _idUser = idUser;
    }

    public long getIdRoute() {
        return _idRoute;
    }

    public void setIdRoute(long idRoute) {
        _idRoute = idRoute;
    }

    public String getType() {
        return _type;
    }

    public void setType(String type) {
        _type = type;
    }
}
