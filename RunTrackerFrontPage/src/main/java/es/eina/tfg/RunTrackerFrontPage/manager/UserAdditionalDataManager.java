package es.eina.tfg.RunTrackerFrontPage.manager;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import es.eina.tfg.RunTrackerBL.dao.UserAdditionalDataDAO;
import es.eina.tfg.RunTrackerBL.entity.UserAdditionalData;

import static com.liferay.portal.kernel.util.Validator.isNotNull;

public class UserAdditionalDataManager {

    public static UserAdditionalData update(User user, int weight, int height)
            throws PortalException, SystemException {
        UserAdditionalData toReturn = null;
        if (isNotNull(height) && isNotNull(weight)) {
            UserAdditionalData userAdditionalData = new UserAdditionalData();
            userAdditionalData.setUser(user);
            userAdditionalData.setWeight(weight);
            userAdditionalData.setHeight(height);
            userAdditionalData.setSmsCount(0);
            toReturn = UserAdditionalDataDAO.update(userAdditionalData);
        }
        return toReturn;
    }

    public static UserAdditionalData getByIdOrCreate(long idUser)
            throws PortalException, SystemException {
        UserAdditionalData data = UserAdditionalDataDAO.getById(idUser);
        if (data == null){
            data = UserAdditionalDataDAO.insert(idUser);
        }
        return data;
    }
}
