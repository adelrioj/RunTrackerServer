package es.eina.tfg.EventViewerManager.model;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import es.eina.tfg.EventViewerManager.model.DTO.Participant;
import es.eina.tfg.RunTrackerBL.dao.EventDAO;
import es.eina.tfg.RunTrackerBL.entity.UserAndEvent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ParticipantManager {

    public static List<Participant> getParticipantsByDisplayTerms(ParticipantDisplayTerms displayTerms,
                                                                   int start,
                                                                   int end) {
        _log.info("Starting getParticipantsByDisplayTerms for ParticipantDisplayTerms: " + displayTerms);
        List<UserAndEvent> userAndEvents = Collections.emptyList();
        try {
            userAndEvents = EventDAO.getParticipants(displayTerms.getIdEvent(), displayTerms.getName(), start, end);
        } catch (SystemException e) {
            _log.error("SystemException throwed for: " + displayTerms);
        } catch (PortalException e) {
            _log.error("PortalException throwed for: " + displayTerms);
        }

        List<Participant> participants = new ArrayList<Participant>();
        int number = 1;
        for (UserAndEvent userAndEvent : userAndEvents) {
            Participant participant = new Participant();
            participant.setIdUser(userAndEvent.getParticipant().getUserId());
            participant.setName(userAndEvent.getParticipant().getFullName());
            participant.setParticipationNumber(number);
            participants.add(participant);
            number++;
        }

        return participants;
    }

    public static int getParticipantsByDisplayTermsCount(ParticipantDisplayTerms displayTerms) {
        return getParticipantsByDisplayTerms(displayTerms, 0, 9999).size();
    }

    private static Log _log = LogFactoryUtil.getLog(ParticipantManager.class);
}
