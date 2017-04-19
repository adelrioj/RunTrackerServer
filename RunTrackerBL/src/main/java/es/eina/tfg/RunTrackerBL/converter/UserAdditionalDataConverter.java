package es.eina.tfg.RunTrackerBL.converter;

import com.liferay.portal.model.User;
import es.eina.tfg.RunTrackerBL.entity.UserAdditionalData;

public class UserAdditionalDataConverter {

    public static UserAdditionalData convert(es.eina.tfg.model.UserAdditionalData data, User user){
        UserAdditionalData localData = new UserAdditionalData();
        localData.setUser(user);
        localData.setHeight(data.getHeight());
        localData.setWeight(data.getWeight());
        localData.setSmsCount(data.getSmsCount());
        return localData;
    }
}
