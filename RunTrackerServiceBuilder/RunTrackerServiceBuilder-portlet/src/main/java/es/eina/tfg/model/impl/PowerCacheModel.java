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
    public long idMeasurement;
    public Long idRace;
    public long idDevice;
    public long idSensor;
    public long time;
    public String sensorMode;
    public int level;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(15);

        sb.append("{idMeasurement=");
        sb.append(idMeasurement);
        sb.append(", idRace=");
        sb.append(idRace);
        sb.append(", idDevice=");
        sb.append(idDevice);
        sb.append(", idSensor=");
        sb.append(idSensor);
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

        powerImpl.setIdMeasurement(idMeasurement);
        powerImpl.setIdRace(idRace);
        powerImpl.setIdDevice(idDevice);
        powerImpl.setIdSensor(idSensor);

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
        idMeasurement = objectInput.readLong();
        idRace = objectInput.readLong();
        idDevice = objectInput.readLong();
        idSensor = objectInput.readLong();
        time = objectInput.readLong();
        sensorMode = objectInput.readUTF();
        level = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(idMeasurement);
        objectOutput.writeLong(idRace);
        objectOutput.writeLong(idDevice);
        objectOutput.writeLong(idSensor);
        objectOutput.writeLong(time);

        if (sensorMode == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(sensorMode);
        }

        objectOutput.writeInt(level);
    }
}
