package es.eina.tfg.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import es.eina.tfg.model.Device;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Device in entity cache.
 *
 * @author adelrioj
 * @see Device
 * @generated
 */
public class DeviceCacheModel implements CacheModel<Device>, Externalizable {
    public long idDevice;
    public long idUser;
    public String deviceUUID;
    public String description;
    public String status;
    public String phoneNumber;
    public String serverPhoneNumber;
    public String smsPollTime;
    public String smsTransmitPeriod;
    public String cloudId;
    public String serverIp;
    public String httpTransmitPeriod;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(25);

        sb.append("{idDevice=");
        sb.append(idDevice);
        sb.append(", idUser=");
        sb.append(idUser);
        sb.append(", deviceUUID=");
        sb.append(deviceUUID);
        sb.append(", description=");
        sb.append(description);
        sb.append(", status=");
        sb.append(status);
        sb.append(", phoneNumber=");
        sb.append(phoneNumber);
        sb.append(", serverPhoneNumber=");
        sb.append(serverPhoneNumber);
        sb.append(", smsPollTime=");
        sb.append(smsPollTime);
        sb.append(", smsTransmitPeriod=");
        sb.append(smsTransmitPeriod);
        sb.append(", cloudId=");
        sb.append(cloudId);
        sb.append(", serverIp=");
        sb.append(serverIp);
        sb.append(", httpTransmitPeriod=");
        sb.append(httpTransmitPeriod);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Device toEntityModel() {
        DeviceImpl deviceImpl = new DeviceImpl();

        deviceImpl.setIdDevice(idDevice);
        deviceImpl.setIdUser(idUser);

        if (deviceUUID == null) {
            deviceImpl.setDeviceUUID(StringPool.BLANK);
        } else {
            deviceImpl.setDeviceUUID(deviceUUID);
        }

        if (description == null) {
            deviceImpl.setDescription(StringPool.BLANK);
        } else {
            deviceImpl.setDescription(description);
        }

        if (status == null) {
            deviceImpl.setStatus(StringPool.BLANK);
        } else {
            deviceImpl.setStatus(status);
        }

        if (phoneNumber == null) {
            deviceImpl.setPhoneNumber(StringPool.BLANK);
        } else {
            deviceImpl.setPhoneNumber(phoneNumber);
        }

        if (serverPhoneNumber == null) {
            deviceImpl.setServerPhoneNumber(StringPool.BLANK);
        } else {
            deviceImpl.setServerPhoneNumber(serverPhoneNumber);
        }

        if (smsPollTime == null) {
            deviceImpl.setSmsPollTime(StringPool.BLANK);
        } else {
            deviceImpl.setSmsPollTime(smsPollTime);
        }

        if (smsTransmitPeriod == null) {
            deviceImpl.setSmsTransmitPeriod(StringPool.BLANK);
        } else {
            deviceImpl.setSmsTransmitPeriod(smsTransmitPeriod);
        }

        if (cloudId == null) {
            deviceImpl.setCloudId(StringPool.BLANK);
        } else {
            deviceImpl.setCloudId(cloudId);
        }

        if (serverIp == null) {
            deviceImpl.setServerIp(StringPool.BLANK);
        } else {
            deviceImpl.setServerIp(serverIp);
        }

        if (httpTransmitPeriod == null) {
            deviceImpl.setHttpTransmitPeriod(StringPool.BLANK);
        } else {
            deviceImpl.setHttpTransmitPeriod(httpTransmitPeriod);
        }

        deviceImpl.resetOriginalValues();

        return deviceImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        idDevice = objectInput.readLong();
        idUser = objectInput.readLong();
        deviceUUID = objectInput.readUTF();
        description = objectInput.readUTF();
        status = objectInput.readUTF();
        phoneNumber = objectInput.readUTF();
        serverPhoneNumber = objectInput.readUTF();
        smsPollTime = objectInput.readUTF();
        smsTransmitPeriod = objectInput.readUTF();
        cloudId = objectInput.readUTF();
        serverIp = objectInput.readUTF();
        httpTransmitPeriod = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(idDevice);
        objectOutput.writeLong(idUser);

        if (deviceUUID == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(deviceUUID);
        }

        if (description == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(description);
        }

        if (status == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(status);
        }

        if (phoneNumber == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(phoneNumber);
        }

        if (serverPhoneNumber == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(serverPhoneNumber);
        }

        if (smsPollTime == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(smsPollTime);
        }

        if (smsTransmitPeriod == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(smsTransmitPeriod);
        }

        if (cloudId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(cloudId);
        }

        if (serverIp == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(serverIp);
        }

        if (httpTransmitPeriod == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(httpTransmitPeriod);
        }
    }
}
