package es.eina.tfg.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import es.eina.tfg.NonExistingUserException;
import es.eina.tfg.model.UserAdditionalData;
import es.eina.tfg.model.UserSelectedRoutes;
import es.eina.tfg.service.UserAdditionalDataLocalServiceUtil;
import es.eina.tfg.service.base.UserAdditionalDataServiceBaseImpl;

import java.util.List;

/**
 * The implementation of the user additional data remote service.
 *
 * <p>
 * All custom service methods should be put in this class.
 * Whenever methods are added, rerun ServiceBuilder to copy their definitions
 * into the {@link es.eina.tfg.service.UserAdditionalDataService} interface.
 * <p>
 * This is a remote service.
 * Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author adelrioj
 * @see UserAdditionalDataServiceBaseImpl
 * @see es.eina.tfg.service.UserAdditionalDataServiceUtil
 */
public class UserAdditionalDataServiceImpl extends UserAdditionalDataServiceBaseImpl {
    public UserAdditionalData add(Long userId, Integer weight, Integer height, String registerType)
            throws SystemException, NonExistingUserException {
        return UserAdditionalDataLocalServiceUtil.add(userId, weight, height, registerType);
    }

    public UserAdditionalData update(Long userId, Integer weight, Integer height, String registerType, Long smsCount)
            throws SystemException, NonExistingUserException {
        return UserAdditionalDataLocalServiceUtil.update(userId, weight, height, registerType, smsCount);
    }

    public UserAdditionalData delete (Long userId) throws SystemException, PortalException {
        return UserAdditionalDataLocalServiceUtil.deleteUserAdditionalData(userId);
    }

    public UserAdditionalData getUserAdditionalData (Long userId) throws SystemException, PortalException {
        return UserAdditionalDataLocalServiceUtil.getUserAdditionalData(userId);
    }

    public List<UserSelectedRoutes> getUserSelectedRoutes(Long userId) throws SystemException {
        return UserAdditionalDataLocalServiceUtil.getUserSelectedRoutes(userId);
    }
}