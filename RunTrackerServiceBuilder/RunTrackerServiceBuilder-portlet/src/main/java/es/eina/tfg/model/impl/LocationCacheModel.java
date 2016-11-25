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
    public Long idRace;
    public long idMeasurement;
    public long idDevice;
    public long idSensor;
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
        StringBundler sb = new StringBundler(25);

        sb.append("{idRace=");
        sb.append(idRace);
        sb.append(", idMeasurement=");
        sb.append(idMeasurement);
        sb.append(", idDevice=");
        sb.append(idDevice);
        sb.append(", idSensor=");
        sb.append(idSensor);
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

        locationImpl.setIdRace(idRace);
        locationImpl.setIdMeasurement(idMeasurement);
        locationImpl.setIdDevice(idDevice);
        locationImpl.setIdSensor(idSensor);

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
        idRace = objectInput.readLong();
        idMeasurement = objectInput.readLong();
        idDevice = objectInput.readLong();
        idSensor = objectInput.readLong();
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
        objectOutput.writeLong(idRace);
        objectOutput.writeLong(idMeasurement);
        objectOutput.writeLong(idDevice);
        objectOutput.writeLong(idSensor);
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
