package es.eina.tfg.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import es.eina.tfg.model.Device;
import es.eina.tfg.service.DeviceLocalServiceUtil;

/**
 * @author adelrioj
 * @generated
 */
public abstract class DeviceActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public DeviceActionableDynamicQuery() throws SystemException {
        setBaseLocalService(DeviceLocalServiceUtil.getService());
        setClass(Device.class);

        setClassLoader(es.eina.tfg.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("idDevice");
    }
}
