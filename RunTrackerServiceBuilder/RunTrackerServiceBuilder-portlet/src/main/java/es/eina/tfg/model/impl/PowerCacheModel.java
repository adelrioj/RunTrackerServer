package es.eina.tfg.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import es.eina.tfg.model.Power;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Power in entity cache.
 *
 * @author adelrioj
 * @see Power
 * @generated
 */
public class PowerCacheModel implements CacheModel<Power>, Externalizable {
    public long measurementId;
    public long raceId;
    public long userId;
    public long deviceId;
    public long sensorId;
    public long time;
    public String sensorMode;
    public int level;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(17);

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
        sb.append(", level=");
        sb.append(level);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Power toEntityModel() {
        PowerImpl powerImpl = new PowerImpl();

        powerImpl.setMeasurementId(measurementId);
        powerImpl.setRaceId(raceId);
        powerImpl.setUserId(userId);
        powerImpl.setDeviceId(deviceId);
        powerImpl.setSensorId(sensorId);

        if (time == Long.MIN_VALUE) {
            powerImpl.setTime(null);
        } else {
            powerImpl.setTime(new Date(time));
        }

        if (sensorMode == null) {
            powerImpl.setSensorMode(StringPool.BLANK);
        } else {
            powerImpl.setSensorMode(sensorMode);
        }

        powerImpl.setLevel(level);

        powerImpl.resetOriginalValues();

        return powerImpl;
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
        level = objectInput.readInt();
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

        objectOutput.writeInt(level);
    }
}
