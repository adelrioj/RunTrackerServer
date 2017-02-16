package com.liferay.docs.route.util;

/**
 * This class holds constants that contain the names of objects used to pass info between request or session operations.
 * It uses the convention in Liferay applications.
 *
 * @author  adelrioj
 */
public class WebKeys implements com.liferay.portal.kernel.util.WebKeys {

    public static final String PARAM_TODAY = "today";
    public static final String PARAM_START_DATE = "start";
    public static final String PARAM_END_DATE = "end";

    public static final String PARAM_RESOURCEREQUEST_TYPE = "resourceRequestType";
    public static final String PARAM_RESOURCEREQUEST_GET_MONTH_EVENTS = "getMonthEvents";

    public static final String PARAM_EVENT_ID = "id";
    public static final String REQUESTED_RACE = "requestedRace";
    public static final String MESSAGE_DELETE_ACTION_SUCCESS = "messageDeleteActionSuccess";
}
