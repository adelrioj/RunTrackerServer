package es.eina.tfg.model;

import es.eina.tfg.service.persistence.UserAndEventPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author adelrioj
 * @generated
 */
public class UserAndEventSoap implements Serializable {
    private long _idUser;
    private long _idEvent;
    private long _idRace;
    private int _participationNumber;

    public UserAndEventSoap() {
    }

    public static UserAndEventSoap toSoapModel(UserAndEvent model) {
        UserAndEventSoap soapModel = new UserAndEventSoap();

        soapModel.setIdUser(model.getIdUser());
        soapModel.setIdEvent(model.getIdEvent());
        soapModel.setIdRace(model.getIdRace());
        soapModel.setParticipationNumber(model.getParticipationNumber());

        return soapModel;
    }

    public static UserAndEventSoap[] toSoapModels(UserAndEvent[] models) {
        UserAndEventSoap[] soapModels = new UserAndEventSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static UserAndEventSoap[][] toSoapModels(UserAndEvent[][] models) {
        UserAndEventSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new UserAndEventSoap[models.length][models[0].length];
        } else {
            soapModels = new UserAndEventSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static UserAndEventSoap[] toSoapModels(List<UserAndEvent> models) {
        List<UserAndEventSoap> soapModels = new ArrayList<UserAndEventSoap>(models.size());

        for (UserAndEvent model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new UserAndEventSoap[soapModels.size()]);
    }

    public UserAndEventPK getPrimaryKey() {
        return new UserAndEventPK(_idUser, _idEvent);
    }

    public void setPrimaryKey(UserAndEventPK pk) {
        setIdUser(pk.idUser);
        setIdEvent(pk.idEvent);
    }

    public long getIdUser() {
        return _idUser;
    }

    public void setIdUser(long idUser) {
        _idUser = idUser;
    }

    public long getIdEvent() {
        return _idEvent;
    }

    public void setIdEvent(long idEvent) {
        _idEvent = idEvent;
    }

    public long getIdRace() {
        return _idRace;
    }

    public void setIdRace(long idRace) {
        _idRace = idRace;
    }

    public int getParticipationNumber() {
        return _participationNumber;
    }

    public void setParticipationNumber(int participationNumber) {
        _participationNumber = participationNumber;
    }
}
