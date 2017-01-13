package es.eina.tfg.RunTrackerBL.util;

import com.liferay.portal.model.User;

import javax.portlet.PortletRequest;

/**
 * Contains small functions and tweaks to handle User actions and data
 *
 * Created by adelrioj on 04/11/2015.
 */
public class UserUtils {

    public static Long getCurrentUserId(PortletRequest request){
        User user = (User) request.getAttribute("USER");
        return user.getUserId();
    }

    public static User getCurrentUser(PortletRequest request){
        return (User) request.getAttribute("USER");
    }
}
