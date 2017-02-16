package es.eina.tfg.service.persistence;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;
import es.eina.tfg.model.Location;

public class LocationFinderImpl
        extends BasePersistenceImpl<Location>
        implements LocationFinder {

    private static final String DELETE_BY_ID_RACE = LocationFinder.class.getName() + "." + "deleteByIdRace";

    public void deleteByIdRace(long idRace)
            throws SystemException {
        Session session = null;
        try {
            session = openSession();
            String sql = CustomSQLUtil.get(DELETE_BY_ID_RACE);
            SQLQuery query = session.createSQLQuery(sql);
            query.setCacheable(false);

            QueryPos queryPos = QueryPos.getInstance(query);
            queryPos.add(idRace);

            query.executeUpdate();
        } catch (Exception e) {
            _log.error("Exception while getByIdUserAndName process for idRoute: " + idRace);
            throw new SystemException(e);
        } finally {
            closeSession(session);
        }
    }

    private static Log _log = LogFactoryUtil.getLog(RouteLocationFinderImpl.class);
}
