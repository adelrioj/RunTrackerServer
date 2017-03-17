package com.liferay.docs.route.util;

/**
 * This class holds constants that contain the names of objects used to pass info between request or session operations.
 * It uses the convention in Liferay applications.
 *
 * @author  adelrioj
 */
public class WebKeys implements com.liferay.portal.kernel.util.WebKeys {

    public static final String ADDEVENT_DATE_FORMAT = "dd-MM-yyyy HH:mm";
    public static final String ADDEVENT_DATE_FORMAT_PERCENT = "%d-%m-%Y";
    public static final String TODAY_DATE_PATTERN = "yyyy-MM-dd";

    //Add event
    public static final String PARAM_ADDEVENT_NAME = "addEventName";
    public static final String PARAM_ADDEVENT_STARTDATE = "addEventStartDate";
    public static final String PARAM_ADDEVENT_STARTHOUR = "addEventStartDateHour";
    public static final String PARAM_ADDEVENT_ENDDATE = "addEventEndDate";
    public static final String PARAM_ADDEVENT_ENDHOUR = "addEventEndDateHour";
    public static final String PARAM_ADDEVENT_IDROUTE = "addEventIdRoute";

    public static final String ADDEVENT_ROUTE_LIST = "addEventRouteList";

    //Calendar
    public static final String PARAM_TODAY = "today";
    public static final String PARAM_START_DATE = "start";
    public static final String PARAM_END_DATE = "end";
    public static final String PARAM_RESOURCEREQUEST_TYPE = "resourceRequestType";
    public static final String PARAM_RESOURCEREQUEST_GET_MONTH_EVENTS = "getMonthEvents";

    //EventSelection
    public static final String PARAM_EVENT_ID = "selectedEventId";
    public static final String REQUESTED_EVENT = "requestedEvent";

    //Participants
    public static final String PARAM_SELECTED_PARTICIPANT_ID = "selectedParticipantId";

    //MESSAGE KEYS
    public static final String MESSAGE_ADD_EVENT_ACTION_SUCCESS = "messageAddEventActionSuccess";
    public static final String MESSAGE_DELETE_EVENT_ACTION_SUCCESS = "messageDeleteEventActionSuccess";
    public static final String MESSAGE_START_EVENT_ACTION_SUCCESS = "messageStartEventActionSuccess";
    public static final String MESSAGE_FINISH_EVENT_ACTION_SUCCESS = "messageFinishEventActionSuccess";
    public static final String MESSAGE_DELETE_PARTICIPANT_ACTION_SUCCESS = "messageDeleteParticipantActionSuccess";
}