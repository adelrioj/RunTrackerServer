package es.eina.tfg.model;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import es.eina.tfg.service.persistence.UserAndEventPK;

import java.io.Serializable;

/**
 * The base model interface for the UserAndEvent service. Represents a row in the &quot;GL_UserAndEvent&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link es.eina.tfg.model.impl.UserAndEventModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link es.eina.tfg.model.impl.UserAndEventImpl}.
 * </p>
 *
 * @author adelrioj
 * @see UserAndEvent
 * @see es.eina.tfg.model.impl.UserAndEventImpl
 * @see es.eina.tfg.model.impl.UserAndEventModelImpl
 * @generated
 */
public interface UserAndEventModel extends BaseModel<UserAndEvent> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a user and event model instance should use the {@link UserAndEvent} interface instead.
     */

    /**
     * Returns the primary key of this user and event.
     *
     * @return the primary key of this user and event
     */
    public UserAndEventPK getPrimaryKey();

    /**
     * Sets the primary key of this user and event.
     *
     * @param primaryKey the primary key of this user and event
     */
    public void setPrimaryKey(UserAndEventPK primaryKey);

    /**
     * Returns the id user of this user and event.
     *
     * @return the id user of this user and event
     */
    public long getIdUser();

    /**
     * Sets the id user of this user and event.
     *
     * @param idUser the id user of this user and event
     */
    public void setIdUser(long idUser);

    /**
     * Returns the id event of this user and event.
     *
     * @return the id event of this user and event
     */
    public long getIdEvent();

    /**
     * Sets the id event of this user and event.
     *
     * @param idEvent the id event of this user and event
     */
    public void setIdEvent(long idEvent);

    /**
     * Returns the id race of this user and event.
     *
     * @return the id race of this user and event
     */
    public long getIdRace();

    /**
     * Sets the id race of this user and event.
     *
     * @param idRace the id race of this user and event
     */
    public void setIdRace(long idRace);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(es.eina.tfg.model.UserAndEvent userAndEvent);

    @Override
    public int hashCode();

    @Override
    public CacheModel<es.eina.tfg.model.UserAndEvent> toCacheModel();

    @Override
    public es.eina.tfg.model.UserAndEvent toEscapedModel();

    @Override
    public es.eina.tfg.model.UserAndEvent toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
