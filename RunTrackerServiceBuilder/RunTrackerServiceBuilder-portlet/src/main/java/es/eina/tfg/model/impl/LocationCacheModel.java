package es.eina.tfg.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import es.eina.tfg.model.Location;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Location in entity cache.
 *
 * @author adelrioj
 * @see Location
 * @generated
 */
public class LocationCacheModel implements CacheModel<Location>, Externalizable {
    public long measurementId;
    public Long raceId;
    public long userId;
    public long deviceId;
    public long sensorId;
    public long time;
    public String sensorMode;
    public int sysRef;
    public double latitude;
    public double longitude;
    public double speed;
    public double distance;
    public double altitude;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(27);

        sb.append("{measurementId=");
        sb.append(measurementId);
        sb.append(", raceId=");
        sb.append(raceId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", deviceId=");
        sb.append(deviceId);
        sb.append(", sensorId=");
        sb.append(sensorId);
        sb.append(", time=");
        sb.append(time);
        sb.append(", sensorMode=");
        sb.append(sensorMode);
        sb.append(", sysRef=");
        sb.append(sysRef);
        sb.append(", latitude=");
        sb.append(latitude);
        sb.append(", longitude=");
        sb.append(longitude);
        sb.append(", speed=");
        sb.append(speed);
        sb.append(", distance=");
        sb.append(distance);
        sb.append(", altitude=");
        sb.append(altitude);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Location toEntityModel() {
        LocationImpl locationImpl = new LocationImpl();

        locationImpl.setMeasurementId(measurementId);
        locationImpl.setRaceId(raceId);
        locationImpl.setUserId(userId);
        locationImpl.setDeviceId(deviceId);
        locationImpl.setSensorId(sensorId);

        if (time == Long.MIN_VALUE) {
            locationImpl.setTime(null);
        } else {
            locationImpl.setTime(new Date(time));
        }

        if (sensorMode == null) {
            locationImpl.setSensorMode(StringPool.BLANK);
        } else {
            locationImpl.setSensorMode(sensorMode);
        }

        locationImpl.setSysRef(sysRef);
        locationImpl.setLatitude(latitude);
        locationImpl.setLongitude(longitude);
        locationImpl.setSpeed(speed);
        locationImpl.setDistance(distance);
        locationImpl.setAltitude(altitude);

        locationImpl.resetOriginalValues();

        return locationImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        measurementId = objectInput.readLong();
        raceId = objectInput.readLong();
        userId = objectInput.readLong();
        deviceId = objectInput.readLong();
        sensorId = objectInput.readLong();
        time = objectInput.readLong();
        sensorMode = objectInput.readUTF();
        sysRef = objectInput.readInt();
        latitude = objectInput.readDouble();
        longitude = objectInput.readDouble();
        speed = objectInput.readDouble();
        distance = objectInput.readDouble();
        altitude = objectInput.readDouble();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(measurementId);
        objectOutput.writeLong(raceId);
        objectOutput.writeLong(userId);
        objectOutput.writeLong(deviceId);
        objectOutput.writeLong(sensorId);
        objectOutput.writeLong(time);

        if (sensorMode == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(sensorMode);
        }

        objectOutput.writeInt(sysRef);
        objectOutput.writeDouble(latitude);
        objectOutput.writeDouble(longitude);
        objectOutput.writeDouble(speed);
        objectOutput.writeDouble(distance);
        objectOutput.writeDouble(altitude);
    }
}
