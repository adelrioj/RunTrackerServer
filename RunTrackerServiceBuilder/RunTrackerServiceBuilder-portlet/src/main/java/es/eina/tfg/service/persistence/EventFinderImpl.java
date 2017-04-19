package es.eina.tfg.service.persistence;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;
import es.eina.tfg.model.Event;
import es.eina.tfg.model.Race;
import es.eina.tfg.model.UserAndEvent;
import es.eina.tfg.model.impl.EventImpl;
import es.eina.tfg.model.impl.RaceImpl;
import es.eina.tfg.model.impl.UserAndEventImpl;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

public class EventFinderImpl
        extends BasePersistenceImpl<Event>
        implements EventFinder  {

    private static final String GET_BY_IDUSER_AND_TIME_RANGE = EventFinder.class.getName() + "."
            + "findEventByIdUserAndTimeRange";
    private static final String GET_UNSELECTED_EVENTS_BY_ID_USER_AND_TIME_RANGE = EventFinder.class.getName() + "."
            + "findUnselectedEventsByIdUserAndTimeRange";
    private static final String GET_LAST_EVENT = EventFinder.class.getName() + "."
            + "findLastEvent";
    private static final String GET_LAST_UNSELECTED_EVENT = EventFinder.class.getName() + "."
            + "findLastUnselectedEvent";
    private static final String COUNT_BY_ID_AUTHOR = EventFinder.class.getName() + "."
            + "countByIdAuthor";

    public List<Event> getByIdUserAndTimeRange(long idUser,
                                               Date startPlannedStartingTime,
                                               Date endPlannedStartingTime,
                                               int start,
                                               int end)
            throws SystemException {
        Session session = null;
        List<Event> resultList;
        try {
            session = openSession();
            String sql = CustomSQLUtil.get(GET_BY_IDUSER_AND_TIME_RANGE);
            SQLQuery query = session.createSQLQuery(sql);
            query.setCacheable(false);
            query.addEntity("EVENT", EventImpl.class);

            QueryPos queryPos = QueryPos.getInstance(query);
            queryPos.add(idUser);
            queryPos.add(idUser);
            queryPos.add(startPlannedStartingTime);
            queryPos.add(endPlannedStartingTime);

            resultList = (List<Event>) QueryUtil.list(query, getDialect(), start, end);
        } catch (Exception e) {
            _log.error("Exception while getByIdUserAndTimeRange process for idUser: " + idUser
                    + " and times: " + startPlannedStartingTime + " , "
                    + endPlannedStartingTime, e);
            throw new com.liferay.portal.kernel.exception.SystemException(e);
        } finally {
            closeSession(session);
        }
        return resultList;
    }

    public List<Event> getUnselectedEventsByIdUserAndTimeRange(long idUser,
                                                               Date startPlannedStartingTime,
                                                               Date endPlannedStartingTime,
                                                               int start,
                                                               int end)
            throws SystemException {
        Session session = null;
        List<Event> resultList;
        try {
            session = openSession();
            String sql = CustomSQLUtil.get(GET_UNSELECTED_EVENTS_BY_ID_USER_AND_TIME_RANGE);
            SQLQuery query = session.createSQLQuery(sql);
            query.setCacheable(false);
            query.addEntity("EVENT", EventImpl.class);

            QueryPos queryPos = QueryPos.getInstance(query);
            queryPos.add(idUser);
            queryPos.add(idUser);
            queryPos.add(startPlannedStartingTime);
            queryPos.add(endPlannedStartingTime);

            resultList = (List<Event>) QueryUtil.list(query, getDialect(), start, end);
        } catch (Exception e) {
            _log.error("Exception while getUnselectedEventsByIdUserAndTimeRange process for idUser: " + idUser
                    + " and times: " + startPlannedStartingTime + " , "
                    + endPlannedStartingTime, e);
            throw new com.liferay.portal.kernel.exception.SystemException(e);
        } finally {
            closeSession(session);
        }
        return resultList;
    }

    public Event getLastEvent(long idUser)
            throws SystemException {
        Session session = null;
        Event result;
        try {
            session = openSession();
            String sql = CustomSQLUtil.get(GET_LAST_EVENT);
            SQLQuery query = session.createSQLQuery(sql);
            query.setCacheable(false);
            query.addEntity("EVENT", EventImpl.class);

            QueryPos queryPos = QueryPos.getInstance(query);
            queryPos.add(idUser);
            queryPos.add(idUser);
            queryPos.add(idUser);
            queryPos.add(idUser);

            result = (Event) query.uniqueResult();
        } catch (Exception e) {
            _log.error("Exception while getLastEvent process for idUser: " + idUser);
            throw new SystemException(e);
        } finally {
            closeSession(session);
        }
        return result;
    }

    public Event getLastUnselectedEvent(long idUser)
            throws SystemException {
        Session session = null;
        Event result;
        try {
            session = openSession();
            String sql = CustomSQLUtil.get(GET_LAST_UNSELECTED_EVENT);
            SQLQuery query = session.createSQLQuery(sql);
            query.setCacheable(false);
            query.addEntity("EVENT", EventImpl.class);

            QueryPos queryPos = QueryPos.getInstance(query);
            queryPos.add(idUser);
            queryPos.add(idUser);
            queryPos.add(idUser);
            queryPos.add(idUser);

            result = (Event) query.uniqueResult();
        } catch (Exception e) {
            _log.error("Exception while getLastUnselectedEvent process for idUser: " + idUser);
            throw new SystemException(e);
        } finally {
            closeSession(session);
        }
        return result;
    }

    public long countByIdAuthor(long idAuthor)
            throws SystemException {
        Session session = null;
        Long result;
        try {
            session = openSession();
            String sql = CustomSQLUtil.get(COUNT_BY_ID_AUTHOR);
            SQLQuery query = session.createSQLQuery(sql);
            query.setCacheable(false);

            QueryPos queryPos = QueryPos.getInstance(query);
            queryPos.add(idAuthor);

            BigInteger biResult = (BigInteger) query.uniqueResult();
            result = biResult.longValue();
        } catch (Exception e) {
            _log.error("Exception while countByIdAuthor process for idAuthor: " + idAuthor);
            throw new SystemException(e);
        } finally {
            closeSession(session);
        }
        return result;
    }

    private static Log _log = LogFactoryUtil.getLog(EventFinderImpl.class);
}
