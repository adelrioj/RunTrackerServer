package es.eina.tfg.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import es.eina.tfg.model.Event;
import es.eina.tfg.service.EventLocalServiceUtil;

/**
 * @author adelrioj
 * @generated
 */
public abstract class EventActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public EventActionableDynamicQuery() throws SystemException {
        setBaseLocalService(EventLocalServiceUtil.getService());
        setClass(Event.class);

        setClassLoader(es.eina.tfg.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("idEvent");
    }
}
