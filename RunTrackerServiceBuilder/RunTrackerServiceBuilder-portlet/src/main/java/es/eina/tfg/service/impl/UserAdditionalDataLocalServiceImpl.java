package es.eina.tfg.service.impl;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import es.eina.tfg.NonExistingUserException;
import es.eina.tfg.model.UserAdditionalData;
import es.eina.tfg.model.UserSelectedRoutes;
import es.eina.tfg.service.UserSelectedRoutesLocalServiceUtil;
import es.eina.tfg.service.base.UserAdditionalDataLocalServiceBaseImpl;

import java.util.List;

/**
 * The implementation of the user additional data local service.
 *
 * <p>
 * All custom service methods should be put in this class.
 * Whenever methods are added, rerun ServiceBuilder to copy their definitions
 * into the {@link es.eina.tfg.service.UserAdditionalDataLocalService} interface.
 * <p>
 * This is a local service.
 * Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author adelrioj
 * @see UserAdditionalDataLocalServiceBaseImpl
 * @see es.eina.tfg.service.UserAdditionalDataLocalServiceUtil
 */
public class UserAdditionalDataLocalServiceImpl extends UserAdditionalDataLocalServiceBaseImpl {

    public UserAdditionalData add(Long userId, Integer weight, Integer height, String registerType)
            throws SystemException, NonExistingUserException {

        User user = UserLocalServiceUtil.fetchUser(userId);
        if (user == null){
            throw new NonExistingUserException("The user: " + userId +" does not exists on the database");
        }

        UserAdditionalData userAdditionalData = createUserAdditionalData(userId);
        userAdditionalData.setWeight(weight);
        userAdditionalData.setHeight(height);
        userAdditionalData.setRegisterType(registerType);
        userAdditionalData.setSmsCounter(0);

        return updateUserAdditionalData(userAdditionalData);
    }

    public UserAdditionalData update(Long userId, Integer weight, Integer height, String registerType, Long smsCounter)
            throws SystemException, NonExistingUserException {
        User user = UserLocalServiceUtil.fetchUser(userId);
        if (user == null){
            throw new NonExistingUserException("The user: " + userId +" does not exists on the database");
        }
        UserAdditionalData userAdditionalData = fetchUserAdditionalData(userId);
        if (userAdditionalData == null){
            throw new NonExistingUserException("The userAdditionalData: " + userId +" does not exists on the database");
        }

        userAdditionalData.setWeight(weight);
        userAdditionalData.setHeight(height);
        userAdditionalData.setRegisterType(registerType);
        userAdditionalData.setSmsCounter(smsCounter);

        return updateUserAdditionalData(userAdditionalData);
    }

    public List<UserSelectedRoutes> getUserSelectedRoutes(Long userId) throws SystemException {
        return UserSelectedRoutesLocalServiceUtil.findByUser(userId);
    }
}