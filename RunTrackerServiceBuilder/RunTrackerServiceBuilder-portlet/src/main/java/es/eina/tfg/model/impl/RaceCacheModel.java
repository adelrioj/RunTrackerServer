package es.eina.tfg.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import es.eina.tfg.model.Race;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Race in entity cache.
 *
 * @author adelrioj
 * @see Race
 * @generated
 */
public class RaceCacheModel implements CacheModel<Race>, Externalizable {
    public long raceId;
    public long userId;
    public long routeId;
    public String type;
    public int userHeight;
    public int userWeight;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(13);

        sb.append("{raceId=");
        sb.append(raceId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", routeId=");
        sb.append(routeId);
        sb.append(", type=");
        sb.append(type);
        sb.append(", userHeight=");
        sb.append(userHeight);
        sb.append(", userWeight=");
        sb.append(userWeight);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Race toEntityModel() {
        RaceImpl raceImpl = new RaceImpl();

        raceImpl.setRaceId(raceId);
        raceImpl.setUserId(userId);
        raceImpl.setRouteId(routeId);

        if (type == null) {
            raceImpl.setType(StringPool.BLANK);
        } else {
            raceImpl.setType(type);
        }

        raceImpl.setUserHeight(userHeight);
        raceImpl.setUserWeight(userWeight);

        raceImpl.resetOriginalValues();

        return raceImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        raceId = objectInput.readLong();
        userId = objectInput.readLong();
        routeId = objectInput.readLong();
        type = objectInput.readUTF();
        userHeight = objectInput.readInt();
        userWeight = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(raceId);
        objectOutput.writeLong(userId);
        objectOutput.writeLong(routeId);

        if (type == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(type);
        }

        objectOutput.writeInt(userHeight);
        objectOutput.writeInt(userWeight);
    }
}
