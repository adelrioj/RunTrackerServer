package es.eina.tfg.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link UserAdditionalData}.
 * </p>
 *
 * @author adelrioj
 * @see UserAdditionalData
 * @generated
 */
public class UserAdditionalDataWrapper implements UserAdditionalData,
    ModelWrapper<UserAdditionalData> {
    private UserAdditionalData _userAdditionalData;

    public UserAdditionalDataWrapper(UserAdditionalData userAdditionalData) {
        _userAdditionalData = userAdditionalData;
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

    /**
    * Returns the primary key of this user additional data.
    *
    * @return the primary key of this user additional data
    */
    @Override
    public long getPrimaryKey() {
        return _userAdditionalData.getPrimaryKey();
    }

    /**
    * Sets the primary key of this user additional data.
    *
    * @param primaryKey the primary key of this user additional data
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _userAdditionalData.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the id user of this user additional data.
    *
    * @return the id user of this user additional data
    */
    @Override
    public long getIdUser() {
        return _userAdditionalData.getIdUser();
    }

    /**
    * Sets the id user of this user additional data.
    *
    * @param idUser the id user of this user additional data
    */
    @Override
    public void setIdUser(long idUser) {
        _userAdditionalData.setIdUser(idUser);
    }

    /**
    * Returns the weight of this user additional data.
    *
    * @return the weight of this user additional data
    */
    @Override
    public int getWeight() {
        return _userAdditionalData.getWeight();
    }

    /**
    * Sets the weight of this user additional data.
    *
    * @param weight the weight of this user additional data
    */
    @Override
    public void setWeight(int weight) {
        _userAdditionalData.setWeight(weight);
    }

    /**
    * Returns the height of this user additional data.
    *
    * @return the height of this user additional data
    */
    @Override
    public int getHeight() {
        return _userAdditionalData.getHeight();
    }

    /**
    * Sets the height of this user additional data.
    *
    * @param height the height of this user additional data
    */
    @Override
    public void setHeight(int height) {
        _userAdditionalData.setHeight(height);
    }

    /**
    * Returns the sms count of this user additional data.
    *
    * @return the sms count of this user additional data
    */
    @Override
    public long getSmsCount() {
        return _userAdditionalData.getSmsCount();
    }

    /**
    * Sets the sms count of this user additional data.
    *
    * @param smsCount the sms count of this user additional data
    */
    @Override
    public void setSmsCount(long smsCount) {
        _userAdditionalData.setSmsCount(smsCount);
    }

    @Override
    public boolean isNew() {
        return _userAdditionalData.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _userAdditionalData.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _userAdditionalData.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _userAdditionalData.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _userAdditionalData.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _userAdditionalData.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _userAdditionalData.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _userAdditionalData.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _userAdditionalData.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _userAdditionalData.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _userAdditionalData.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new UserAdditionalDataWrapper((UserAdditionalData) _userAdditionalData.clone());
    }

    @Override
    public int compareTo(
        es.eina.tfg.model.UserAdditionalData userAdditionalData) {
        return _userAdditionalData.compareTo(userAdditionalData);
    }

    @Override
    public int hashCode() {
        return _userAdditionalData.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<es.eina.tfg.model.UserAdditionalData> toCacheModel() {
        return _userAdditionalData.toCacheModel();
    }

    @Override
    public es.eina.tfg.model.UserAdditionalData toEscapedModel() {
        return new UserAdditionalDataWrapper(_userAdditionalData.toEscapedModel());
    }

    @Override
    public es.eina.tfg.model.UserAdditionalData toUnescapedModel() {
        return new UserAdditionalDataWrapper(_userAdditionalData.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _userAdditionalData.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _userAdditionalData.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _userAdditionalData.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof UserAdditionalDataWrapper)) {
            return false;
        }

        UserAdditionalDataWrapper userAdditionalDataWrapper = (UserAdditionalDataWrapper) obj;

        if (Validator.equals(_userAdditionalData,
                    userAdditionalDataWrapper._userAdditionalData)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public UserAdditionalData getWrappedUserAdditionalData() {
        return _userAdditionalData;
    }

    @Override
    public UserAdditionalData getWrappedModel() {
        return _userAdditionalData;
    }

    @Override
    public void resetOriginalValues() {
        _userAdditionalData.resetOriginalValues();
    }
}
