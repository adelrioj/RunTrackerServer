<%@ page import="com.liferay.docs.route.util.WebKeys" %>
<%@ page import="es.eina.tfg.RunTrackerBL.entity.Event" %>
<%@ page import="org.joda.time.DateTime" %>
<%@ page import="org.joda.time.Seconds" %>
<%@include file="../custom_init.jsp"%>

<%
    Event requestedEvent = (Event) request.getAttribute(WebKeys.SELECTED_EVENT);

    int timerStartSeconds = 0;
    if (requestedEvent.getRealStartTime() != null){
        timerStartSeconds = Seconds.secondsBetween(requestedEvent.getRealStartTime(), DateTime.now()).getSeconds();

    }
%>

<script type="text/javascript">
    $(function() { // document ready
        var timer = new Timer();
        timer.start({precision: 'seconds', startValues: {seconds: <%= timerStartSeconds %>}});
        $('#timer .values').html(timer.getTimeValues().toString());
        timer.addEventListener('secondsUpdated', function (e) {
            $('#timer').html(timer.getTimeValues().toString());
        });
    })
</script>

<h4 class="text-center">
    <liferay-ui:message key="detailsTitle" />
</h4>

<hr/>

<table class="table table-condensed">
    <tr>
        <td class="text-right">
            <em>
                <liferay-ui:message key="participantLocationMarkerLabel" />:&nbsp;&nbsp;&nbsp;
            </em>
        </td>
        <td>
            <img src="${pageContext.request.contextPath}/images/red-dot.png" />
        </td>
        <td class="text-right">
            <em>
                <liferay-ui:message key="timerLabel" />:&nbsp;&nbsp;&nbsp;
            </em>
        </td>
        <td id="timer">00:00:00</td>
        <td class="text-right">
            <liferay-util:include page="/jsp/liveEventDetail/live_event_description_buttons.jsp" servletContext="${pageContext.servletContext}" />
        </td>
    </tr>
    <tr>
        <td class="text-right">
            <em>
                <liferay-ui:message key="startLocationMarkerLabel" />:&nbsp;&nbsp;&nbsp;
            </em>
        </td>
        <td>
            <img src="${pageContext.request.contextPath}/images/green-dot.png" />
        </td>
        <td class="text-right">
            <em>
                <liferay-ui:message key="finishLocationMarkerLabel" />:&nbsp;&nbsp;&nbsp;
            </em>
        </td>
        <td>
            <img src="${pageContext.request.contextPath}/images/yellow-dot.png" />
        </td>
        <td></td>
    </tr>
</table>