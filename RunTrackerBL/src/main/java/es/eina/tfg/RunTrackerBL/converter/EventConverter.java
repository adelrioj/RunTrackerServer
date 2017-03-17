package es.eina.tfg.RunTrackerBL.converter;

import com.liferay.portal.model.User;
import org.joda.time.DateTime;

public class EventConverter {

    public static es.eina.tfg.RunTrackerBL.entity.Event convert(es.eina.tfg.model.Event toConvert,
                                                                es.eina.tfg.RunTrackerBL.entity.Route route,
                                                                User author){
        es.eina.tfg.RunTrackerBL.entity.Event localEvent = new es.eina.tfg.RunTrackerBL.entity.Event();
        localEvent.setIdEvent(toConvert.getIdEvent());
        localEvent.setRoute(route);
        localEvent.setAuthor(author);
        localEvent.setName(toConvert.getName());
        localEvent.setPlannedStartTime(new DateTime(toConvert.getPlannedStartingTime()));
        localEvent.setPlannedFinishTime(new DateTime(toConvert.getPlannedFinishTime()));
        if (toConvert.getRealStartingTime() != null){
            localEvent.setRealStartTime(new DateTime(toConvert.getRealStartingTime()));
        }
        if (toConvert.getRealFinishTime() != null) {
            localEvent.setRealFinishTime(new DateTime(toConvert.getRealFinishTime()));
        }
        return localEvent;
    }
}
