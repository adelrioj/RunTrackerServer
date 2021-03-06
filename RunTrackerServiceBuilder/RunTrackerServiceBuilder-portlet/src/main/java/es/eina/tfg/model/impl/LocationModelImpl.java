package es.eina.tfg.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import es.eina.tfg.model.Location;
import es.eina.tfg.model.LocationModel;
import es.eina.tfg.model.LocationSoap;
import es.eina.tfg.service.persistence.LocationPK;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Location service. Represents a row in the &quot;GL_Location&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link es.eina.tfg.model.LocationModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LocationImpl}.
 * </p>
 *
 * @author adelrioj
 * @see LocationImpl
 * @see es.eina.tfg.model.Location
 * @see es.eina.tfg.model.LocationModel
 * @generated
 */
@JSON(strict = true)
public class LocationModelImpl extends BaseModelImpl<Location>
    implements LocationModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a location model instance should use the {@link es.eina.tfg.model.Location} interface instead.
     */
    public static final String TABLE_NAME = "GL_Location";
    public static final Object[][] TABLE_COLUMNS = {
            { "idRace", Types.BIGINT },
            { "idMeasurement", Types.BIGINT },
            { "idDevice", Types.BIGINT },
            { "idSensor", Types.BIGINT },
            { "time_", Types.TIMESTAMP },
            { "sensorMode", Types.VARCHAR },
            { "sysRef", Types.INTEGER },
            { "latitude", Types.DOUBLE },
            { "longitude", Types.DOUBLE },
            { "speed", Types.DOUBLE },
            { "distance", Types.DOUBLE },
            { "altitude", Types.DOUBLE }
        };
    public static final String TABLE_SQL_CREATE = "create table GL_Location (idRace LONG not null,idMeasurement LONG not null,idDevice LONG,idSensor LONG,time_ DATE null,sensorMode VARCHAR(75) null,sysRef INTEGER,latitude DOUBLE,longitude DOUBLE,speed DOUBLE,distance DOUBLE,altitude DOUBLE,primary key (idRace, idMeasurement))";
    public static final String TABLE_SQL_DROP = "drop table GL_Location";
    public static final String ORDER_BY_JPQL = " ORDER BY location.time ASC";
    public static final String ORDER_BY_SQL = " ORDER BY GL_Location.time_ ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.es.eina.tfg.model.Location"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.es.eina.tfg.model.Location"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.es.eina.tfg.model.Location"),
            true);
    public static long IDRACE_COLUMN_BITMASK = 1L;
    public static long TIME_COLUMN_BITMASK = 2L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.es.eina.tfg.model.Location"));
    private static ClassLoader _classLoader = Location.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            Location.class
        };
    private Long _idRace;
    private Long _originalIdRace;
    private boolean _setOriginalIdRace;
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
    private long _columnBitmask;
    private Location _escapedModel;

    public LocationModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static Location toModel(LocationSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        Location model = new LocationImpl();

        model.setIdRace(soapModel.getIdRace());
        model.setIdMeasurement(soapModel.getIdMeasurement());
        model.setIdDevice(soapModel.getIdDevice());
        model.setIdSensor(soapModel.getIdSensor());
        model.setTime(soapModel.getTime());
        model.setSensorMode(soapModel.getSensorMode());
        model.setSysRef(soapModel.getSysRef());
        model.setLatitude(soapModel.getLatitude());
        model.setLongitude(soapModel.getLongitude());
        model.setSpeed(soapModel.getSpeed());
        model.setDistance(soapModel.getDistance());
        model.setAltitude(soapModel.getAltitude());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<Location> toModels(LocationSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<Location> models = new ArrayList<Location>(soapModels.length);

        for (LocationSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
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

    @JSON
    @Override
    public Long getIdRace() {
        return _idRace;
    }

    @Override
    public void setIdRace(Long idRace) {
        _columnBitmask |= IDRACE_COLUMN_BITMASK;

        if (!_setOriginalIdRace) {
            _setOriginalIdRace = true;

            _originalIdRace = _idRace;
        }

        _idRace = idRace;
    }

    public Long getOriginalIdRace() {
        return _originalIdRace;
    }

    @JSON
    @Override
    public long getIdMeasurement() {
        return _idMeasurement;
    }

    @Override
    public void setIdMeasurement(long idMeasurement) {
        _idMeasurement = idMeasurement;
    }

    @JSON
    @Override
    public long getIdDevice() {
        return _idDevice;
    }

    @Override
    public void setIdDevice(long idDevice) {
        _idDevice = idDevice;
    }

    @JSON
    @Override
    public long getIdSensor() {
        return _idSensor;
    }

    @Override
    public void setIdSensor(long idSensor) {
        _idSensor = idSensor;
    }

    @JSON
    @Override
    public Date getTime() {
        return _time;
    }

    @Override
    public void setTime(Date time) {
        _columnBitmask = -1L;

        _time = time;
    }

    @JSON
    @Override
    public String getSensorMode() {
        if (_sensorMode == null) {
            return StringPool.BLANK;
        } else {
            return _sensorMode;
        }
    }

    @Override
    public void setSensorMode(String sensorMode) {
        _sensorMode = sensorMode;
    }

    @JSON
    @Override
    public int getSysRef() {
        return _sysRef;
    }

    @Override
    public void setSysRef(int sysRef) {
        _sysRef = sysRef;
    }

    @JSON
    @Override
    public double getLatitude() {
        return _latitude;
    }

    @Override
    public void setLatitude(double latitude) {
        _latitude = latitude;
    }

    @JSON
    @Override
    public double getLongitude() {
        return _longitude;
    }

    @Override
    public void setLongitude(double longitude) {
        _longitude = longitude;
    }

    @JSON
    @Override
    public double getSpeed() {
        return _speed;
    }

    @Override
    public void setSpeed(double speed) {
        _speed = speed;
    }

    @JSON
    @Override
    public double getDistance() {
        return _distance;
    }

    @Override
    public void setDistance(double distance) {
        _distance = distance;
    }

    @JSON
    @Override
    public double getAltitude() {
        return _altitude;
    }

    @Override
    public void setAltitude(double altitude) {
        _altitude = altitude;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public Location toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (Location) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        LocationImpl locationImpl = new LocationImpl();

        locationImpl.setIdRace(getIdRace());
        locationImpl.setIdMeasurement(getIdMeasurement());
        locationImpl.setIdDevice(getIdDevice());
        locationImpl.setIdSensor(getIdSensor());
        locationImpl.setTime(getTime());
        locationImpl.setSensorMode(getSensorMode());
        locationImpl.setSysRef(getSysRef());
        locationImpl.setLatitude(getLatitude());
        locationImpl.setLongitude(getLongitude());
        locationImpl.setSpeed(getSpeed());
        locationImpl.setDistance(getDistance());
        locationImpl.setAltitude(getAltitude());

        locationImpl.resetOriginalValues();

        return locationImpl;
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

        if (!(obj instanceof Location)) {
            return false;
        }

        Location location = (Location) obj;

        LocationPK primaryKey = location.getPrimaryKey();

        if (getPrimaryKey().equals(primaryKey)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return getPrimaryKey().hashCode();
    }

    @Override
    public void resetOriginalValues() {
        LocationModelImpl locationModelImpl = this;

        locationModelImpl._originalIdRace = locationModelImpl._idRace;

        locationModelImpl._setOriginalIdRace = false;

        locationModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<Location> toCacheModel() {
        LocationCacheModel locationCacheModel = new LocationCacheModel();

        locationCacheModel.idRace = getIdRace();

        locationCacheModel.idMeasurement = getIdMeasurement();

        locationCacheModel.idDevice = getIdDevice();

        locationCacheModel.idSensor = getIdSensor();

        Date time = getTime();

        if (time != null) {
            locationCacheModel.time = time.getTime();
        } else {
            locationCacheModel.time = Long.MIN_VALUE;
        }

        locationCacheModel.sensorMode = getSensorMode();

        String sensorMode = locationCacheModel.sensorMode;

        if ((sensorMode != null) && (sensorMode.length() == 0)) {
            locationCacheModel.sensorMode = null;
        }

        locationCacheModel.sysRef = getSysRef();

        locationCacheModel.latitude = getLatitude();

        locationCacheModel.longitude = getLongitude();

        locationCacheModel.speed = getSpeed();

        locationCacheModel.distance = getDistance();

        locationCacheModel.altitude = getAltitude();

        return locationCacheModel;
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
