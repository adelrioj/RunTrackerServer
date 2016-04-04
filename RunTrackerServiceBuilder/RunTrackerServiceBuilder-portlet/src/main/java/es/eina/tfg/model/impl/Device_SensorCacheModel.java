package es.eina.tfg.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import es.eina.tfg.model.Device_Sensor;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Device_Sensor in entity cache.
 *
 * @author adelrioj
 * @see Device_Sensor
 * @generated
 */
public class Device_SensorCacheModel implements CacheModel<Device_Sensor>,
    Externalizable {
    public long deviceId;
    public long sensorId;
    public boolean status;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{deviceId=");
        sb.append(deviceId);
        sb.append(", sensorId=");
        sb.append(sensorId);
        sb.append(", status=");
        sb.append(status);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Device_Sensor toEntityModel() {
        Device_SensorImpl device_SensorImpl = new Device_SensorImpl();

        device_SensorImpl.setDeviceId(deviceId);
        device_SensorImpl.setSensorId(sensorId);
        device_SensorImpl.setStatus(status);

        device_SensorImpl.resetOriginalValues();

        return device_SensorImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        deviceId = objectInput.readLong();
        sensorId = objectInput.readLong();
        status = objectInput.readBoolean();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(deviceId);
        objectOutput.writeLong(sensorId);
        objectOutput.writeBoolean(status);
    }
}
