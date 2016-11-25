package es.eina.tfg.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Event}.
 * </p>
 *
 * @author adelrioj
 * @see Event
 * @generated
 */
public class EventWrapper implements Event, ModelWrapper<Event> {
    private Event _event;

    public EventWrapper(Event event) {
        _event = event;
    }

    @Override
    public Class<?> getModelClass() {
        return Event.class;
    }

    @Override
    public String getModelClassName() {
        return Event.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("idEvent", getIdEvent());
        attributes.put("idRoute", getIdRoute());
        attributes.put("idAuthor", getIdAuthor());
        attributes.put("name", getName());
        attributes.put("plannedStartingTime", getPlannedStartingTime());
        attributes.put("plannedFinishTime", getPlannedFinishTime());
        attributes.put("realStartingTime", getRealStartingTime());
        attributes.put("realFinishTime", getRealFinishTime());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long idEvent = (Long) attributes.get("idEvent");

        if (idEvent != null) {
            setIdEvent(idEvent);
        }

        Long idRoute = (Long) attributes.get("idRoute");

        if (idRoute != null) {
            setIdRoute(idRoute);
        }

        Long idAuthor = (Long) attributes.get("idAuthor");

        if (idAuthor != null) {
            setIdAuthor(idAuthor);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        Date plannedStartingTime = (Date) attributes.get("plannedStartingTime");

        if (plannedStartingTime != null) {
            setPlannedStartingTime(plannedStartingTime);
        }

        Date plannedFinishTime = (Date) attributes.get("plannedFinishTime");

        if (plannedFinishTime != null) {
            setPlannedFinishTime(plannedFinishTime);
        }

        Date realStartingTime = (Date) attributes.get("realStartingTime");

        if (realStartingTime != null) {
            setRealStartingTime(realStartingTime);
        }

        Date realFinishTime = (Date) attributes.get("realFinishTime");

        if (realFinishTime != null) {
            setRealFinishTime(realFinishTime);
        }
    }

    /**
    * Returns the primary key of this event.
    *
    * @return the primary key of this event
    */
    @Override
    public long getPrimaryKey() {
        return _event.getPrimaryKey();
    }

    /**
    * Sets the primary key of this event.
    *
    * @param primaryKey the primary key of this event
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _event.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the id event of this event.
    *
    * @return the id event of this event
    */
    @Override
    public long getIdEvent() {
        return _event.getIdEvent();
    }

    /**
    * Sets the id event of this event.
    *
    * @param idEvent the id event of this event
    */
    @Override
    public void setIdEvent(long idEvent) {
        _event.setIdEvent(idEvent);
    }

    /**
    * Returns the id route of this event.
    *
    * @return the id route of this event
    */
    @Override
    public long getIdRoute() {
        return _event.getIdRoute();
    }

    /**
    * Sets the id route of this event.
    *
    * @param idRoute the id route of this event
    */
    @Override
    public void setIdRoute(long idRoute) {
        _event.setIdRoute(idRoute);
    }

    /**
    * Returns the id author of this event.
    *
    * @return the id author of this event
    */
    @Override
    public long getIdAuthor() {
        return _event.getIdAuthor();
    }

    /**
    * Sets the id author of this event.
    *
    * @param idAuthor the id author of this event
    */
    @Override
    public void setIdAuthor(long idAuthor) {
        _event.setIdAuthor(idAuthor);
    }

    /**
    * Returns the name of this event.
    *
    * @return the name of this event
    */
    @Override
    public java.lang.String getName() {
        return _event.getName();
    }

    /**
    * Sets the name of this event.
    *
    * @param name the name of this event
    */
    @Override
    public void setName(java.lang.String name) {
        _event.setName(name);
    }

    /**
    * Returns the planned starting time of this event.
    *
    * @return the planned starting time of this event
    */
    @Override
    public java.util.Date getPlannedStartingTime() {
        return _event.getPlannedStartingTime();
    }

    /**
    * Sets the planned starting time of this event.
    *
    * @param plannedStartingTime the planned starting time of this event
    */
    @Override
    public void setPlannedStartingTime(java.util.Date plannedStartingTime) {
        _event.setPlannedStartingTime(plannedStartingTime);
    }

    /**
    * Returns the planned finish time of this event.
    *
    * @return the planned finish time of this event
    */
    @Override
    public java.util.Date getPlannedFinishTime() {
        return _event.getPlannedFinishTime();
    }

    /**
    * Sets the planned finish time of this event.
    *
    * @param plannedFinishTime the planned finish time of this event
    */
    @Override
    public void setPlannedFinishTime(java.util.Date plannedFinishTime) {
        _event.setPlannedFinishTime(plannedFinishTime);
    }

    /**
    * Returns the real starting time of this event.
    *
    * @return the real starting time of this event
    */
    @Override
    public java.util.Date getRealStartingTime() {
        return _event.getRealStartingTime();
    }

    /**
    * Sets the real starting time of this event.
    *
    * @param realStartingTime the real starting time of this event
    */
    @Override
    public void setRealStartingTime(java.util.Date realStartingTime) {
        _event.setRealStartingTime(realStartingTime);
    }

    /**
    * Returns the real finish time of this event.
    *
    * @return the real finish time of this event
    */
    @Override
    public java.util.Date getRealFinishTime() {
        return _event.getRealFinishTime();
    }

    /**
    * Sets the real finish time of this event.
    *
    * @param realFinishTime the real finish time of this event
    */
    @Override
    public void setRealFinishTime(java.util.Date realFinishTime) {
        _event.setRealFinishTime(realFinishTime);
    }

    @Override
    public boolean isNew() {
        return _event.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _event.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _event.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _event.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _event.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _event.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _event.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _event.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _event.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _event.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _event.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EventWrapper((Event) _event.clone());
    }

    @Override
    public int compareTo(es.eina.tfg.model.Event event) {
        return _event.compareTo(event);
    }

    @Override
    public int hashCode() {
        return _event.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<es.eina.tfg.model.Event> toCacheModel() {
        return _event.toCacheModel();
    }

    @Override
    public es.eina.tfg.model.Event toEscapedModel() {
        return new EventWrapper(_event.toEscapedModel());
    }

    @Override
    public es.eina.tfg.model.Event toUnescapedModel() {
        return new EventWrapper(_event.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _event.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _event.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _event.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EventWrapper)) {
            return false;
        }

        EventWrapper eventWrapper = (EventWrapper) obj;

        if (Validator.equals(_event, eventWrapper._event)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Event getWrappedEvent() {
        return _event;
    }

    @Override
    public Event getWrappedModel() {
        return _event;
    }

    @Override
    public void resetOriginalValues() {
        _event.resetOriginalValues();
    }
}
