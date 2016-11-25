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
    public long idRace;
    public long idUser;
    public long idRoute;
    public String type;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{idRace=");
        sb.append(idRace);
        sb.append(", idUser=");
        sb.append(idUser);
        sb.append(", idRoute=");
        sb.append(idRoute);
        sb.append(", type=");
        sb.append(type);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Race toEntityModel() {
        RaceImpl raceImpl = new RaceImpl();

        raceImpl.setIdRace(idRace);
        raceImpl.setIdUser(idUser);
        raceImpl.setIdRoute(idRoute);

        if (type == null) {
            raceImpl.setType(StringPool.BLANK);
        } else {
            raceImpl.setType(type);
        }

        raceImpl.resetOriginalValues();

        return raceImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        idRace = objectInput.readLong();
        idUser = objectInput.readLong();
        idRoute = objectInput.readLong();
        type = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(idRace);
        objectOutput.writeLong(idUser);
        objectOutput.writeLong(idRoute);

        if (type == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(type);
        }
    }
}
