package es.eina.tfg.RouteViewer.model.compare;

import com.liferay.portal.kernel.util.OrderByComparator;
import es.eina.tfg.model.Route;

/**
 * Compare routes by name
 *
 * Created by adelrioj on 13/01/2016.
 */
public class RouteNameComparator
        extends OrderByComparator {

    public static final String ORDER_BY_ASC = "Route_.name ASC";

    public static final String ORDER_BY_DESC = "Route_.name DESC";

    public static final String[] ORDER_BY_FIELDS = {"name"};

    private boolean _ascending;

    public RouteNameComparator() {
        this(false);
    }

    public RouteNameComparator(boolean ascending) {
        _ascending = ascending;
    }

    @Override
    public int compare(Object obj1, Object obj2) {
        Route Route1 = (Route)obj1;
        Route Route2 = (Route)obj2;

        String name1 = Route1.getName();
        String name2 =Route2.getName();

        int value = name1.compareTo(name2);

        return _ascending ? value : -value;
    }

    @Override
    public String getOrderBy() {
        return _ascending ? ORDER_BY_ASC : ORDER_BY_DESC;
    }

    @Override
    public String[] getOrderByFields() {
        return ORDER_BY_FIELDS;
    }

    @Override
    public boolean isAscending() {
        return _ascending;
    }


}
