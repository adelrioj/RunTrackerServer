package es.eina.tfg.RunTrackerBL.comparator.userAndEvent;

import com.liferay.portal.kernel.util.OrderByComparator;

public class UserAndEventParticipationNumberOrderComparator extends OrderByComparator {

    public static String PARTICIPATION_NUMBER_BY_ASC = "participationNumber ASC";
    public static String PARTICIPATION_NUMBER_BY_DESC = "participationNumber DESC";

    private boolean _asc;

    public UserAndEventParticipationNumberOrderComparator() {
        this(false);
    }

    public UserAndEventParticipationNumberOrderComparator(boolean asc) {
        _asc = asc;
    }

    public String getOrderBy() {
        return _asc ? PARTICIPATION_NUMBER_BY_ASC : PARTICIPATION_NUMBER_BY_DESC;
    }


    @Override
    public int compare(Object obj1, Object obj2) {
        Integer int1 = (Integer) obj1;
        Integer int2 = (Integer) obj2;

        if (_asc){
            return int1.compareTo(int2);
        } else {
            return -int1.compareTo(int2);
        }
    }
}
