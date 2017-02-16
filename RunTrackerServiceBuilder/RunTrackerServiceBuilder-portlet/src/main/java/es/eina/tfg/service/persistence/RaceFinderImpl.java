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
import es.eina.tfg.model.Race;
import es.eina.tfg.model.impl.RaceImpl;

import java.util.Date;
import java.util.List;

public class RaceFinderImpl
        extends BasePersistenceImpl<Race>
        implements RaceFinder{

    private static final String GET_BY_IDUSER_AND_TIME_RANGE = RaceFinder.class.getName() + "."
            + "findRaceByIdUserAndTimeRange";
    private static final String GET_LAST_RACE = RaceFinder.class.getName() + "."
            + "findLastRace";

    public List<Race> getByIdUserAndTimeRange(long idUser, Date startTime, Date endTime, int start, int end)
            throws SystemException {
        Session session = null;
        List<Race> resultList;
        try {
            session = openSession();
            String sql = CustomSQLUtil.get(GET_BY_IDUSER_AND_TIME_RANGE);
            SQLQuery query = session.createSQLQuery(sql);
            query.setCacheable(false);
            query.addEntity("RACE", RaceImpl.class);

            QueryPos queryPos = QueryPos.getInstance(query);
            queryPos.add(idUser);
            queryPos.add(startTime);
            queryPos.add(endTime);

            resultList = (List<Race>) QueryUtil.list(query, getDialect(), start, end);
        } catch (Exception e) {
            _log.error("Exception while getByIdUserAndName process for idUser: " + idUser
                    + " and times: " + startTime + " , " + endTime);
            throw new SystemException(e);
        } finally {
            closeSession(session);
        }
        return resultList;
    }
    public Race getLastRace(long idUser)
            throws SystemException {
        Session session = null;
        Race result;
        try {
            session = openSession();
            String sql = CustomSQLUtil.get(GET_LAST_RACE);
            SQLQuery query = session.createSQLQuery(sql);
            query.setCacheable(false);
            query.addEntity("RACE", RaceImpl.class);

            QueryPos queryPos = QueryPos.getInstance(query);
            queryPos.add(idUser);
            queryPos.add(idUser);

            result = (Race) query.uniqueResult();
        } catch (Exception e) {
            _log.error("Exception while getLastRace process for idUser: " + idUser);
            throw new SystemException(e);
        } finally {
            closeSession(session);
        }
        return result;
    }

    private static Log _log = LogFactoryUtil.getLog(RaceFinderImpl.class);
}
