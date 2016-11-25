package es.eina.tfg.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import es.eina.tfg.model.UserAndEvent;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing UserAndEvent in entity cache.
 *
 * @author adelrioj
 * @see UserAndEvent
 * @generated
 */
public class UserAndEventCacheModel implements CacheModel<UserAndEvent>,
    Externalizable {
    public long idUser;
    public long idEvent;
    public long idRace;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{idUser=");
        sb.append(idUser);
        sb.append(", idEvent=");
        sb.append(idEvent);
        sb.append(", idRace=");
        sb.append(idRace);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public UserAndEvent toEntityModel() {
        UserAndEventImpl userAndEventImpl = new UserAndEventImpl();

        userAndEventImpl.setIdUser(idUser);
        userAndEventImpl.setIdEvent(idEvent);
        userAndEventImpl.setIdRace(idRace);

        userAndEventImpl.resetOriginalValues();

        return userAndEventImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        idUser = objectInput.readLong();
        idEvent = objectInput.readLong();
        idRace = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(idUser);
        objectOutput.writeLong(idEvent);
        objectOutput.writeLong(idRace);
    }
}
