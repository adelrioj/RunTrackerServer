package es.eina.tfg.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link UserAndEvent}.
 * </p>
 *
 * @author adelrioj
 * @see UserAndEvent
 * @generated
 */
public class UserAndEventWrapper implements UserAndEvent,
    ModelWrapper<UserAndEvent> {
    private UserAndEvent _userAndEvent;

    public UserAndEventWrapper(UserAndEvent userAndEvent) {
        _userAndEvent = userAndEvent;
    }

    @Override
    public Class<?> getModelClass() {
        return UserAndEvent.class;
    }

    @Override
    public String getModelClassName() {
        return UserAndEvent.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("idUser", getIdUser());
        attributes.put("idEvent", getIdEvent());
        attributes.put("idRace", getIdRace());
        attributes.put("participationNumber", getParticipationNumber());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long idUser = (Long) attributes.get("idUser");

        if (idUser != null) {
            setIdUser(idUser);
        }

        Long idEvent = (Long) attributes.get("idEvent");

        if (idEvent != null) {
            setIdEvent(idEvent);
        }

        Long idRace = (Long) attributes.get("idRace");

        if (idRace != null) {
            setIdRace(idRace);
        }

        Integer participationNumber = (Integer) attributes.get(
                "participationNumber");

        if (participationNumber != null) {
            setParticipationNumber(participationNumber);
        }
    }

    /**
    * Returns the primary key of this user and event.
    *
    * @return the primary key of this user and event
    */
    @Override
    public es.eina.tfg.service.persistence.UserAndEventPK getPrimaryKey() {
        return _userAndEvent.getPrimaryKey();
    }

    /**
    * Sets the primary key of this user and event.
    *
    * @param primaryKey the primary key of this user and event
    */
    @Override
    public void setPrimaryKey(
        es.eina.tfg.service.persistence.UserAndEventPK primaryKey) {
        _userAndEvent.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the id user of this user and event.
    *
    * @return the id user of this user and event
    */
    @Override
    public long getIdUser() {
        return _userAndEvent.getIdUser();
    }

    /**
    * Sets the id user of this user and event.
    *
    * @param idUser the id user of this user and event
    */
    @Override
    public void setIdUser(long idUser) {
        _userAndEvent.setIdUser(idUser);
    }

    /**
    * Returns the id event of this user and event.
    *
    * @return the id event of this user and event
    */
    @Override
    public long getIdEvent() {
        return _userAndEvent.getIdEvent();
    }

    /**
    * Sets the id event of this user and event.
    *
    * @param idEvent the id event of this user and event
    */
    @Override
    public void setIdEvent(long idEvent) {
        _userAndEvent.setIdEvent(idEvent);
    }

    /**
    * Returns the id race of this user and event.
    *
    * @return the id race of this user and event
    */
    @Override
    public long getIdRace() {
        return _userAndEvent.getIdRace();
    }

    /**
    * Sets the id race of this user and event.
    *
    * @param idRace the id race of this user and event
    */
    @Override
    public void setIdRace(long idRace) {
        _userAndEvent.setIdRace(idRace);
    }

    /**
    * Returns the participation number of this user and event.
    *
    * @return the participation number of this user and event
    */
    @Override
    public int getParticipationNumber() {
        return _userAndEvent.getParticipationNumber();
    }

    /**
    * Sets the participation number of this user and event.
    *
    * @param participationNumber the participation number of this user and event
    */
    @Override
    public void setParticipationNumber(int participationNumber) {
        _userAndEvent.setParticipationNumber(participationNumber);
    }

    @Override
    public boolean isNew() {
        return _userAndEvent.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _userAndEvent.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _userAndEvent.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _userAndEvent.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _userAndEvent.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _userAndEvent.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _userAndEvent.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _userAndEvent.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _userAndEvent.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _userAndEvent.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _userAndEvent.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new UserAndEventWrapper((UserAndEvent) _userAndEvent.clone());
    }

    @Override
    public int compareTo(es.eina.tfg.model.UserAndEvent userAndEvent) {
        return _userAndEvent.compareTo(userAndEvent);
    }

    @Override
    public int hashCode() {
        return _userAndEvent.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<es.eina.tfg.model.UserAndEvent> toCacheModel() {
        return _userAndEvent.toCacheModel();
    }

    @Override
    public es.eina.tfg.model.UserAndEvent toEscapedModel() {
        return new UserAndEventWrapper(_userAndEvent.toEscapedModel());
    }

    @Override
    public es.eina.tfg.model.UserAndEvent toUnescapedModel() {
        return new UserAndEventWrapper(_userAndEvent.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _userAndEvent.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _userAndEvent.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _userAndEvent.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof UserAndEventWrapper)) {
            return false;
        }

        UserAndEventWrapper userAndEventWrapper = (UserAndEventWrapper) obj;

        if (Validator.equals(_userAndEvent, userAndEventWrapper._userAndEvent)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public UserAndEvent getWrappedUserAndEvent() {
        return _userAndEvent;
    }

    @Override
    public UserAndEvent getWrappedModel() {
        return _userAndEvent;
    }

    @Override
    public void resetOriginalValues() {
        _userAndEvent.resetOriginalValues();
    }
}
