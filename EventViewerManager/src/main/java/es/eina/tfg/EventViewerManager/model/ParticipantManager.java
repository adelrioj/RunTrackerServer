package es.eina.tfg.EventViewerManager.model;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import es.eina.tfg.EventViewerManager.model.DTO.Participant;
import es.eina.tfg.RunTrackerBL.dao.UserAndEventDAO;
import es.eina.tfg.RunTrackerBL.entity.UserAndEvent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ParticipantManager {

    public static List<Participant> getParticipantsByDisplayTerms(ParticipantDisplayTerms displayTerms,
                                                                  int start,
                                                                  int end,
                                                                  OrderByComparator orderByComparator) {
        _log.info("Starting getParticipantsByDisplayTerms for ParticipantDisplayTerms: " + displayTerms);

        Long idEvent = displayTerms.getIdEvent();
        String name = displayTerms.isAdvancedSearch() ? displayTerms.getName() : displayTerms.getKeywords();

        List<UserAndEvent> userAndEvents = Collections.emptyList();
        try {
            userAndEvents = UserAndEventDAO.getByIdEventAndName(idEvent, name, start, end, orderByComparator);
        } catch (SystemException e) {
            _log.error("SystemException throwed for: " + displayTerms, e);
        } catch (PortalException e) {
            _log.error("PortalException throwed for: " + displayTerms, e);
        }

        List<Participant> participants = new ArrayList<Participant>();
        for (UserAndEvent userAndEvent : userAndEvents) {
            Participant participant = convert(userAndEvent);
            participants.add(participant);
        }

        return participants;
    }

    public static int getParticipantsByDisplayTermsCount(ParticipantDisplayTerms displayTerms) {

        Long idEvent = displayTerms.getIdEvent();
        String name = displayTerms.isAdvancedSearch() ? displayTerms.getName() : displayTerms.getKeywords();

        List<UserAndEvent> userAndEvents = Collections.emptyList();
        try {
            userAndEvents = UserAndEventDAO.getByIdEventAndName(idEvent, name);
        } catch (SystemException e) {
            _log.error("SystemException throwed for: " + displayTerms, e);
        } catch (PortalException e) {
            _log.error("PortalException throwed for: " + displayTerms, e);
        }
        return userAndEvents.size();
    }

    private static Participant convert(UserAndEvent userAndEvent) {
        Participant participant = new Participant();
        participant.setIdUser(userAndEvent.getParticipant().getUserId());
        participant.setName(userAndEvent.getParticipant().getFullName());
        participant.setParticipationNumber(userAndEvent.getParticipationNumber());
        return participant;
    }

    private static Log _log = LogFactoryUtil.getLog(ParticipantManager.class);
}
