package es.eina.tfg.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import es.eina.tfg.model.UserAdditionalData;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing UserAdditionalData in entity cache.
 *
 * @author adelrioj
 * @see UserAdditionalData
 * @generated
 */
public class UserAdditionalDataCacheModel implements CacheModel<UserAdditionalData>,
    Externalizable {
    public long userId;
    public String registerType;
    public int weight;
    public int height;
    public long smsCounter;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(11);

        sb.append("{userId=");
        sb.append(userId);
        sb.append(", registerType=");
        sb.append(registerType);
        sb.append(", weight=");
        sb.append(weight);
        sb.append(", height=");
        sb.append(height);
        sb.append(", smsCounter=");
        sb.append(smsCounter);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public UserAdditionalData toEntityModel() {
        UserAdditionalDataImpl userAdditionalDataImpl = new UserAdditionalDataImpl();

        userAdditionalDataImpl.setUserId(userId);

        if (registerType == null) {
            userAdditionalDataImpl.setRegisterType(StringPool.BLANK);
        } else {
            userAdditionalDataImpl.setRegisterType(registerType);
        }

        userAdditionalDataImpl.setWeight(weight);
        userAdditionalDataImpl.setHeight(height);
        userAdditionalDataImpl.setSmsCounter(smsCounter);

        userAdditionalDataImpl.resetOriginalValues();

        return userAdditionalDataImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        userId = objectInput.readLong();
        registerType = objectInput.readUTF();
        weight = objectInput.readInt();
        height = objectInput.readInt();
        smsCounter = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(userId);

        if (registerType == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(registerType);
        }

        objectOutput.writeInt(weight);
        objectOutput.writeInt(height);
        objectOutput.writeLong(smsCounter);
    }
}
