package es.eina.tfg.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import es.eina.tfg.service.ClpSerializer;
import es.eina.tfg.service.LocationLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class LocationClp extends BaseModelImpl<Location> implements Location {
    private long _measurementId;
    private Long _raceId;
    private long _userId;
    private String _userUuid;
    private long _deviceId;
    private long _sensorId;
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
    public long getPrimaryKey() {
        return _measurementId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setMeasurementId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _measurementId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getMeasurementId() {
        return _measurementId;
    }

    @Override
    public void setMeasurementId(long measurementId) {
        _measurementId = measurementId;

        if (_locationRemoteModel != null) {
            try {
                Class<?> clazz = _locationRemoteModel.getClass();

                Method method = clazz.getMethod("setMeasurementId", long.class);

                method.invoke(_locationRemoteModel, measurementId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Long getRaceId() {
        return _raceId;
    }

    @Override
    public void setRaceId(Long raceId) {
        _raceId = raceId;

        if (_locationRemoteModel != null) {
            try {
                Class<?> clazz = _locationRemoteModel.getClass();

                Method method = clazz.getMethod("setRaceId", Long.class);

                method.invoke(_locationRemoteModel, raceId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;

        if (_locationRemoteModel != null) {
            try {
                Class<?> clazz = _locationRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_locationRemoteModel, userId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @Override
    public long getDeviceId() {
        return _deviceId;
    }

    @Override
    public void setDeviceId(long deviceId) {
        _deviceId = deviceId;

        if (_locationRemoteModel != null) {
            try {
                Class<?> clazz = _locationRemoteModel.getClass();

                Method method = clazz.getMethod("setDeviceId", long.class);

                method.invoke(_locationRemoteModel, deviceId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getSensorId() {
        return _sensorId;
    }

    @Override
    public void setSensorId(long sensorId) {
        _sensorId = sensorId;

        if (_locationRemoteModel != null) {
            try {
                Class<?> clazz = _locationRemoteModel.getClass();

                Method method = clazz.getMethod("setSensorId", long.class);

                method.invoke(_locationRemoteModel, sensorId);
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

        clone.setMeasurementId(getMeasurementId());
        clone.setRaceId(getRaceId());
        clone.setUserId(getUserId());
        clone.setDeviceId(getDeviceId());
        clone.setSensorId(getSensorId());
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

        long primaryKey = location.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
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
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(27);

        sb.append("{measurementId=");
        sb.append(getMeasurementId());
        sb.append(", raceId=");
        sb.append(getRaceId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", deviceId=");
        sb.append(getDeviceId());
        sb.append(", sensorId=");
        sb.append(getSensorId());
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
        StringBundler sb = new StringBundler(43);

        sb.append("<model><model-name>");
        sb.append("es.eina.tfg.model.Location");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>measurementId</column-name><column-value><![CDATA[");
        sb.append(getMeasurementId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>raceId</column-name><column-value><![CDATA[");
        sb.append(getRaceId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>deviceId</column-name><column-value><![CDATA[");
        sb.append(getDeviceId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>sensorId</column-name><column-value><![CDATA[");
        sb.append(getSensorId());
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
