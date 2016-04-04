package es.eina.tfg.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import es.eina.tfg.service.ClpSerializer;
import es.eina.tfg.service.UserAdditionalDataLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class UserAdditionalDataClp extends BaseModelImpl<UserAdditionalData>
    implements UserAdditionalData {
    private long _userId;
    private String _userUuid;
    private String _registerType;
    private int _weight;
    private int _height;
    private long _smsCounter;
    private BaseModel<?> _userAdditionalDataRemoteModel;
    private Class<?> _clpSerializerClass = es.eina.tfg.service.ClpSerializer.class;

    public UserAdditionalDataClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return UserAdditionalData.class;
    }

    @Override
    public String getModelClassName() {
        return UserAdditionalData.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _userId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setUserId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _userId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("userId", getUserId());
        attributes.put("registerType", getRegisterType());
        attributes.put("weight", getWeight());
        attributes.put("height", getHeight());
        attributes.put("smsCounter", getSmsCounter());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        String registerType = (String) attributes.get("registerType");

        if (registerType != null) {
            setRegisterType(registerType);
        }

        Integer weight = (Integer) attributes.get("weight");

        if (weight != null) {
            setWeight(weight);
        }

        Integer height = (Integer) attributes.get("height");

        if (height != null) {
            setHeight(height);
        }

        Long smsCounter = (Long) attributes.get("smsCounter");

        if (smsCounter != null) {
            setSmsCounter(smsCounter);
        }
    }

    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;

        if (_userAdditionalDataRemoteModel != null) {
            try {
                Class<?> clazz = _userAdditionalDataRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_userAdditionalDataRemoteModel, userId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @Override
    public String getRegisterType() {
        return _registerType;
    }

    @Override
    public void setRegisterType(String registerType) {
        _registerType = registerType;

        if (_userAdditionalDataRemoteModel != null) {
            try {
                Class<?> clazz = _userAdditionalDataRemoteModel.getClass();

                Method method = clazz.getMethod("setRegisterType", String.class);

                method.invoke(_userAdditionalDataRemoteModel, registerType);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getWeight() {
        return _weight;
    }

    @Override
    public void setWeight(int weight) {
        _weight = weight;

        if (_userAdditionalDataRemoteModel != null) {
            try {
                Class<?> clazz = _userAdditionalDataRemoteModel.getClass();

                Method method = clazz.getMethod("setWeight", int.class);

                method.invoke(_userAdditionalDataRemoteModel, weight);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getHeight() {
        return _height;
    }

    @Override
    public void setHeight(int height) {
        _height = height;

        if (_userAdditionalDataRemoteModel != null) {
            try {
                Class<?> clazz = _userAdditionalDataRemoteModel.getClass();

                Method method = clazz.getMethod("setHeight", int.class);

                method.invoke(_userAdditionalDataRemoteModel, height);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getSmsCounter() {
        return _smsCounter;
    }

    @Override
    public void setSmsCounter(long smsCounter) {
        _smsCounter = smsCounter;

        if (_userAdditionalDataRemoteModel != null) {
            try {
                Class<?> clazz = _userAdditionalDataRemoteModel.getClass();

                Method method = clazz.getMethod("setSmsCounter", long.class);

                method.invoke(_userAdditionalDataRemoteModel, smsCounter);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getUserAdditionalDataRemoteModel() {
        return _userAdditionalDataRemoteModel;
    }

    public void setUserAdditionalDataRemoteModel(
        BaseModel<?> userAdditionalDataRemoteModel) {
        _userAdditionalDataRemoteModel = userAdditionalDataRemoteModel;
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

        Class<?> remoteModelClass = _userAdditionalDataRemoteModel.getClass();

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

        Object returnValue = method.invoke(_userAdditionalDataRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            UserAdditionalDataLocalServiceUtil.addUserAdditionalData(this);
        } else {
            UserAdditionalDataLocalServiceUtil.updateUserAdditionalData(this);
        }
    }

    @Override
    public UserAdditionalData toEscapedModel() {
        return (UserAdditionalData) ProxyUtil.newProxyInstance(UserAdditionalData.class.getClassLoader(),
            new Class[] { UserAdditionalData.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        UserAdditionalDataClp clone = new UserAdditionalDataClp();

        clone.setUserId(getUserId());
        clone.setRegisterType(getRegisterType());
        clone.setWeight(getWeight());
        clone.setHeight(getHeight());
        clone.setSmsCounter(getSmsCounter());

        return clone;
    }

    @Override
    public int compareTo(UserAdditionalData userAdditionalData) {
        long primaryKey = userAdditionalData.getPrimaryKey();

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

        if (!(obj instanceof UserAdditionalDataClp)) {
            return false;
        }

        UserAdditionalDataClp userAdditionalData = (UserAdditionalDataClp) obj;

        long primaryKey = userAdditionalData.getPrimaryKey();

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
        StringBundler sb = new StringBundler(11);

        sb.append("{userId=");
        sb.append(getUserId());
        sb.append(", registerType=");
        sb.append(getRegisterType());
        sb.append(", weight=");
        sb.append(getWeight());
        sb.append(", height=");
        sb.append(getHeight());
        sb.append(", smsCounter=");
        sb.append(getSmsCounter());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(19);

        sb.append("<model><model-name>");
        sb.append("es.eina.tfg.model.UserAdditionalData");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>registerType</column-name><column-value><![CDATA[");
        sb.append(getRegisterType());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>weight</column-name><column-value><![CDATA[");
        sb.append(getWeight());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>height</column-name><column-value><![CDATA[");
        sb.append(getHeight());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>smsCounter</column-name><column-value><![CDATA[");
        sb.append(getSmsCounter());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
