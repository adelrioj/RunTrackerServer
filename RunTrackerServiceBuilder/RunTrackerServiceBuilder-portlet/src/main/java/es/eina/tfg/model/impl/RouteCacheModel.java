package es.eina.tfg.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import es.eina.tfg.model.Route;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Route in entity cache.
 *
 * @author adelrioj
 * @see Route
 * @generated
 */
public class RouteCacheModel implements CacheModel<Route>, Externalizable {
    public long routeId;
    public String type;
    public String name;
    public String description;
    public long authorId;
    public boolean isPublic;
    public long startingTime;
    public long creationTime;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(17);

        sb.append("{routeId=");
        sb.append(routeId);
        sb.append(", type=");
        sb.append(type);
        sb.append(", name=");
        sb.append(name);
        sb.append(", description=");
        sb.append(description);
        sb.append(", authorId=");
        sb.append(authorId);
        sb.append(", isPublic=");
        sb.append(isPublic);
        sb.append(", startingTime=");
        sb.append(startingTime);
        sb.append(", creationTime=");
        sb.append(creationTime);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Route toEntityModel() {
        RouteImpl routeImpl = new RouteImpl();

        routeImpl.setRouteId(routeId);

        if (type == null) {
            routeImpl.setType(StringPool.BLANK);
        } else {
            routeImpl.setType(type);
        }

        if (name == null) {
            routeImpl.setName(StringPool.BLANK);
        } else {
            routeImpl.setName(name);
        }

        if (description == null) {
            routeImpl.setDescription(StringPool.BLANK);
        } else {
            routeImpl.setDescription(description);
        }

        routeImpl.setAuthorId(authorId);
        routeImpl.setIsPublic(isPublic);

        if (startingTime == Long.MIN_VALUE) {
            routeImpl.setStartingTime(null);
        } else {
            routeImpl.setStartingTime(new Date(startingTime));
        }

        if (creationTime == Long.MIN_VALUE) {
            routeImpl.setCreationTime(null);
        } else {
            routeImpl.setCreationTime(new Date(creationTime));
        }

        routeImpl.resetOriginalValues();

        return routeImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        routeId = objectInput.readLong();
        type = objectInput.readUTF();
        name = objectInput.readUTF();
        description = objectInput.readUTF();
        authorId = objectInput.readLong();
        isPublic = objectInput.readBoolean();
        startingTime = objectInput.readLong();
        creationTime = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(routeId);

        if (type == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(type);
        }

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        if (description == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(description);
        }

        objectOutput.writeLong(authorId);
        objectOutput.writeBoolean(isPublic);
        objectOutput.writeLong(startingTime);
        objectOutput.writeLong(creationTime);
    }
}
