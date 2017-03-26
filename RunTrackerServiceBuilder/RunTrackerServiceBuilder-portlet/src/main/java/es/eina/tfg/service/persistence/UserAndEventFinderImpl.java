package es.eina.tfg.service.persistence;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;
import es.eina.tfg.model.UserAndEvent;
import es.eina.tfg.model.impl.UserAndEventImpl;

import java.util.List;

public class UserAndEventFinderImpl
        extends BasePersistenceImpl<UserAndEvent>
        implements UserAndEventFinder {

    private static final String FIND_BY_ID_EVENT_AND_NAME = UserAndEventFinder.class.getName() + "."
            + "findByIdEventAndName";
    private static final String ADD = UserAndEventFinder.class.getName() + "."
            + "addUserAndEvent";

    public void add(long idUser, long idEvent)
            throws SystemException {
        Session session = null;
        try {
            session = openSession();
            String sql = CustomSQLUtil.get(ADD);
            SQLQuery query = session.createSQLQuery(sql);

            QueryPos queryPos = QueryPos.getInstance(query);
            queryPos.add(idUser);
            queryPos.add(idEvent);

            query.executeUpdate();

        } catch (Exception e) {
            _log.error("Exception while add process for idEvent: " + idEvent + " and idUser: " + idUser, e);
            throw new com.liferay.portal.kernel.exception.SystemException(e);
        } finally {
            closeSession(session);
        }
    }

    public List<UserAndEvent> getByIdEventAndName(long idEvent, String name)
            throws SystemException {
        return getByIdEventAndName(idEvent, name, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    public List<UserAndEvent> getByIdEventAndName(long idEvent, String name, int start, int end)
            throws SystemException {
        return getByIdEventAndName(idEvent, name, start, end, null);
    }

    public List<UserAndEvent> getByIdEventAndName(long idEvent,
                                                  String name,
                                                  int start,
                                                  int end,
                                                  OrderByComparator orderByComparator)
            throws SystemException {
        Session session = null;
        List<UserAndEvent> resultList;
        try {
            String initialSql = CustomSQLUtil.get(FIND_BY_ID_EVENT_AND_NAME);
            String sql;
            StringBundler sbQuery;
            if (orderByComparator != null) {
                sbQuery = new StringBundler(2 + (orderByComparator.getOrderByFields().length * 3));
                sbQuery.append(initialSql);

                appendOrderByComparator(sbQuery, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

                sql = sbQuery.toString();
            } else {
                sql = initialSql;
            }

            session = openSession();
            SQLQuery query = session.createSQLQuery(sql);
            query.setCacheable(false);
            query.addEntity("USER_AND_EVENT", UserAndEventImpl.class);

            QueryPos queryPos = QueryPos.getInstance(query);
            queryPos.add(idEvent);
            queryPos.add("%" + name + "%");
            queryPos.add("%" + name + "%");
            queryPos.add("%" + name + "%");

            resultList = (List<UserAndEvent>) QueryUtil.list(query, getDialect(), start, end);
        } catch (Exception e) {
            _log.error("Exception while getUserAndEventByIdEvent process for idEvent: " + idEvent, e);
            throw new com.liferay.portal.kernel.exception.SystemException(e);
        } finally {
            closeSession(session);
        }
        return resultList;
    }

    private static final String _ORDER_BY_ENTITY_ALIAS = "userAndEvent.";

    private static Log _log = LogFactoryUtil.getLog(UserAndEventFinderImpl.class);
}
