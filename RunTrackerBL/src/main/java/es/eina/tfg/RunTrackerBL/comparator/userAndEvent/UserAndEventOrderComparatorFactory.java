package es.eina.tfg.RunTrackerBL.comparator.userAndEvent;

import com.liferay.portal.kernel.util.OrderByComparator;

public class UserAndEventOrderComparatorFactory {

    public static final String ORDER_BY_TYPE_ASC = "asc";
    public static final String ORDER_BY_TYPE_DESC = "desc";

    public static final String ORDER_BY_COL_PARTICIPATION_NUMBER = "participationNumber";

    /**
     * Factory used to create Event OrderByComparator comparators, used in Search Container sorting
     * @param orderByCol is the column name passed in the request while sorting. eg: "name"
     * @param orderByType is passed in the request while sorting. It can be either asc or desc.
     * @return OrderByComparator of the orderByCol type given
     */
    public static OrderByComparator getUserAndEventOrderByComparator(String orderByCol, String orderByType){

        OrderByComparator orderByComparator = null;
        boolean isAsc = orderByType.equals(ORDER_BY_TYPE_ASC);
        if (orderByCol.equals(ORDER_BY_COL_PARTICIPATION_NUMBER)){
            orderByComparator = new UserAndEventParticipationNumberOrderComparator(isAsc);
        }

        return orderByComparator;
    }
}
