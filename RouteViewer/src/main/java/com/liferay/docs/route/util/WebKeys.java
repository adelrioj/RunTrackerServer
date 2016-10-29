package com.liferay.docs.route.util;

/**
 * This class holds constants that contain the names of objects used to pass info between request or session operations.
 * It uses the convention in Liferay applications.
 *
 * Created by adelrioj on 04/11/2015.
 */
public class WebKeys implements com.liferay.portal.kernel.util.WebKeys {

    public static final String MESSAGE_ADD_ROUTE_ACTION_SUCCESS = "addRouteActionSuccess";
    public static final String MESSAGE_EDIT_ROUTE_ACTION_SUCCESS = "editRouteActionSuccess";
    public static final String MESSAGE_DELETE_ROUTE_ACTION_SUCCESS = "deleteRouteActionSuccess";
    public static final String MESSAGE_DELETE_LOCATION_ACTION_SUCCESS = "deleteLocationActionSuccess";

    public static final String PARAM_ROUTE_TO_EDIT = "routeToEdit";
    public static final String PARAM_ROUTE_TO_EDIT_LOCATION_LIST = "routeToEditLocations";
    public static final String PARAM_SELECTED_LOCATION = "routeLocationSelected";

    public static final String PARAM_ROUTE_IMPORT_FILE_NAME = "importFile";
    public static final String PARAM_ROUTEID = "routeId";
    public static final String PARAM_ROUTENAME = "routeName";
    public static final String PARAM_ROUTEDESC = "routeDescription";
    public static final String PARAM_ROUTETYPE = "routeType";
    public static final String PARAM_ISPUBLIC = "isPublic";

    public static final String PARAM_SELECTEDROUTELOCATIONID = "selectedRouteLocationId";
    public static final String PARAM_DELETEROUTELOCATIONID = "deleteRoutePositionId";

    //Google maps V3 markers path
    public static final String MARKER_RED = "/images/red-dot.png";
    public static final String MARKER_BLUE = "/images/blue-dot.png";
    public static final String MARKER_PURPLE = "/images/purple-dot.png";
    public static final String MARKER_YELLOW = "/images/yellow-dot.png";
    public static final String MARKER_GEEEN = "/images/green-dot.png";

    public static final String TYPE_RUNNING = "RUNNING";
    public static final String TYPE_CYCLING = "CYCLING";
}
