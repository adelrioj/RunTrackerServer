package es.eina.tfg.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import es.eina.tfg.NonExistingUserException;
import es.eina.tfg.model.UserAdditionalData;
import es.eina.tfg.model.UserAndRoute;
import es.eina.tfg.service.UserAdditionalDataLocalService;
import es.eina.tfg.service.UserAdditionalDataLocalServiceUtil;
import es.eina.tfg.service.UserAdditionalDataService;
import es.eina.tfg.service.UserAdditionalDataServiceUtil;
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
public class UserAdditionalDataServiceImpl
    extends UserAdditionalDataServiceBaseImpl {

    public UserAdditionalData add(Long userId, Integer weight, Integer height, String registerType)
            throws SystemException {
        UserAdditionalData userData = UserAdditionalDataLocalServiceUtil.createUserAdditionalData(
                UserAdditionalDataLocalServiceUtil.getUserAdditionalDatasCount());
        userData.setIdUser(userId);
        userData.setWeight(weight);
        userData.setHeight(height);

        return UserAdditionalDataLocalServiceUtil.addUserAdditionalData(userData);
    }

    public UserAdditionalData update(Long userId, Integer weight, Integer height, Long smsCount)
            throws SystemException, PortalException {
        UserAdditionalData userData = UserAdditionalDataLocalServiceUtil.getUserAdditionalData(userId);
        userData.setHeight(height);
        userData.setWeight(weight);
        userData.setSmsCount(smsCount);

        return UserAdditionalDataLocalServiceUtil.updateUserAdditionalData(userData);
    }

    public UserAdditionalData getUserAdditionalData(Long userId) throws SystemException, PortalException {
        return UserAdditionalDataLocalServiceUtil.getUserAdditionalData(userId);
    }
}
