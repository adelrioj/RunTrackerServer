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

        attributes.put("idRace", getIdRace());
        attributes.put("idMeasurement", getIdMeasurement());
        attributes.put("idDevice", getIdDevice());
        attributes.put("idSensor", getIdSensor());
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
        Long idRace = (Long) attributes.get("idRace");

        if (idRace != null) {
            setIdRace(idRace);
        }

        Long idMeasurement = (Long) attributes.get("idMeasurement");

        if (idMeasurement != null) {
            setIdMeasurement(idMeasurement);
        }

        Long idDevice = (Long) attributes.get("idDevice");

        if (idDevice != null) {
            setIdDevice(idDevice);
        }

        Long idSensor = (Long) attributes.get("idSensor");

        if (idSensor != null) {
            setIdSensor(idSensor);
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
    public es.eina.tfg.service.persistence.LocationPK getPrimaryKey() {
        return _location.getPrimaryKey();
    }

    /**
    * Sets the primary key of this location.
    *
    * @param primaryKey the primary key of this location
    */
    @Override
    public void setPrimaryKey(
        es.eina.tfg.service.persistence.LocationPK primaryKey) {
        _location.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the id race of this location.
    *
    * @return the id race of this location
    */
    @Override
    public java.lang.Long getIdRace() {
        return _location.getIdRace();
    }

    /**
    * Sets the id race of this location.
    *
    * @param idRace the id race of this location
    */
    @Override
    public void setIdRace(java.lang.Long idRace) {
        _location.setIdRace(idRace);
    }

    /**
    * Returns the id measurement of this location.
    *
    * @return the id measurement of this location
    */
    @Override
    public long getIdMeasurement() {
        return _location.getIdMeasurement();
    }

    /**
    * Sets the id measurement of this location.
    *
    * @param idMeasurement the id measurement of this location
    */
    @Override
    public void setIdMeasurement(long idMeasurement) {
        _location.setIdMeasurement(idMeasurement);
    }

    /**
    * Returns the id device of this location.
    *
    * @return the id device of this location
    */
    @Override
    public long getIdDevice() {
        return _location.getIdDevice();
    }

    /**
    * Sets the id device of this location.
    *
    * @param idDevice the id device of this location
    */
    @Override
    public void setIdDevice(long idDevice) {
        _location.setIdDevice(idDevice);
    }

    /**
    * Returns the id sensor of this location.
    *
    * @return the id sensor of this location
    */
    @Override
    public long getIdSensor() {
        return _location.getIdSensor();
    }

    /**
    * Sets the id sensor of this location.
    *
    * @param idSensor the id sensor of this location
    */
    @Override
    public void setIdSensor(long idSensor) {
        _location.setIdSensor(idSensor);
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
