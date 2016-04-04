package es.eina.tfg.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Location}.
 * </p>
 *
 * @author adelrioj
 * @see Location
 * @generated
 */
public class LocationWrapper implements Location, ModelWrapper<Location> {
    private Location _location;

    public LocationWrapper(Location location) {
        _location = location;
    }

    @Override
    public Class<?> getModelClass() {
        return Location.class;
    }

    @Override
    public String getModelClassName() {
        return Location.class.getName();
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
        attributes.put("sysRef", getSysRef());
        attributes.put("latitude", getLatitude());
        attributes.put("longitude", getLongitude());
        attributes.put("speed", getSpeed());
        attributes.put("distance", getDistance());
        attributes.put("altitude", getAltitude());

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

        Integer sysRef = (Integer) attributes.get("sysRef");

        if (sysRef != null) {
            setSysRef(sysRef);
        }

        Double latitude = (Double) attributes.get("latitude");

        if (latitude != null) {
            setLatitude(latitude);
        }

        Double longitude = (Double) attributes.get("longitude");

        if (longitude != null) {
            setLongitude(longitude);
        }

        Double speed = (Double) attributes.get("speed");

        if (speed != null) {
            setSpeed(speed);
        }

        Double distance = (Double) attributes.get("distance");

        if (distance != null) {
            setDistance(distance);
        }

        Double altitude = (Double) attributes.get("altitude");

        if (altitude != null) {
            setAltitude(altitude);
        }
    }

    /**
    * Returns the primary key of this location.
    *
    * @return the primary key of this location
    */
    @Override
    public long getPrimaryKey() {
        return _location.getPrimaryKey();
    }

    /**
    * Sets the primary key of this location.
    *
    * @param primaryKey the primary key of this location
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _location.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the measurement ID of this location.
    *
    * @return the measurement ID of this location
    */
    @Override
    public long getMeasurementId() {
        return _location.getMeasurementId();
    }

    /**
    * Sets the measurement ID of this location.
    *
    * @param measurementId the measurement ID of this location
    */
    @Override
    public void setMeasurementId(long measurementId) {
        _location.setMeasurementId(measurementId);
    }

    /**
    * Returns the race ID of this location.
    *
    * @return the race ID of this location
    */
    @Override
    public java.lang.Long getRaceId() {
        return _location.getRaceId();
    }

    /**
    * Sets the race ID of this location.
    *
    * @param raceId the race ID of this location
    */
    @Override
    public void setRaceId(java.lang.Long raceId) {
        _location.setRaceId(raceId);
    }

    /**
    * Returns the user ID of this location.
    *
    * @return the user ID of this location
    */
    @Override
    public long getUserId() {
        return _location.getUserId();
    }

    /**
    * Sets the user ID of this location.
    *
    * @param userId the user ID of this location
    */
    @Override
    public void setUserId(long userId) {
        _location.setUserId(userId);
    }

    /**
    * Returns the user uuid of this location.
    *
    * @return the user uuid of this location
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _location.getUserUuid();
    }

    /**
    * Sets the user uuid of this location.
    *
    * @param userUuid the user uuid of this location
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _location.setUserUuid(userUuid);
    }

    /**
    * Returns the device ID of this location.
    *
    * @return the device ID of this location
    */
    @Override
    public long getDeviceId() {
        return _location.getDeviceId();
    }

    /**
    * Sets the device ID of this location.
    *
    * @param deviceId the device ID of this location
    */
    @Override
    public void setDeviceId(long deviceId) {
        _location.setDeviceId(deviceId);
    }

    /**
    * Returns the sensor ID of this location.
    *
    * @return the sensor ID of this location
    */
    @Override
    public long getSensorId() {
        return _location.getSensorId();
    }

    /**
    * Sets the sensor ID of this location.
    *
    * @param sensorId the sensor ID of this location
    */
    @Override
    public void setSensorId(long sensorId) {
        _location.setSensorId(sensorId);
    }

    /**
    * Returns the time of this location.
    *
    * @return the time of this location
    */
    @Override
    public java.util.Date getTime() {
        return _location.getTime();
    }

    /**
    * Sets the time of this location.
    *
    * @param time the time of this location
    */
    @Override
    public void setTime(java.util.Date time) {
        _location.setTime(time);
    }

    /**
    * Returns the sensor mode of this location.
    *
    * @return the sensor mode of this location
    */
    @Override
    public java.lang.String getSensorMode() {
        return _location.getSensorMode();
    }

    /**
    * Sets the sensor mode of this location.
    *
    * @param sensorMode the sensor mode of this location
    */
    @Override
    public void setSensorMode(java.lang.String sensorMode) {
        _location.setSensorMode(sensorMode);
    }

    /**
    * Returns the sys ref of this location.
    *
    * @return the sys ref of this location
    */
    @Override
    public int getSysRef() {
        return _location.getSysRef();
    }

    /**
    * Sets the sys ref of this location.
    *
    * @param sysRef the sys ref of this location
    */
    @Override
    public void setSysRef(int sysRef) {
        _location.setSysRef(sysRef);
    }

    /**
    * Returns the latitude of this location.
    *
    * @return the latitude of this location
    */
    @Override
    public double getLatitude() {
        return _location.getLatitude();
    }

    /**
    * Sets the latitude of this location.
    *
    * @param latitude the latitude of this location
    */
    @Override
    public void setLatitude(double latitude) {
        _location.setLatitude(latitude);
    }

    /**
    * Returns the longitude of this location.
    *
    * @return the longitude of this location
    */
    @Override
    public double getLongitude() {
        return _location.getLongitude();
    }

    /**
    * Sets the longitude of this location.
    *
    * @param longitude the longitude of this location
    */
    @Override
    public void setLongitude(double longitude) {
        _location.setLongitude(longitude);
    }

    /**
    * Returns the speed of this location.
    *
    * @return the speed of this location
    */
    @Override
    public double getSpeed() {
        return _location.getSpeed();
    }

    /**
    * Sets the speed of this location.
    *
    * @param speed the speed of this location
    */
    @Override
    public void setSpeed(double speed) {
        _location.setSpeed(speed);
    }

    /**
    * Returns the distance of this location.
    *
    * @return the distance of this location
    */
    @Override
    public double getDistance() {
        return _location.getDistance();
    }

    /**
    * Sets the distance of this location.
    *
    * @param distance the distance of this location
    */
    @Override
    public void setDistance(double distance) {
        _location.setDistance(distance);
    }

    /**
    * Returns the altitude of this location.
    *
    * @return the altitude of this location
    */
    @Override
    public double getAltitude() {
        return _location.getAltitude();
    }

    /**
    * Sets the altitude of this location.
    *
    * @param altitude the altitude of this location
    */
    @Override
    public void setAltitude(double altitude) {
        _location.setAltitude(altitude);
    }

    @Override
    public boolean isNew() {
        return _location.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _location.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _location.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _location.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _location.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _location.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _location.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _location.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _location.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _location.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _location.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new LocationWrapper((Location) _location.clone());
    }

    @Override
    public int compareTo(es.eina.tfg.model.Location location) {
        return _location.compareTo(location);
    }

    @Override
    public int hashCode() {
        return _location.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<es.eina.tfg.model.Location> toCacheModel() {
        return _location.toCacheModel();
    }

    @Override
    public es.eina.tfg.model.Location toEscapedModel() {
        return new LocationWrapper(_location.toEscapedModel());
    }

    @Override
    public es.eina.tfg.model.Location toUnescapedModel() {
        return new LocationWrapper(_location.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _location.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _location.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _location.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof LocationWrapper)) {
            return false;
        }

        LocationWrapper locationWrapper = (LocationWrapper) obj;

        if (Validator.equals(_location, locationWrapper._location)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Location getWrappedLocation() {
        return _location;
    }

    @Override
    public Location getWrappedModel() {
        return _location;
    }

    @Override
    public void resetOriginalValues() {
        _location.resetOriginalValues();
    }
}
