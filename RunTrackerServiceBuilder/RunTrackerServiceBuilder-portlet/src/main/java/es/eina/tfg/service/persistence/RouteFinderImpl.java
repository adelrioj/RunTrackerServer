package es.eina.tfg.service.persistence;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;
import es.eina.tfg.model.Route;
import es.eina.tfg.model.impl.RouteImpl;

import java.math.BigInteger;
import java.util.Collections;
import java.util.List;

public class RouteFinderImpl
        extends BasePersistenceImpl<Route>
        implements RouteFinder {

    private static final String GET_BY_IDUSER_AND_NAME = RouteFinder.class.getName() + "." + "findRouteByUserAndName";
    private static final String GET_BY_IDUSER_AND_NAME_COUNT = RouteFinder.class.getName() + "." + "findRouteByUserAndNameCount";

    public List<Route> getByIdUserAndName(long idUser, String name, int start, int end)
            throws SystemException{
        Session session = null;
        List<Route> resultList;
        try {
            session = openSession();
            String sql = CustomSQLUtil.get(GET_BY_IDUSER_AND_NAME);
            SQLQuery query = session.createSQLQuery(sql);
            query.setCacheable(false);
            query.addEntity("ROUTE", RouteImpl.class);

            QueryPos queryPos = QueryPos.getInstance(query);
            queryPos.add(idUser);
            queryPos.add(
                    (new StringBuilder(StringPool.PERCENT)).append(name).append(StringPool.PERCENT).toString()
            );

            resultList = (List<Route>) QueryUtil.list(query, getDialect(), start, end);
        } catch (Exception e) {
            resultList = Collections.emptyList();
            _log.error("Exception while getByIdUserAndName process for idUser: " + idUser
                    + " and name: " + name);
            throw new SystemException(e);
        } finally {
            closeSession(session);
        }
        return resultList;
    }

    public long getByIdUserAndNameCount(long idUser, String name)
            throws SystemException{
        Session session = null;
        Long result;
        try {
            session = openSession();
            String sql = CustomSQLUtil.get(GET_BY_IDUSER_AND_NAME_COUNT);
            SQLQuery query = session.createSQLQuery(sql);
            query.setCacheable(false);

            QueryPos queryPos = QueryPos.getInstance(query);
            queryPos.add(idUser);
            queryPos.add(
                    (new StringBuilder(StringPool.PERCENT)).append(name).append(StringPool.PERCENT).toString()
            );

            BigInteger biResult = (BigInteger) query.uniqueResult();
            result = biResult.longValue();
        } catch (Exception e) {
            _log.error("Exception while getByIdUserAndName process for idUser: " + idUser
                    + " and name: " + name);
            throw new SystemException(e);
        } finally {
            closeSession(session);
        }
        return result;
    }

    private static Log _log = LogFactoryUtil.getLog(RouteFinderImpl.class);
}