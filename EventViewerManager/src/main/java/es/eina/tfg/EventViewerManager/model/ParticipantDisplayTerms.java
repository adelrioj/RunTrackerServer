package es.eina.tfg.EventViewerManager.model;

import com.liferay.portal.kernel.dao.search.DisplayTerms;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.model.User;
import es.eina.tfg.RunTrackerBL.util.UserUtils;

import javax.portlet.PortletRequest;

public class ParticipantDisplayTerms extends DisplayTerms{

    public static final String NAME = "name";
    private static final String IDEVENT = "idEvent";

    private String name;
    private Long idEvent;

    public ParticipantDisplayTerms(PortletRequest portletRequest) {
        super(portletRequest);
        this.name = ParamUtil.getString(portletRequest, NAME);
        this.idEvent = ParamUtil.getLong(portletRequest, IDEVENT);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(Long idEvent) {
        this.idEvent = idEvent;
    }

    @Override
    public String toString() {
        return "ParticipantDisplayTerms{" +
                "name='" + name + '\'' +
                ", idEvent=" + idEvent +
                '}';
    }
}
