package es.eina.tfg.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Race}.
 * </p>
 *
 * @author adelrioj
 * @see Race
 * @generated
 */
public class RaceWrapper implements Race, ModelWrapper<Race> {
    private Race _race;

    public RaceWrapper(Race race) {
        _race = race;
    }

    @Override
    public Class<?> getModelClass() {
        return Race.class;
    }

    @Override
    public String getModelClassName() {
        return Race.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("raceId", getRaceId());
        attributes.put("userId", getUserId());
        attributes.put("routeId", getRouteId());
        attributes.put("type", getType());
        attributes.put("userHeight", getUserHeight());
        attributes.put("userWeight", getUserWeight());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long raceId = (Long) attributes.get("raceId");

        if (raceId != null) {
            setRaceId(raceId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        Long routeId = (Long) attributes.get("routeId");

        if (routeId != null) {
            setRouteId(routeId);
        }

        String type = (String) attributes.get("type");

        if (type != null) {
            setType(type);
        }

        Integer userHeight = (Integer) attributes.get("userHeight");

        if (userHeight != null) {
            setUserHeight(userHeight);
        }

        Integer userWeight = (Integer) attributes.get("userWeight");

        if (userWeight != null) {
            setUserWeight(userWeight);
        }
    }

    /**
    * Returns the primary key of this race.
    *
    * @return the primary key of this race
    */
    @Override
    public long getPrimaryKey() {
        return _race.getPrimaryKey();
    }

    /**
    * Sets the primary key of this race.
    *
    * @param primaryKey the primary key of this race
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _race.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the race ID of this race.
    *
    * @return the race ID of this race
    */
    @Override
    public long getRaceId() {
        return _race.getRaceId();
    }

    /**
    * Sets the race ID of this race.
    *
    * @param raceId the race ID of this race
    */
    @Override
    public void setRaceId(long raceId) {
        _race.setRaceId(raceId);
    }

    /**
    * Returns the user ID of this race.
    *
    * @return the user ID of this race
    */
    @Override
    public long getUserId() {
        return _race.getUserId();
    }

    /**
    * Sets the user ID of this race.
    *
    * @param userId the user ID of this race
    */
    @Override
    public void setUserId(long userId) {
        _race.setUserId(userId);
    }

    /**
    * Returns the user uuid of this race.
    *
    * @return the user uuid of this race
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _race.getUserUuid();
    }

    /**
    * Sets the user uuid of this race.
    *
    * @param userUuid the user uuid of this race
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _race.setUserUuid(userUuid);
    }

    /**
    * Returns the route ID of this race.
    *
    * @return the route ID of this race
    */
    @Override
    public long getRouteId() {
        return _race.getRouteId();
    }

    /**
    * Sets the route ID of this race.
    *
    * @param routeId the route ID of this race
    */
    @Override
    public void setRouteId(long routeId) {
        _race.setRouteId(routeId);
    }

    /**
    * Returns the type of this race.
    *
    * @return the type of this race
    */
    @Override
    public java.lang.String getType() {
        return _race.getType();
    }

    /**
    * Sets the type of this race.
    *
    * @param type the type of this race
    */
    @Override
    public void setType(java.lang.String type) {
        _race.setType(type);
    }

    /**
    * Returns the user height of this race.
    *
    * @return the user height of this race
    */
    @Override
    public int getUserHeight() {
        return _race.getUserHeight();
    }

    /**
    * Sets the user height of this race.
    *
    * @param userHeight the user height of this race
    */
    @Override
    public void setUserHeight(int userHeight) {
        _race.setUserHeight(userHeight);
    }

    /**
    * Returns the user weight of this race.
    *
    * @return the user weight of this race
    */
    @Override
    public int getUserWeight() {
        return _race.getUserWeight();
    }

    /**
    * Sets the user weight of this race.
    *
    * @param userWeight the user weight of this race
    */
    @Override
    public void setUserWeight(int userWeight) {
        _race.setUserWeight(userWeight);
    }

    @Override
    public boolean isNew() {
        return _race.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _race.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _race.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _race.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _race.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _race.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _race.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _race.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _race.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _race.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _race.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new RaceWrapper((Race) _race.clone());
    }

    @Override
    public int compareTo(es.eina.tfg.model.Race race) {
        return _race.compareTo(race);
    }

    @Override
    public int hashCode() {
        return _race.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<es.eina.tfg.model.Race> toCacheModel() {
        return _race.toCacheModel();
    }

    @Override
    public es.eina.tfg.model.Race toEscapedModel() {
        return new RaceWrapper(_race.toEscapedModel());
    }

    @Override
    public es.eina.tfg.model.Race toUnescapedModel() {
        return new RaceWrapper(_race.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _race.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _race.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _race.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof RaceWrapper)) {
            return false;
        }

        RaceWrapper raceWrapper = (RaceWrapper) obj;

        if (Validator.equals(_race, raceWrapper._race)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Race getWrappedRace() {
        return _race;
    }

    @Override
    public Race getWrappedModel() {
        return _race;
    }

    @Override
    public void resetOriginalValues() {
        _race.resetOriginalValues();
    }
}
