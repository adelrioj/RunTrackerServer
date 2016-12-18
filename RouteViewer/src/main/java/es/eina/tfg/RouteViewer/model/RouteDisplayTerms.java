package es.eina.tfg.RouteViewer.model;

import com.liferay.portal.kernel.dao.search.DisplayTerms;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.model.User;
import es.eina.tfg.RouteViewer.util.UserUtils;

import javax.portlet.PortletRequest;

public class RouteDisplayTerms extends DisplayTerms {

    public static final String NAME = "name";

    private String name;

    //For search purposes
    private User user;

    public RouteDisplayTerms(PortletRequest portletRequest) {
        super(portletRequest);

        name = ParamUtil.getString(portletRequest, NAME);
        user = UserUtils.getCurrentUser(portletRequest);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "RouteDisplayTerms{" +
                "name='" + name + '\'' +
                '}';
    }
}
