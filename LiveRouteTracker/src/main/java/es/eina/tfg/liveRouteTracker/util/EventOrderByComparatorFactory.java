package es.eina.tfg.liveRouteTracker.util;

import com.liferay.portal.kernel.util.OrderByComparator;
import es.eina.tfg.liveRouteTracker.model.DTO.EventNameOrderComparator;
import es.eina.tfg.liveRouteTracker.model.DTO.EventPlannedStartingTimeOrderComparator;

public class EventOrderByComparatorFactory {

    public static final String ORDER_BY_TYPE_ASC = "asc";
    public static final String ORDER_BY_TYPE_DESC = "desc";

    public static final String ORDER_BY_COL_PLANNED_START_TIME = "plannedStartTime";
    public static final String ORDER_BY_COL_NAME = "name";

    /**
     * Factory used to create Event OrderByComparator comparators, used in Search Container sorting
     * @param orderByCol is the column name passed in the request while sorting. eg: "name"
     * @param orderByType is passed in the request while sorting. It can be either asc or desc.
     * @return OrderByComparator of the orderByCol type given
     */
    public static OrderByComparator getEventOrderByComparator(String orderByCol, String orderByType){

        OrderByComparator orderByComparator = null;
        boolean isAsc = orderByType.equals(ORDER_BY_TYPE_ASC);
        if (orderByCol.equals(ORDER_BY_COL_PLANNED_START_TIME)){
            orderByComparator = new EventPlannedStartingTimeOrderComparator(isAsc);
        } else if (orderByCol.equals(ORDER_BY_COL_NAME)){
            orderByComparator = new EventNameOrderComparator(isAsc);
        }

        return orderByComparator;
    }
}
