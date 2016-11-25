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

        attributes.put("idMeasurement", getIdMeasurement());
        attributes.put("idRace", getIdRace());
        attributes.put("idDevice", getIdDevice());
        attributes.put("idSensor", getIdSensor());
        attributes.put("time", getTime());
        attributes.put("sensorMode", getSensorMode());
        attributes.put("level", getLevel());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long idMeasurement = (Long) attributes.get("idMeasurement");

        if (idMeasurement != null) {
            setIdMeasurement(idMeasurement);
        }

        Long idRace = (Long) attributes.get("idRace");

        if (idRace != null) {
            setIdRace(idRace);
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
    public es.eina.tfg.service.persistence.PowerPK getPrimaryKey() {
        return _power.getPrimaryKey();
    }

    /**
    * Sets the primary key of this power.
    *
    * @param primaryKey the primary key of this power
    */
    @Override
    public void setPrimaryKey(
        es.eina.tfg.service.persistence.PowerPK primaryKey) {
        _power.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the id measurement of this power.
    *
    * @return the id measurement of this power
    */
    @Override
    public long getIdMeasurement() {
        return _power.getIdMeasurement();
    }

    /**
    * Sets the id measurement of this power.
    *
    * @param idMeasurement the id measurement of this power
    */
    @Override
    public void setIdMeasurement(long idMeasurement) {
        _power.setIdMeasurement(idMeasurement);
    }

    /**
    * Returns the id race of this power.
    *
    * @return the id race of this power
    */
    @Override
    public java.lang.Long getIdRace() {
        return _power.getIdRace();
    }

    /**
    * Sets the id race of this power.
    *
    * @param idRace the id race of this power
    */
    @Override
    public void setIdRace(java.lang.Long idRace) {
        _power.setIdRace(idRace);
    }

    /**
    * Returns the id device of this power.
    *
    * @return the id device of this power
    */
    @Override
    public long getIdDevice() {
        return _power.getIdDevice();
    }

    /**
    * Sets the id device of this power.
    *
    * @param idDevice the id device of this power
    */
    @Override
    public void setIdDevice(long idDevice) {
        _power.setIdDevice(idDevice);
    }

    /**
    * Returns the id sensor of this power.
    *
    * @return the id sensor of this power
    */
    @Override
    public long getIdSensor() {
        return _power.getIdSensor();
    }

    /**
    * Sets the id sensor of this power.
    *
    * @param idSensor the id sensor of this power
    */
    @Override
    public void setIdSensor(long idSensor) {
        _power.setIdSensor(idSensor);
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
