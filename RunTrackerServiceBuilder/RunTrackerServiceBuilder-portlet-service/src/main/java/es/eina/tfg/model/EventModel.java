package es.eina.tfg.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Event service. Represents a row in the &quot;GL_Event&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link es.eina.tfg.model.impl.EventModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link es.eina.tfg.model.impl.EventImpl}.
 * </p>
 *
 * @author adelrioj
 * @see Event
 * @see es.eina.tfg.model.impl.EventImpl
 * @see es.eina.tfg.model.impl.EventModelImpl
 * @generated
 */
public interface EventModel extends BaseModel<Event> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a event model instance should use the {@link Event} interface instead.
     */

    /**
     * Returns the primary key of this event.
     *
     * @return the primary key of this event
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this event.
     *
     * @param primaryKey the primary key of this event
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the id event of this event.
     *
     * @return the id event of this event
     */
    public long getIdEvent();

    /**
     * Sets the id event of this event.
     *
     * @param idEvent the id event of this event
     */
    public void setIdEvent(long idEvent);

    /**
     * Returns the id route of this event.
     *
     * @return the id route of this event
     */
    public long getIdRoute();

    /**
     * Sets the id route of this event.
     *
     * @param idRoute the id route of this event
     */
    public void setIdRoute(long idRoute);

    /**
     * Returns the id author of this event.
     *
     * @return the id author of this event
     */
    public long getIdAuthor();

    /**
     * Sets the id author of this event.
     *
     * @param idAuthor the id author of this event
     */
    public void setIdAuthor(long idAuthor);

    /**
     * Returns the name of this event.
     *
     * @return the name of this event
     */
    @AutoEscape
    public String getName();

    /**
     * Sets the name of this event.
     *
     * @param name the name of this event
     */
    public void setName(String name);

    /**
     * Returns the planned starting time of this event.
     *
     * @return the planned starting time of this event
     */
    public Date getPlannedStartingTime();

    /**
     * Sets the planned starting time of this event.
     *
     * @param plannedStartingTime the planned starting time of this event
     */
    public void setPlannedStartingTime(Date plannedStartingTime);

    /**
     * Returns the planned finish time of this event.
     *
     * @return the planned finish time of this event
     */
    public Date getPlannedFinishTime();

    /**
     * Sets the planned finish time of this event.
     *
     * @param plannedFinishTime the planned finish time of this event
     */
    public void setPlannedFinishTime(Date plannedFinishTime);

    /**
     * Returns the real starting time of this event.
     *
     * @return the real starting time of this event
     */
    public Date getRealStartingTime();

    /**
     * Sets the real starting time of this event.
     *
     * @param realStartingTime the real starting time of this event
     */
    public void setRealStartingTime(Date realStartingTime);

    /**
     * Returns the real finish time of this event.
     *
     * @return the real finish time of this event
     */
    public Date getRealFinishTime();

    /**
     * Sets the real finish time of this event.
     *
     * @param realFinishTime the real finish time of this event
     */
    public void setRealFinishTime(Date realFinishTime);

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
    public int compareTo(es.eina.tfg.model.Event event);

    @Override
    public int hashCode();

    @Override
    public CacheModel<es.eina.tfg.model.Event> toCacheModel();

    @Override
    public es.eina.tfg.model.Event toEscapedModel();

    @Override
    public es.eina.tfg.model.Event toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
