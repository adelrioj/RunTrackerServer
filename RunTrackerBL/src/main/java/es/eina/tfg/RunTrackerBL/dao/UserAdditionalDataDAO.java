package es.eina.tfg.RunTrackerBL.dao;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import es.eina.tfg.RunTrackerBL.converter.UserAdditionalDataConverter;
import es.eina.tfg.RunTrackerBL.entity.UserAdditionalData;
import es.eina.tfg.service.UserAdditionalDataLocalServiceUtil;

public class UserAdditionalDataDAO {

    public static UserAdditionalData insert(long idUser)
            throws SystemException, PortalException {
        es.eina.tfg.model.UserAdditionalData sbData = UserAdditionalDataLocalServiceUtil.add(idUser);
        User user = UserLocalServiceUtil.getUser(idUser);
        return UserAdditionalDataConverter.convert(sbData, user);
    }

    public static UserAdditionalData update(UserAdditionalData data)
            throws SystemException, PortalException {
        es.eina.tfg.model.UserAdditionalData sbData =
                UserAdditionalDataLocalServiceUtil.getUserAdditionalData(data.getUser().getUserId());
        if (data.getHeight() > 0)
            sbData.setHeight(data.getHeight());
        if (data.getWeight() > 0)
            sbData.setWeight(data.getWeight());
        if (data.getSmsCount() > 0)
        sbData.setSmsCount(data.getSmsCount());

        es.eina.tfg.model.UserAdditionalData sbReturnData = UserAdditionalDataLocalServiceUtil.update(sbData);
        User user = UserLocalServiceUtil.getUser(sbReturnData.getIdUser());
        return UserAdditionalDataConverter.convert(sbReturnData, user);
    }

    public static UserAdditionalData getById(long idUser)
            throws SystemException, PortalException {
        es.eina.tfg.model.UserAdditionalData sbData = UserAdditionalDataLocalServiceUtil.getUserAdditionalData(idUser);
        User user = UserLocalServiceUtil.getUser(sbData.getIdUser());
        return UserAdditionalDataConverter.convert(sbData, user);
    }
}
