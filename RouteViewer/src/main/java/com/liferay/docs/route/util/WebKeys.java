package com.liferay.docs.route.util;

import es.eina.tfg.RunTrackerBL.entity.Route;

/**
 * This class holds constants that contain the names of objects used to pass info between request or session operations.
 * It uses the convention in Liferay applications.
 *
 * @author  adelrioj
 */
public class WebKeys implements com.liferay.portal.kernel.util.WebKeys {

    public static final String MESSAGE_ADD_ROUTE_ACTION_SUCCESS = "addRouteActionSuccess";
    public static final String MESSAGE_EDIT_ROUTE_ACTION_SUCCESS = "editRouteActionSuccess";
    public static final String MESSAGE_DELETE_ROUTE_ACTION_SUCCESS = "deleteRouteActionSuccess";

    public static final String PARAM_ROUTE_TO_EDIT = "routeToEdit";

    public static final String PARAM_ROUTE_IMPORT_FILE_NAME = "importFile";
    public static final String PARAM_ROUTEID = "routeId";
    public static final String PARAM_ROUTENAME = "routeName";
    public static final String PARAM_ROUTEDESC = "routeDescription";
    public static final String PARAM_ROUTETYPE = "routeType";
    public static final String PARAM_ISPUBLIC = "isPublic";

    //Google maps V3 markers path
    public static final String MARKER_RED = "/images/red-dot.png";
    public static final String MARKER_BLUE = "/images/blue-dot.png";
    public static final String MARKER_PURPLE = "/images/purple-dot.png";
    public static final String MARKER_YELLOW = "/images/yellow-dot.png";
    public static final String MARKER_GEEEN = "/images/green-dot.png";

    public static final String TYPE_RUNNING = Route.TYPE_RUNNING;
    public static final String TYPE_CYCLING = Route.TYPE_CYCLING;
}
