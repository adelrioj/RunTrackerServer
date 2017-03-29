package es.eina.tfg.liveRouteTracker.model.DTO;

import com.liferay.portal.kernel.util.OrderByComparator;

import java.util.Date;

public class EventPlannedStartingTimeOrderComparator extends OrderByComparator {

    public static String PLANNED_STARTING_TIME_BY_ASC = "plannedStartingTime ASC";
    public static String PLANNED_STARTING_TIME_BY_DESC = "plannedStartingTime DESC";

    private boolean _asc;

    public EventPlannedStartingTimeOrderComparator() {
        this(false);
    }

    public EventPlannedStartingTimeOrderComparator(boolean asc) {
        _asc = asc;
    }

    public String getOrderBy() {
        return _asc ? PLANNED_STARTING_TIME_BY_ASC : PLANNED_STARTING_TIME_BY_DESC;
    }


    @Override
    public int compare(Object obj1, Object obj2) {
        Date date1 = (Date) obj1;
        Date date2 = (Date) obj2;

        if (_asc){
            return date1.compareTo(date2);
        } else {
            return -date1.compareTo(date2);
        }
    }
}
