package es.eina.tfg.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import es.eina.tfg.model.UserSelectedRoutes;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing UserSelectedRoutes in entity cache.
 *
 * @author adelrioj
 * @see UserSelectedRoutes
 * @generated
 */
public class UserSelectedRoutesCacheModel implements CacheModel<UserSelectedRoutes>,
    Externalizable {
    public long userId;
    public long routeId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{userId=");
        sb.append(userId);
        sb.append(", routeId=");
        sb.append(routeId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public UserSelectedRoutes toEntityModel() {
        UserSelectedRoutesImpl userSelectedRoutesImpl = new UserSelectedRoutesImpl();

        userSelectedRoutesImpl.setUserId(userId);
        userSelectedRoutesImpl.setRouteId(routeId);

        userSelectedRoutesImpl.resetOriginalValues();

        return userSelectedRoutesImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        userId = objectInput.readLong();
        routeId = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(userId);
        objectOutput.writeLong(routeId);
    }
}
