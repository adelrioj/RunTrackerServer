package es.eina.tfg.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import es.eina.tfg.model.Sensor;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Sensor in entity cache.
 *
 * @author adelrioj
 * @see Sensor
 * @generated
 */
public class SensorCacheModel implements CacheModel<Sensor>, Externalizable {
    public long sensorId;
    public int type;
    public String description;
    public String dataUnits;
    public String dataType;
    public String dataUncertainity;
    public String dataLowerRange;
    public String dataUpperRange;
    public String dataPacketFormat;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(19);

        sb.append("{sensorId=");
        sb.append(sensorId);
        sb.append(", type=");
        sb.append(type);
        sb.append(", description=");
        sb.append(description);
        sb.append(", dataUnits=");
        sb.append(dataUnits);
        sb.append(", dataType=");
        sb.append(dataType);
        sb.append(", dataUncertainity=");
        sb.append(dataUncertainity);
        sb.append(", dataLowerRange=");
        sb.append(dataLowerRange);
        sb.append(", dataUpperRange=");
        sb.append(dataUpperRange);
        sb.append(", dataPacketFormat=");
        sb.append(dataPacketFormat);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Sensor toEntityModel() {
        SensorImpl sensorImpl = new SensorImpl();

        sensorImpl.setSensorId(sensorId);
        sensorImpl.setType(type);

        if (description == null) {
            sensorImpl.setDescription(StringPool.BLANK);
        } else {
            sensorImpl.setDescription(description);
        }

        if (dataUnits == null) {
            sensorImpl.setDataUnits(StringPool.BLANK);
        } else {
            sensorImpl.setDataUnits(dataUnits);
        }

        if (dataType == null) {
            sensorImpl.setDataType(StringPool.BLANK);
        } else {
            sensorImpl.setDataType(dataType);
        }

        if (dataUncertainity == null) {
            sensorImpl.setDataUncertainity(StringPool.BLANK);
        } else {
            sensorImpl.setDataUncertainity(dataUncertainity);
        }

        if (dataLowerRange == null) {
            sensorImpl.setDataLowerRange(StringPool.BLANK);
        } else {
            sensorImpl.setDataLowerRange(dataLowerRange);
        }

        if (dataUpperRange == null) {
            sensorImpl.setDataUpperRange(StringPool.BLANK);
        } else {
            sensorImpl.setDataUpperRange(dataUpperRange);
        }

        if (dataPacketFormat == null) {
            sensorImpl.setDataPacketFormat(StringPool.BLANK);
        } else {
            sensorImpl.setDataPacketFormat(dataPacketFormat);
        }

        sensorImpl.resetOriginalValues();

        return sensorImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        sensorId = objectInput.readLong();
        type = objectInput.readInt();
        description = objectInput.readUTF();
        dataUnits = objectInput.readUTF();
        dataType = objectInput.readUTF();
        dataUncertainity = objectInput.readUTF();
        dataLowerRange = objectInput.readUTF();
        dataUpperRange = objectInput.readUTF();
        dataPacketFormat = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(sensorId);
        objectOutput.writeInt(type);

        if (description == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(description);
        }

        if (dataUnits == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(dataUnits);
        }

        if (dataType == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(dataType);
        }

        if (dataUncertainity == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(dataUncertainity);
        }

        if (dataLowerRange == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(dataLowerRange);
        }

        if (dataUpperRange == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(dataUpperRange);
        }

        if (dataPacketFormat == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(dataPacketFormat);
        }
    }
}
