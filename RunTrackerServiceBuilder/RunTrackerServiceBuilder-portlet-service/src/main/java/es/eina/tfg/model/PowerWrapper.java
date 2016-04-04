package es.eina.tfg.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Power}.
 * </p>
 *
 * @author adelrioj
 * @see Power
 * @generated
 */
public class PowerWrapper implements Power, ModelWrapper<Power> {
    private Power _power;

    public PowerWrapper(Power power) {
        _power = power;
    }

    @Override
    public Class<?> getModelClass() {
        return Power.class;
    }

    @Override
    public String getModelClassName() {
        return Power.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("measurementId", getMeasurementId());
        attributes.put("raceId", getRaceId());
        attributes.put("userId", getUserId());
        attributes.put("deviceId", getDeviceId());
        attributes.put("sensorId", getSensorId());
        attributes.put("time", getTime());
        attributes.put("sensorMode", getSensorMode());
        attributes.put("level", getLevel());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long measurementId = (Long) attributes.get("measurementId");

        if (measurementId != null) {
            setMeasurementId(measurementId);
        }

        Long raceId = (Long) attributes.get("raceId");

        if (raceId != null) {
            setRaceId(raceId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        Long deviceId = (Long) attributes.get("deviceId");

        if (deviceId != null) {
            setDeviceId(deviceId);
        }

        Long sensorId = (Long) attributes.get("sensorId");

        if (sensorId != null) {
            setSensorId(sensorId);
        }

        Date time = (Date) attributes.get("time");

        if (time != null) {
            setTime(time);
        }

        String sensorMode = (String) attributes.get("sensorMode");

        if (sensorMode != null) {
            setSensorMode(sensorMode);
        }

        Integer level = (Integer) attributes.get("level");

        if (level != null) {
            setLevel(level);
        }
    }

    /**
    * Returns the primary key of this power.
    *
    * @return the primary key of this power
    */
    @Override
    public long getPrimaryKey() {
        return _power.getPrimaryKey();
    }

    /**
    * Sets the primary key of this power.
    *
    * @param primaryKey the primary key of this power
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _power.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the measurement ID of this power.
    *
    * @return the measurement ID of this power
    */
    @Override
    public long getMeasurementId() {
        return _power.getMeasurementId();
    }

    /**
    * Sets the measurement ID of this power.
    *
    * @param measurementId the measurement ID of this power
    */
    @Override
    public void setMeasurementId(long measurementId) {
        _power.setMeasurementId(measurementId);
    }

    /**
    * Returns the race ID of this power.
    *
    * @return the race ID of this power
    */
    @Override
    public long getRaceId() {
        return _power.getRaceId();
    }

    /**
    * Sets the race ID of this power.
    *
    * @param raceId the race ID of this power
    */
    @Override
    public void setRaceId(long raceId) {
        _power.setRaceId(raceId);
    }

    /**
    * Returns the user ID of this power.
    *
    * @return the user ID of this power
    */
    @Override
    public long getUserId() {
        return _power.getUserId();
    }

    /**
    * Sets the user ID of this power.
    *
    * @param userId the user ID of this power
    */
    @Override
    public void setUserId(long userId) {
        _power.setUserId(userId);
    }

    /**
    * Returns the user uuid of this power.
    *
    * @return the user uuid of this power
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _power.getUserUuid();
    }

    /**
    * Sets the user uuid of this power.
    *
    * @param userUuid the user uuid of this power
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _power.setUserUuid(userUuid);
    }

    /**
    * Returns the device ID of this power.
    *
    * @return the device ID of this power
    */
    @Override
    public long getDeviceId() {
        return _power.getDeviceId();
    }

    /**
    * Sets the device ID of this power.
    *
    * @param deviceId the device ID of this power
    */
    @Override
    public void setDeviceId(long deviceId) {
        _power.setDeviceId(deviceId);
    }

    /**
    * Returns the sensor ID of this power.
    *
    * @return the sensor ID of this power
    */
    @Override
    public long getSensorId() {
        return _power.getSensorId();
    }

    /**
    * Sets the sensor ID of this power.
    *
    * @param sensorId the sensor ID of this power
    */
    @Override
    public void setSensorId(long sensorId) {
        _power.setSensorId(sensorId);
    }

    /**
    * Returns the time of this power.
    *
    * @return the time of this power
    */
    @Override
    public java.util.Date getTime() {
        return _power.getTime();
    }

    /**
    * Sets the time of this power.
    *
    * @param time the time of this power
    */
    @Override
    public void setTime(java.util.Date time) {
        _power.setTime(time);
    }

    /**
    * Returns the sensor mode of this power.
    *
    * @return the sensor mode of this power
    */
    @Override
    public java.lang.String getSensorMode() {
        return _power.getSensorMode();
    }

    /**
    * Sets the sensor mode of this power.
    *
    * @param sensorMode the sensor mode of this power
    */
    @Override
    public void setSensorMode(java.lang.String sensorMode) {
        _power.setSensorMode(sensorMode);
    }

    /**
    * Returns the level of this power.
    *
    * @return the level of this power
    */
    @Override
    public int getLevel() {
        return _power.getLevel();
    }

    /**
    * Sets the level of this power.
    *
    * @param level the level of this power
    */
    @Override
    public void setLevel(int level) {
        _power.setLevel(level);
    }

    @Override
    public boolean isNew() {
        return _power.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _power.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _power.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _power.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _power.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _power.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _power.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _power.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _power.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _power.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _power.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new PowerWrapper((Power) _power.clone());
    }

    @Override
    public int compareTo(es.eina.tfg.model.Power power) {
        return _power.compareTo(power);
    }

    @Override
    public int hashCode() {
        return _power.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<es.eina.tfg.model.Power> toCacheModel() {
        return _power.toCacheModel();
    }

    @Override
    public es.eina.tfg.model.Power toEscapedModel() {
        return new PowerWrapper(_power.toEscapedModel());
    }

    @Override
    public es.eina.tfg.model.Power toUnescapedModel() {
        return new PowerWrapper(_power.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _power.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _power.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _power.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof PowerWrapper)) {
            return false;
        }

        PowerWrapper powerWrapper = (PowerWrapper) obj;

        if (Validator.equals(_power, powerWrapper._power)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Power getWrappedPower() {
        return _power;
    }

    @Override
    public Power getWrappedModel() {
        return _power;
    }

    @Override
    public void resetOriginalValues() {
        _power.resetOriginalValues();
    }
}
