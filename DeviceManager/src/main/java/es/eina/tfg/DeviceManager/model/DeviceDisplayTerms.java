package es.eina.tfg.DeviceManager.model;

import com.liferay.portal.kernel.dao.search.DisplayTerms;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.model.User;
import es.eina.tfg.RunTrackerBL.util.UserUtils;

import javax.portlet.PortletRequest;

public class DeviceDisplayTerms extends DisplayTerms {

    public static final String DESCRIPTION = "deviceDescriptionSearch";

    private String description;
    //For search purposes
    private User user;

    public DeviceDisplayTerms(PortletRequest portletRequest) {
        super(portletRequest);
        description = ParamUtil.getString(portletRequest, DESCRIPTION);
        user = UserUtils.getCurrentUser(portletRequest);
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "DeviceDisplayTerms{" +
                "description='" + description + '\'' +
                ", user=" + user +
                '}';
    }
}
