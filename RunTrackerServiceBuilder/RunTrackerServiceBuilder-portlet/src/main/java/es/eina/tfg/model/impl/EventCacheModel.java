package es.eina.tfg.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import es.eina.tfg.model.Event;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Event in entity cache.
 *
 * @author adelrioj
 * @see Event
 * @generated
 */
public class EventCacheModel implements CacheModel<Event>, Externalizable {
    public long idEvent;
    public long idRoute;
    public long idAuthor;
    public String name;
    public long plannedStartingTime;
    public long plannedFinishTime;
    public long realStartingTime;
    public long realFinishTime;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(17);

        sb.append("{idEvent=");
        sb.append(idEvent);
        sb.append(", idRoute=");
        sb.append(idRoute);
        sb.append(", idAuthor=");
        sb.append(idAuthor);
        sb.append(", name=");
        sb.append(name);
        sb.append(", plannedStartingTime=");
        sb.append(plannedStartingTime);
        sb.append(", plannedFinishTime=");
        sb.append(plannedFinishTime);
        sb.append(", realStartingTime=");
        sb.append(realStartingTime);
        sb.append(", realFinishTime=");
        sb.append(realFinishTime);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Event toEntityModel() {
        EventImpl eventImpl = new EventImpl();

        eventImpl.setIdEvent(idEvent);
        eventImpl.setIdRoute(idRoute);
        eventImpl.setIdAuthor(idAuthor);

        if (name == null) {
            eventImpl.setName(StringPool.BLANK);
        } else {
            eventImpl.setName(name);
        }

        if (plannedStartingTime == Long.MIN_VALUE) {
            eventImpl.setPlannedStartingTime(null);
        } else {
            eventImpl.setPlannedStartingTime(new Date(plannedStartingTime));
        }

        if (plannedFinishTime == Long.MIN_VALUE) {
            eventImpl.setPlannedFinishTime(null);
        } else {
            eventImpl.setPlannedFinishTime(new Date(plannedFinishTime));
        }

        if (realStartingTime == Long.MIN_VALUE) {
            eventImpl.setRealStartingTime(null);
        } else {
            eventImpl.setRealStartingTime(new Date(realStartingTime));
        }

        if (realFinishTime == Long.MIN_VALUE) {
            eventImpl.setRealFinishTime(null);
        } else {
            eventImpl.setRealFinishTime(new Date(realFinishTime));
        }

        eventImpl.resetOriginalValues();

        return eventImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        idEvent = objectInput.readLong();
        idRoute = objectInput.readLong();
        idAuthor = objectInput.readLong();
        name = objectInput.readUTF();
        plannedStartingTime = objectInput.readLong();
        plannedFinishTime = objectInput.readLong();
        realStartingTime = objectInput.readLong();
        realFinishTime = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(idEvent);
        objectOutput.writeLong(idRoute);
        objectOutput.writeLong(idAuthor);

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        objectOutput.writeLong(plannedStartingTime);
        objectOutput.writeLong(plannedFinishTime);
        objectOutput.writeLong(realStartingTime);
        objectOutput.writeLong(realFinishTime);
    }
}
