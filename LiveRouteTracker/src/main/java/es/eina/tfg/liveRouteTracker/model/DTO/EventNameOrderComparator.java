package es.eina.tfg.liveRouteTracker.model.DTO;

import com.liferay.portal.kernel.util.OrderByComparator;

public class EventNameOrderComparator extends OrderByComparator {

    public static String NAME_BY_ASC = "name ASC";
    public static String NAME_BY_DESC = "name DESC";

    private boolean _asc;

    public EventNameOrderComparator() {
        this(false);
    }

    public EventNameOrderComparator(boolean asc) {
        _asc = asc;
    }

    public String getOrderBy() {
        return _asc ? NAME_BY_ASC : NAME_BY_DESC;
    }


    @Override
    public int compare(Object obj1, Object obj2) {
        String date1 = (String) obj1;
        String date2 = (String) obj2;

        if (_asc){
            return date1.compareTo(date2);
        } else {
            return -date1.compareTo(date2);
        }
    }
}
