package com.liferay.docs.route.util;

/**
 * This class holds constants that contain the names of objects used to pass info between request or session operations.
 * It uses the convention in Liferay applications.
 *
 * Created by adelrioj on 04/11/2015.
 */
public class WebKeys implements com.liferay.portal.kernel.util.WebKeys {

    //edit.jsp
    public static final String PARAM_ROUTEID = "routeId";
    public static final String PARAM_ROUTENAME = "routeName";
    public static final String PARAM_ROUTEDESC = "routeDescription";
    public static final String PARAM_ROUTETYPE = "routeType";
    public static final String PARAM_ISPUBLIC = "isPublic";

    //view action
    public static final String PARAM_SELECTEDROUTEID = "selectedRouteId";
    public static final String PARAM_SELECTEDROUTELOCATIONID = "selectedRouteLocationId";
    //Delete action
    public static final String PARAM_DELETEROUTEPOSITIONID = "deleteRoutePositionId";
    public static final String PARAM_DELETEROUTEID = "deleteRouteId";


    //Google maps V3 markers
    public static final String MARKER_RED = "/images/red-dot.png";
    public static final String MARKER_BLUE = "/images/blue-dot.png";
    public static final String MARKER_PURPLE = "/images/purple-dot.png";
    public static final String MARKER_YELLOW = "/images/yellow-dot.png";
    public static final String MARKER_GEEEN = "/images/green-dot.png";
}
