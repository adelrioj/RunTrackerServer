package es.eina.tfg.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import es.eina.tfg.model.DeviceAndSensor;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing DeviceAndSensor in entity cache.
 *
 * @author adelrioj
 * @see DeviceAndSensor
 * @generated
 */
public class DeviceAndSensorCacheModel implements CacheModel<DeviceAndSensor>,
    Externalizable {
    public long idDevice;
    public long idSensor;
    public boolean status;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{idDevice=");
        sb.append(idDevice);
        sb.append(", idSensor=");
        sb.append(idSensor);
        sb.append(", status=");
        sb.append(status);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public DeviceAndSensor toEntityModel() {
        DeviceAndSensorImpl deviceAndSensorImpl = new DeviceAndSensorImpl();

        deviceAndSensorImpl.setIdDevice(idDevice);
        deviceAndSensorImpl.setIdSensor(idSensor);
        deviceAndSensorImpl.setStatus(status);

        deviceAndSensorImpl.resetOriginalValues();

        return deviceAndSensorImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        idDevice = objectInput.readLong();
        idSensor = objectInput.readLong();
        status = objectInput.readBoolean();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(idDevice);
        objectOutput.writeLong(idSensor);
        objectOutput.writeBoolean(status);
    }
}
