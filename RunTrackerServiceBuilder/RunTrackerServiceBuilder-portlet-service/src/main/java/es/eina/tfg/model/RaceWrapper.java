package es.eina.tfg.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Race}.
 * </p>
 *
 * @author adelrioj
 * @see Race
 * @generated
 */
public class RaceWrapper implements Race, ModelWrapper<Race> {
    private Race _race;

    public RaceWrapper(Race race) {
        _race = race;
    }

    @Override
    public Class<?> getModelClass() {
        return Race.class;
    }

    @Override
    public String getModelClassName() {
        return Race.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("idRace", getIdRace());
        attributes.put("idUser", getIdUser());
        attributes.put("idRoute", getIdRoute());
        attributes.put("type", getType());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long idRace = (Long) attributes.get("idRace");

        if (idRace != null) {
            setIdRace(idRace);
        }

        Long idUser = (Long) attributes.get("idUser");

        if (idUser != null) {
            setIdUser(idUser);
        }

        Long idRoute = (Long) attributes.get("idRoute");

        if (idRoute != null) {
            setIdRoute(idRoute);
        }

        String type = (String) attributes.get("type");

        if (type != null) {
            setType(type);
        }
    }

    /**
    * Returns the primary key of this race.
    *
    * @return the primary key of this race
    */
    @Override
    public long getPrimaryKey() {
        return _race.getPrimaryKey();
    }

    /**
    * Sets the primary key of this race.
    *
    * @param primaryKey the primary key of this race
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _race.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the id race of this race.
    *
    * @return the id race of this race
    */
    @Override
    public long getIdRace() {
        return _race.getIdRace();
    }

    /**
    * Sets the id race of this race.
    *
    * @param idRace the id race of this race
    */
    @Override
    public void setIdRace(long idRace) {
        _race.setIdRace(idRace);
    }

    /**
    * Returns the id user of this race.
    *
    * @return the id user of this race
    */
    @Override
    public long getIdUser() {
        return _race.getIdUser();
    }

    /**
    * Sets the id user of this race.
    *
    * @param idUser the id user of this race
    */
    @Override
    public void setIdUser(long idUser) {
        _race.setIdUser(idUser);
    }

    /**
    * Returns the id route of this race.
    *
    * @return the id route of this race
    */
    @Override
    public long getIdRoute() {
        return _race.getIdRoute();
    }

    /**
    * Sets the id route of this race.
    *
    * @param idRoute the id route of this race
    */
    @Override
    public void setIdRoute(long idRoute) {
        _race.setIdRoute(idRoute);
    }

    /**
    * Returns the type of this race.
    *
    * @return the type of this race
    */
    @Override
    public java.lang.String getType() {
        return _race.getType();
    }

    /**
    * Sets the type of this race.
    *
    * @param type the type of this race
    */
    @Override
    public void setType(java.lang.String type) {
        _race.setType(type);
    }

    @Override
    public boolean isNew() {
        return _race.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _race.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _race.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _race.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _race.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _race.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _race.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _race.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _race.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _race.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _race.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new RaceWrapper((Race) _race.clone());
    }

    @Override
    public int compareTo(es.eina.tfg.model.Race race) {
        return _race.compareTo(race);
    }

    @Override
    public int hashCode() {
        return _race.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<es.eina.tfg.model.Race> toCacheModel() {
        return _race.toCacheModel();
    }

    @Override
    public es.eina.tfg.model.Race toEscapedModel() {
        return new RaceWrapper(_race.toEscapedModel());
    }

    @Override
    public es.eina.tfg.model.Race toUnescapedModel() {
        return new RaceWrapper(_race.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _race.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _race.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _race.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof RaceWrapper)) {
            return false;
        }

        RaceWrapper raceWrapper = (RaceWrapper) obj;

        if (Validator.equals(_race, raceWrapper._race)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Race getWrappedRace() {
        return _race;
    }

    @Override
    public Race getWrappedModel() {
        return _race;
    }

    @Override
    public void resetOriginalValues() {
        _race.resetOriginalValues();
    }
}
