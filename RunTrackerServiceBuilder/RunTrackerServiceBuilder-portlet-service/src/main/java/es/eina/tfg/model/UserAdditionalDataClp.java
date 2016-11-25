package es.eina.tfg.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import es.eina.tfg.service.ClpSerializer;
import es.eina.tfg.service.UserAdditionalDataLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class UserAdditionalDataClp extends BaseModelImpl<UserAdditionalData>
    implements UserAdditionalData {
    private long _idUser;
    private int _weight;
    private int _height;
    private long _smsCount;
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
        return _idUser;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setIdUser(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _idUser;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("idUser", getIdUser());
        attributes.put("weight", getWeight());
        attributes.put("height", getHeight());
        attributes.put("smsCount", getSmsCount());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long idUser = (Long) attributes.get("idUser");

        if (idUser != null) {
            setIdUser(idUser);
        }

        Integer weight = (Integer) attributes.get("weight");

        if (weight != null) {
            setWeight(weight);
        }

        Integer height = (Integer) attributes.get("height");

        if (height != null) {
            setHeight(height);
        }

        Long smsCount = (Long) attributes.get("smsCount");

        if (smsCount != null) {
            setSmsCount(smsCount);
        }
    }

    @Override
    public long getIdUser() {
        return _idUser;
    }

    @Override
    public void setIdUser(long idUser) {
        _idUser = idUser;

        if (_userAdditionalDataRemoteModel != null) {
            try {
                Class<?> clazz = _userAdditionalDataRemoteModel.getClass();

                Method method = clazz.getMethod("setIdUser", long.class);

                method.invoke(_userAdditionalDataRemoteModel, idUser);
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
    public long getSmsCount() {
        return _smsCount;
    }

    @Override
    public void setSmsCount(long smsCount) {
        _smsCount = smsCount;

        if (_userAdditionalDataRemoteModel != null) {
            try {
                Class<?> clazz = _userAdditionalDataRemoteModel.getClass();

                Method method = clazz.getMethod("setSmsCount", long.class);

                method.invoke(_userAdditionalDataRemoteModel, smsCount);
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

        clone.setIdUser(getIdUser());
        clone.setWeight(getWeight());
        clone.setHeight(getHeight());
        clone.setSmsCount(getSmsCount());

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
        StringBundler sb = new StringBundler(9);

        sb.append("{idUser=");
        sb.append(getIdUser());
        sb.append(", weight=");
        sb.append(getWeight());
        sb.append(", height=");
        sb.append(getHeight());
        sb.append(", smsCount=");
        sb.append(getSmsCount());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("es.eina.tfg.model.UserAdditionalData");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>idUser</column-name><column-value><![CDATA[");
        sb.append(getIdUser());
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
            "<column><column-name>smsCount</column-name><column-value><![CDATA[");
        sb.append(getSmsCount());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
