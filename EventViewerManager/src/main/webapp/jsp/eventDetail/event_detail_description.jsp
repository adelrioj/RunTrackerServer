<%@ page import="com.liferay.docs.route.util.WebKeys" %>
<%@ page import="es.eina.tfg.RunTrackerBL.entity.Event" %>
<%@ page import="org.joda.time.DateTime" %>
<%@ page import="org.joda.time.Seconds" %>
<%@ page import="org.joda.time.format.DateTimeFormat" %>
<%@include file="../custom_init.jsp"%>

<%
    Event requestedEvent = (Event) request.getAttribute(WebKeys.REQUESTED_EVENT);

    int timerStartSeconds = 0;
    if (requestedEvent.getRealStartTime() != null){
        timerStartSeconds = Seconds.secondsBetween(requestedEvent.getRealStartTime(), DateTime.now()).getSeconds();

    }

    String output = "00:00:00";
    if (requestedEvent.getRealStartTime() != null && requestedEvent.getRealFinishTime() != null){
        output = DateTimeFormat.forPattern("HH:mm:ss").print(timerStartSeconds);
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
                <liferay-ui:message key="eventStatus" />:&nbsp;&nbsp;&nbsp;
            </em>
        </td>
        <td>
            <b>
                <c:choose>
                    <c:when test="${empty requestScope.requestedEvent.realStartTime}" >
                        <liferay-ui:message key="eventStatus.notStarted" />
                    </c:when>
                    <c:when test="${not empty requestScope.requestedEvent.realStartTime && empty requestScope.requestedEvent.realFinishTime}" >
                        <liferay-ui:message key="eventStatus.started" />
                    </c:when>
                    <c:otherwise>
                        <liferay-ui:message key="closed.event" />
                    </c:otherwise>
                </c:choose>
            </b>
        </td>
        <c:choose>
            <c:when test="${not empty requestScope.requestedEvent.realStartTime && empty requestScope.requestedEvent.realFinishTime}" >
                <td class="text-right">
                    <em>
                        <liferay-ui:message key="timerLabel" />:&nbsp;&nbsp;&nbsp;
                    </em>
                </td>
                <td id="timer">00:00:00</td>
                <td></td>
            </c:when>
            <c:when test="${not empty requestScope.requestedEvent.realStartTime && not empty requestScope.requestedEvent.realFinishTime}" >
                <td class="text-right"><liferay-ui:message key="timerLabel" />:&nbsp;&nbsp;&nbsp;</td>
                <td><%= output %></td>
                <td></td>
            </c:when>
            <c:otherwise>
                <td colspan="3"></td>
            </c:otherwise>
        </c:choose>
    </tr>
    <tr>
        <td class="text-right">
            <em>
                <liferay-ui:message key="eventStartingTime" />:&nbsp;&nbsp;&nbsp;
            </em>
        </td>
        <td>
            <fmt:formatDate type="both" dateStyle="short" value="<%= requestedEvent.getPlannedStartTime().toDate() %>" />
        </td>
        <td class="text-right">
            <em>
                <liferay-ui:message key="eventFinishTime" />:&nbsp;&nbsp;&nbsp;
            </em>
        </td>
        <td>
            <fmt:formatDate type="both" dateStyle="short" value="<%= requestedEvent.getPlannedFinishTime().toDate()%>" />
        </td>
        <c:choose>
            <c:when test="${requestScope.requestedEvent.author.userId ne user.userId}">
                <td class="text-right">
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <liferay-util:include page="/jsp/eventDetail/event_detail_description_actions.jsp" servletContext="${pageContext.servletContext}" />
                </td>
            </c:when>
        </c:choose>
    </tr>
    <tr>
        <td class="text-right">
            <em>
                <liferay-ui:message key="eventType" />:&nbsp;&nbsp;&nbsp;
            </em>
        </td>
        <td>
            <c:out value="<%= requestedEvent.getRoute().getType() %>" />
        </td>
        <td class="text-right">
            <em>
                <liferay-ui:message key="routeName" />:&nbsp;&nbsp;&nbsp;
            </em>
        </td>
        <td>
            <c:out value="${requestScope.requestedEvent.route.name}" />
        </td>
        <td></td>
    </tr>
    <tr>
        <td class="text-right">
            <em>
                <liferay-ui:message key="routeDistance" />:&nbsp;&nbsp;&nbsp;
            </em>
        </td>
        <td>
            <fmt:formatNumber type="number"
                              maxFractionDigits="2"
                              value="${requestScope.requestedEvent.route.distanceInMeters / 1000}"
            />
            <liferay-ui:message key="kilometers" />
        </td>
        <td colspan="3"></td>
    </tr>
    <tr>
        <td class="text-right">
            <em>
                <liferay-ui:message key="race.start" />:&nbsp;&nbsp;&nbsp;
            </em>
        </td>
        <td align="left">
            <img src="${pageContext.request.contextPath}/images/green-dot.png" />
        </td>
        <td class="text-right">
            <em>
                <liferay-ui:message key="race.end" />:&nbsp;&nbsp;&nbsp;
            </em>
        </td>
        <td align="left">
            <img src="${pageContext.request.contextPath}/images/yellow-dot.png" />
        </td>
        <td></td>
    </tr>
</table>
