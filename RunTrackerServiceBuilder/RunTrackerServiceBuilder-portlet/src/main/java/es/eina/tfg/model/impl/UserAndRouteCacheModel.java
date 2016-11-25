package es.eina.tfg.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import es.eina.tfg.model.UserAndRoute;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing UserAndRoute in entity cache.
 *
 * @author adelrioj
 * @see UserAndRoute
 * @generated
 */
public class UserAndRouteCacheModel implements CacheModel<UserAndRoute>,
    Externalizable {
    public long idUser;
    public long idRoute;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{idUser=");
        sb.append(idUser);
        sb.append(", idRoute=");
        sb.append(idRoute);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public UserAndRoute toEntityModel() {
        UserAndRouteImpl userAndRouteImpl = new UserAndRouteImpl();

        userAndRouteImpl.setIdUser(idUser);
        userAndRouteImpl.setIdRoute(idRoute);

        userAndRouteImpl.resetOriginalValues();

        return userAndRouteImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        idUser = objectInput.readLong();
        idRoute = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(idUser);
        objectOutput.writeLong(idRoute);
    }
}
