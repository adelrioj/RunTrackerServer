package es.eina.tfg.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import es.eina.tfg.service.ClpSerializer;
import es.eina.tfg.service.EventLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class EventClp extends BaseModelImpl<Event> implements Event {
    private long _idEvent;
    private long _idRoute;
    private long _idAuthor;
    private String _name;
    private Date _plannedStartingTime;
    private Date _plannedFinishTime;
    private Date _realStartingTime;
    private Date _realFinishTime;
    private BaseModel<?> _eventRemoteModel;
    private Class<?> _clpSerializerClass = es.eina.tfg.service.ClpSerializer.class;

    public EventClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Event.class;
    }

    @Override
    public String getModelClassName() {
        return Event.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _idEvent;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setIdEvent(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _idEvent;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("idEvent", getIdEvent());
        attributes.put("idRoute", getIdRoute());
        attributes.put("idAuthor", getIdAuthor());
        attributes.put("name", getName());
        attributes.put("plannedStartingTime", getPlannedStartingTime());
        attributes.put("plannedFinishTime", getPlannedFinishTime());
        attributes.put("realStartingTime", getRealStartingTime());
        attributes.put("realFinishTime", getRealFinishTime());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long idEvent = (Long) attributes.get("idEvent");

        if (idEvent != null) {
            setIdEvent(idEvent);
        }

        Long idRoute = (Long) attributes.get("idRoute");

        if (idRoute != null) {
            setIdRoute(idRoute);
        }

        Long idAuthor = (Long) attributes.get("idAuthor");

        if (idAuthor != null) {
            setIdAuthor(idAuthor);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        Date plannedStartingTime = (Date) attributes.get("plannedStartingTime");

        if (plannedStartingTime != null) {
            setPlannedStartingTime(plannedStartingTime);
        }

        Date plannedFinishTime = (Date) attributes.get("plannedFinishTime");

        if (plannedFinishTime != null) {
            setPlannedFinishTime(plannedFinishTime);
        }

        Date realStartingTime = (Date) attributes.get("realStartingTime");

        if (realStartingTime != null) {
            setRealStartingTime(realStartingTime);
        }

        Date realFinishTime = (Date) attributes.get("realFinishTime");

        if (realFinishTime != null) {
            setRealFinishTime(realFinishTime);
        }
    }

    @Override
    public long getIdEvent() {
        return _idEvent;
    }

    @Override
    public void setIdEvent(long idEvent) {
        _idEvent = idEvent;

        if (_eventRemoteModel != null) {
            try {
                Class<?> clazz = _eventRemoteModel.getClass();

                Method method = clazz.getMethod("setIdEvent", long.class);

                method.invoke(_eventRemoteModel, idEvent);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getIdRoute() {
        return _idRoute;
    }

    @Override
    public void setIdRoute(long idRoute) {
        _idRoute = idRoute;

        if (_eventRemoteModel != null) {
            try {
                Class<?> clazz = _eventRemoteModel.getClass();

                Method method = clazz.getMethod("setIdRoute", long.class);

                method.invoke(_eventRemoteModel, idRoute);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getIdAuthor() {
        return _idAuthor;
    }

    @Override
    public void setIdAuthor(long idAuthor) {
        _idAuthor = idAuthor;

        if (_eventRemoteModel != null) {
            try {
                Class<?> clazz = _eventRemoteModel.getClass();

                Method method = clazz.getMethod("setIdAuthor", long.class);

                method.invoke(_eventRemoteModel, idAuthor);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getName() {
        return _name;
    }

    @Override
    public void setName(String name) {
        _name = name;

        if (_eventRemoteModel != null) {
            try {
                Class<?> clazz = _eventRemoteModel.getClass();

                Method method = clazz.getMethod("setName", String.class);

                method.invoke(_eventRemoteModel, name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getPlannedStartingTime() {
        return _plannedStartingTime;
    }

    @Override
    public void setPlannedStartingTime(Date plannedStartingTime) {
        _plannedStartingTime = plannedStartingTime;

        if (_eventRemoteModel != null) {
            try {
                Class<?> clazz = _eventRemoteModel.getClass();

                Method method = clazz.getMethod("setPlannedStartingTime",
                        Date.class);

                method.invoke(_eventRemoteModel, plannedStartingTime);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getPlannedFinishTime() {
        return _plannedFinishTime;
    }

    @Override
    public void setPlannedFinishTime(Date plannedFinishTime) {
        _plannedFinishTime = plannedFinishTime;

        if (_eventRemoteModel != null) {
            try {
                Class<?> clazz = _eventRemoteModel.getClass();

                Method method = clazz.getMethod("setPlannedFinishTime",
                        Date.class);

                method.invoke(_eventRemoteModel, plannedFinishTime);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getRealStartingTime() {
        return _realStartingTime;
    }

    @Override
    public void setRealStartingTime(Date realStartingTime) {
        _realStartingTime = realStartingTime;

        if (_eventRemoteModel != null) {
            try {
                Class<?> clazz = _eventRemoteModel.getClass();

                Method method = clazz.getMethod("setRealStartingTime",
                        Date.class);

                method.invoke(_eventRemoteModel, realStartingTime);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getRealFinishTime() {
        return _realFinishTime;
    }

    @Override
    public void setRealFinishTime(Date realFinishTime) {
        _realFinishTime = realFinishTime;

        if (_eventRemoteModel != null) {
            try {
                Class<?> clazz = _eventRemoteModel.getClass();

                Method method = clazz.getMethod("setRealFinishTime", Date.class);

                method.invoke(_eventRemoteModel, realFinishTime);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEventRemoteModel() {
        return _eventRemoteModel;
    }

    public void setEventRemoteModel(BaseModel<?> eventRemoteModel) {
        _eventRemoteModel = eventRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _eventRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_eventRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EventLocalServiceUtil.addEvent(this);
        } else {
            EventLocalServiceUtil.updateEvent(this);
        }
    }

    @Override
    public Event toEscapedModel() {
        return (Event) ProxyUtil.newProxyInstance(Event.class.getClassLoader(),
            new Class[] { Event.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        EventClp clone = new EventClp();

        clone.setIdEvent(getIdEvent());
        clone.setIdRoute(getIdRoute());
        clone.setIdAuthor(getIdAuthor());
        clone.setName(getName());
        clone.setPlannedStartingTime(getPlannedStartingTime());
        clone.setPlannedFinishTime(getPlannedFinishTime());
        clone.setRealStartingTime(getRealStartingTime());
        clone.setRealFinishTime(getRealFinishTime());

        return clone;
    }

    @Override
    public int compareTo(Event event) {
        long primaryKey = event.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EventClp)) {
            return false;
        }

        EventClp event = (EventClp) obj;

        long primaryKey = event.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(17);

        sb.append("{idEvent=");
        sb.append(getIdEvent());
        sb.append(", idRoute=");
        sb.append(getIdRoute());
        sb.append(", idAuthor=");
        sb.append(getIdAuthor());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", plannedStartingTime=");
        sb.append(getPlannedStartingTime());
        sb.append(", plannedFinishTime=");
        sb.append(getPlannedFinishTime());
        sb.append(", realStartingTime=");
        sb.append(getRealStartingTime());
        sb.append(", realFinishTime=");
        sb.append(getRealFinishTime());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(28);

        sb.append("<model><model-name>");
        sb.append("es.eina.tfg.model.Event");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>idEvent</column-name><column-value><![CDATA[");
        sb.append(getIdEvent());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>idRoute</column-name><column-value><![CDATA[");
        sb.append(getIdRoute());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>idAuthor</column-name><column-value><![CDATA[");
        sb.append(getIdAuthor());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>plannedStartingTime</column-name><column-value><![CDATA[");
        sb.append(getPlannedStartingTime());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>plannedFinishTime</column-name><column-value><![CDATA[");
        sb.append(getPlannedFinishTime());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>realStartingTime</column-name><column-value><![CDATA[");
        sb.append(getRealStartingTime());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>realFinishTime</column-name><column-value><![CDATA[");
        sb.append(getRealFinishTime());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
