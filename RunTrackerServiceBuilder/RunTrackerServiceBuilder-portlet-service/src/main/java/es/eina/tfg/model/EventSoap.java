package es.eina.tfg.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link es.eina.tfg.service.http.EventServiceSoap}.
 *
 * @author adelrioj
 * @see es.eina.tfg.service.http.EventServiceSoap
 * @generated
 */
public class EventSoap implements Serializable {
    private long _idEvent;
    private long _idRoute;
    private long _idAuthor;
    private String _name;
    private Date _plannedStartingTime;
    private Date _plannedFinishTime;
    private Date _realStartingTime;
    private Date _realFinishTime;

    public EventSoap() {
    }

    public static EventSoap toSoapModel(Event model) {
        EventSoap soapModel = new EventSoap();

        soapModel.setIdEvent(model.getIdEvent());
        soapModel.setIdRoute(model.getIdRoute());
        soapModel.setIdAuthor(model.getIdAuthor());
        soapModel.setName(model.getName());
        soapModel.setPlannedStartingTime(model.getPlannedStartingTime());
        soapModel.setPlannedFinishTime(model.getPlannedFinishTime());
        soapModel.setRealStartingTime(model.getRealStartingTime());
        soapModel.setRealFinishTime(model.getRealFinishTime());

        return soapModel;
    }

    public static EventSoap[] toSoapModels(Event[] models) {
        EventSoap[] soapModels = new EventSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static EventSoap[][] toSoapModels(Event[][] models) {
        EventSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new EventSoap[models.length][models[0].length];
        } else {
            soapModels = new EventSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static EventSoap[] toSoapModels(List<Event> models) {
        List<EventSoap> soapModels = new ArrayList<EventSoap>(models.size());

        for (Event model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new EventSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _idEvent;
    }

    public void setPrimaryKey(long pk) {
        setIdEvent(pk);
    }

    public long getIdEvent() {
        return _idEvent;
    }

    public void setIdEvent(long idEvent) {
        _idEvent = idEvent;
    }

    public long getIdRoute() {
        return _idRoute;
    }

    public void setIdRoute(long idRoute) {
        _idRoute = idRoute;
    }

    public long getIdAuthor() {
        return _idAuthor;
    }

    public void setIdAuthor(long idAuthor) {
        _idAuthor = idAuthor;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public Date getPlannedStartingTime() {
        return _plannedStartingTime;
    }

    public void setPlannedStartingTime(Date plannedStartingTime) {
        _plannedStartingTime = plannedStartingTime;
    }

    public Date getPlannedFinishTime() {
        return _plannedFinishTime;
    }

    public void setPlannedFinishTime(Date plannedFinishTime) {
        _plannedFinishTime = plannedFinishTime;
    }

    public Date getRealStartingTime() {
        return _realStartingTime;
    }

    public void setRealStartingTime(Date realStartingTime) {
        _realStartingTime = realStartingTime;
    }

    public Date getRealFinishTime() {
        return _realFinishTime;
    }

    public void setRealFinishTime(Date realFinishTime) {
        _realFinishTime = realFinishTime;
    }
}
