package es.eina.tfg.service.persistence;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;
import es.eina.tfg.model.RouteLocation;

public class RouteLocationFinderImpl
        extends BasePersistenceImpl<RouteLocation>
        implements RouteLocationFinder{

    private static final String DELETE_BY_ID_ROUTE = RouteLocationFinder.class.getName() + "." + "deleteByIdRoute";

    public void deleteByIdRoute(long idRoute) throws SystemException {
        Session session = null;
        try {
            session = openSession();
            String sql = CustomSQLUtil.get(DELETE_BY_ID_ROUTE);
            SQLQuery query = session.createSQLQuery(sql);
            query.setCacheable(false);

            QueryPos queryPos = QueryPos.getInstance(query);
            queryPos.add(idRoute);

            query.uniqueResult();
        } catch (Exception e) {
            _log.error("Exception while getByIdUserAndName process for idRoute: " + idRoute);
            throw new SystemException(e);
        } finally {
            closeSession(session);
        }
    }

    private static Log _log = LogFactoryUtil.getLog(RouteLocationFinderImpl.class);
}
