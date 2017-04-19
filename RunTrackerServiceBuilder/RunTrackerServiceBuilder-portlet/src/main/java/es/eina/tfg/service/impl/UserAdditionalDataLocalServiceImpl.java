package es.eina.tfg.service.impl;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import es.eina.tfg.model.UserAdditionalData;
import es.eina.tfg.service.base.UserAdditionalDataLocalServiceBaseImpl;

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
public class UserAdditionalDataLocalServiceImpl
    extends UserAdditionalDataLocalServiceBaseImpl {

    public UserAdditionalData add(long idUser)
            throws SystemException {
        UserAdditionalData data = createUserAdditionalData(idUser);
        data.setHeight(0);
        data.setWeight(0);
        data.setSmsCount(0);
        return add(data);
    }

    public UserAdditionalData add(UserAdditionalData userAdditionalData)
            throws SystemException {
        checkMadatoryAttributes(userAdditionalData);
        userAdditionalData.setSmsCount(0);
        return super.addUserAdditionalData(userAdditionalData);
    }

    public UserAdditionalData update(UserAdditionalData userAdditionalData)
            throws SystemException {
        checkMadatoryAttributes(userAdditionalData);
        return super.updateUserAdditionalData(userAdditionalData);
    }

    private void checkMadatoryAttributes(UserAdditionalData userAdditionalData)
            throws SystemException {
        User user = UserLocalServiceUtil.fetchUser(userAdditionalData.getIdUser());
        if (user == null){
            throw new SystemException("The user: "
                    + userAdditionalData.getIdUser() +" does not exists on the database");
        }
    }
}
