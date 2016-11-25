package es.eina.tfg.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import es.eina.tfg.service.ClpSerializer;
import es.eina.tfg.service.LocationLocalServiceUtil;
import es.eina.tfg.service.persistence.LocationPK;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class LocationClp extends BaseModelImpl<Location> implements Location {
    private Long _idRace;
    private long _idMeasurement;
    private long _idDevice;
    private long _idSensor;
    private Date _time;
    private String _sensorMode;
    private int _sysRef;
    private double _latitude;
    private double _longitude;
    private double _speed;
    private double _distance;
    private double _altitude;
    private BaseModel<?> _locationRemoteModel;
    private Class<?> _clpSerializerClass = es.eina.tfg.service.ClpSerializer.class;

    public LocationClp() {
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
    public LocationPK getPrimaryKey() {
        return new LocationPK(_idRace, _idMeasurement);
    }

    @Override
    public void setPrimaryKey(LocationPK primaryKey) {
        setIdRace(primaryKey.idRace);
        setIdMeasurement(primaryKey.idMeasurement);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return new LocationPK(_idRace, _idMeasurement);
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((LocationPK) primaryKeyObj);
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

    @Override
    public Long getIdRace() {
        return _idRace;
    }

    @Override
    public void setIdRace(Long idRace) {
        _idRace = idRace;

        if (_locationRemoteModel != null) {
            try {
                Class<?> clazz = _locationRemoteModel.getClass();

                Method method = clazz.getMethod("setIdRace", Long.class);

                method.invoke(_locationRemoteModel, idRace);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getIdMeasurement() {
        return _idMeasurement;
    }

    @Override
    public void setIdMeasurement(long idMeasurement) {
        _idMeasurement = idMeasurement;

        if (_locationRemoteModel != null) {
            try {
                Class<?> clazz = _locationRemoteModel.getClass();

                Method method = clazz.getMethod("setIdMeasurement", long.class);

                method.invoke(_locationRemoteModel, idMeasurement);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getIdDevice() {
        return _idDevice;
    }

    @Override
    public void setIdDevice(long idDevice) {
        _idDevice = idDevice;

        if (_locationRemoteModel != null) {
            try {
                Class<?> clazz = _locationRemoteModel.getClass();

                Method method = clazz.getMethod("setIdDevice", long.class);

                method.invoke(_locationRemoteModel, idDevice);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getIdSensor() {
        return _idSensor;
    }

    @Override
    public void setIdSensor(long idSensor) {
        _idSensor = idSensor;

        if (_locationRemoteModel != null) {
            try {
                Class<?> clazz = _locationRemoteModel.getClass();

                Method method = clazz.getMethod("setIdSensor", long.class);

                method.invoke(_locationRemoteModel, idSensor);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getTime() {
        return _time;
    }

    @Override
    public void setTime(Date time) {
        _time = time;

        if (_locationRemoteModel != null) {
            try {
                Class<?> clazz = _locationRemoteModel.getClass();

                Method method = clazz.getMethod("setTime", Date.class);

                method.invoke(_locationRemoteModel, time);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getSensorMode() {
        return _sensorMode;
    }

    @Override
    public void setSensorMode(String sensorMode) {
        _sensorMode = sensorMode;

        if (_locationRemoteModel != null) {
            try {
                Class<?> clazz = _locationRemoteModel.getClass();

                Method method = clazz.getMethod("setSensorMode", String.class);

                method.invoke(_locationRemoteModel, sensorMode);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getSysRef() {
        return _sysRef;
    }

    @Override
    public void setSysRef(int sysRef) {
        _sysRef = sysRef;

        if (_locationRemoteModel != null) {
            try {
                Class<?> clazz = _locationRemoteModel.getClass();

                Method method = clazz.getMethod("setSysRef", int.class);

                method.invoke(_locationRemoteModel, sysRef);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getLatitude() {
        return _latitude;
    }

    @Override
    public void setLatitude(double latitude) {
        _latitude = latitude;

        if (_locationRemoteModel != null) {
            try {
                Class<?> clazz = _locationRemoteModel.getClass();

                Method method = clazz.getMethod("setLatitude", double.class);

                method.invoke(_locationRemoteModel, latitude);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getLongitude() {
        return _longitude;
    }

    @Override
    public void setLongitude(double longitude) {
        _longitude = longitude;

        if (_locationRemoteModel != null) {
            try {
                Class<?> clazz = _locationRemoteModel.getClass();

                Method method = clazz.getMethod("setLongitude", double.class);

                method.invoke(_locationRemoteModel, longitude);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getSpeed() {
        return _speed;
    }

    @Override
    public void setSpeed(double speed) {
        _speed = speed;

        if (_locationRemoteModel != null) {
            try {
                Class<?> clazz = _locationRemoteModel.getClass();

                Method method = clazz.getMethod("setSpeed", double.class);

                method.invoke(_locationRemoteModel, speed);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getDistance() {
        return _distance;
    }

    @Override
    public void setDistance(double distance) {
        _distance = distance;

        if (_locationRemoteModel != null) {
            try {
                Class<?> clazz = _locationRemoteModel.getClass();

                Method method = clazz.getMethod("setDistance", double.class);

                method.invoke(_locationRemoteModel, distance);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getAltitude() {
        return _altitude;
    }

    @Override
    public void setAltitude(double altitude) {
        _altitude = altitude;

        if (_locationRemoteModel != null) {
            try {
                Class<?> clazz = _locationRemoteModel.getClass();

                Method method = clazz.getMethod("setAltitude", double.class);

                method.invoke(_locationRemoteModel, altitude);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getLocationRemoteModel() {
        return _locationRemoteModel;
    }

    public void setLocationRemoteModel(BaseModel<?> locationRemoteModel) {
        _locationRemoteModel = locationRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _locationRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_locationRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            LocationLocalServiceUtil.addLocation(this);
        } else {
            LocationLocalServiceUtil.updateLocation(this);
        }
    }

    @Override
    public Location toEscapedModel() {
        return (Location) ProxyUtil.newProxyInstance(Location.class.getClassLoader(),
            new Class[] { Location.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        LocationClp clone = new LocationClp();

        clone.setIdRace(getIdRace());
        clone.setIdMeasurement(getIdMeasurement());
        clone.setIdDevice(getIdDevice());
        clone.setIdSensor(getIdSensor());
        clone.setTime(getTime());
        clone.setSensorMode(getSensorMode());
        clone.setSysRef(getSysRef());
        clone.setLatitude(getLatitude());
        clone.setLongitude(getLongitude());
        clone.setSpeed(getSpeed());
        clone.setDistance(getDistance());
        clone.setAltitude(getAltitude());

        return clone;
    }

    @Override
    public int compareTo(Location location) {
        int value = 0;

        value = DateUtil.compareTo(getTime(), location.getTime());

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof LocationClp)) {
            return false;
        }

        LocationClp location = (LocationClp) obj;

        LocationPK primaryKey = location.getPrimaryKey();

        if (getPrimaryKey().equals(primaryKey)) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return getPrimaryKey().hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(25);

        sb.append("{idRace=");
        sb.append(getIdRace());
        sb.append(", idMeasurement=");
        sb.append(getIdMeasurement());
        sb.append(", idDevice=");
        sb.append(getIdDevice());
        sb.append(", idSensor=");
        sb.append(getIdSensor());
        sb.append(", time=");
        sb.append(getTime());
        sb.append(", sensorMode=");
        sb.append(getSensorMode());
        sb.append(", sysRef=");
        sb.append(getSysRef());
        sb.append(", latitude=");
        sb.append(getLatitude());
        sb.append(", longitude=");
        sb.append(getLongitude());
        sb.append(", speed=");
        sb.append(getSpeed());
        sb.append(", distance=");
        sb.append(getDistance());
        sb.append(", altitude=");
        sb.append(getAltitude());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(40);

        sb.append("<model><model-name>");
        sb.append("es.eina.tfg.model.Location");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>idRace</column-name><column-value><![CDATA[");
        sb.append(getIdRace());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>idMeasurement</column-name><column-value><![CDATA[");
        sb.append(getIdMeasurement());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>idDevice</column-name><column-value><![CDATA[");
        sb.append(getIdDevice());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>idSensor</column-name><column-value><![CDATA[");
        sb.append(getIdSensor());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>time</column-name><column-value><![CDATA[");
        sb.append(getTime());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>sensorMode</column-name><column-value><![CDATA[");
        sb.append(getSensorMode());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>sysRef</column-name><column-value><![CDATA[");
        sb.append(getSysRef());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>latitude</column-name><column-value><![CDATA[");
        sb.append(getLatitude());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>longitude</column-name><column-value><![CDATA[");
        sb.append(getLongitude());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>speed</column-name><column-value><![CDATA[");
        sb.append(getSpeed());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>distance</column-name><column-value><![CDATA[");
        sb.append(getDistance());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>altitude</column-name><column-value><![CDATA[");
        sb.append(getAltitude());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
