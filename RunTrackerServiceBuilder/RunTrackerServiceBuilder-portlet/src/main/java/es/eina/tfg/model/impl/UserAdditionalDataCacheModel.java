package es.eina.tfg.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
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
    public long idUser;
    public int weight;
    public int height;
    public long smsCount;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{idUser=");
        sb.append(idUser);
        sb.append(", weight=");
        sb.append(weight);
        sb.append(", height=");
        sb.append(height);
        sb.append(", smsCount=");
        sb.append(smsCount);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public UserAdditionalData toEntityModel() {
        UserAdditionalDataImpl userAdditionalDataImpl = new UserAdditionalDataImpl();

        userAdditionalDataImpl.setIdUser(idUser);
        userAdditionalDataImpl.setWeight(weight);
        userAdditionalDataImpl.setHeight(height);
        userAdditionalDataImpl.setSmsCount(smsCount);

        userAdditionalDataImpl.resetOriginalValues();

        return userAdditionalDataImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        idUser = objectInput.readLong();
        weight = objectInput.readInt();
        height = objectInput.readInt();
        smsCount = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(idUser);
        objectOutput.writeInt(weight);
        objectOutput.writeInt(height);
        objectOutput.writeLong(smsCount);
    }
}
