<%@ page import="com.liferay.docs.route.util.WebKeys" %>
<%@ page import="es.eina.tfg.RunTrackerBL.entity.Event" %>
<%@include file="../custom_init.jsp"%>

<%
    Event requestedEvent = (Event) request.getAttribute(WebKeys.REQUESTED_EVENT);
%>

<table >
    <tr>
        <td align="right">
            <em>
                <liferay-ui:message key="eventStartingTime" />:&nbsp;&nbsp;&nbsp;
            </em>
        </td>
        <td>
            <fmt:formatDate type="both" dateStyle="short" value="<%= requestedEvent.getPlannedStartTime().toDate() %>" />
        </td>
        <td align="right">
            <em>
                <liferay-ui:message key="eventFinishTime" />:&nbsp;&nbsp;&nbsp;
            </em>
        </td>
        <td>
            <fmt:formatDate type="both" dateStyle="short" value="<%= requestedEvent.getPlannedFinishTime().toDate()%>" />
        </td>
        <td align="right">
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <liferay-util:include page="/jsp/eventDetail/event_detail_description_actions.jsp" servletContext="${pageContext.servletContext}" />
        </td>
    </tr>
    <tr>
        <td align="right">
            <em>
                <liferay-ui:message key="eventType" />:&nbsp;&nbsp;&nbsp;
            </em>
        </td>
        <td>
            <c:out value="<%= requestedEvent.getRoute().getType() %>" />
        </td>
        <td align="right">
            <em>
                <liferay-ui:message key="routeName" />:&nbsp;&nbsp;&nbsp;
            </em>
        </td>
        <td>
            <c:out value="${requestScope.requestedEvent.route.name}" />
        </td>
    </tr>
    <tr>
        <td align="right">
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
    </tr>
    <tr>
        <td align="right">
            <em>
                <liferay-ui:message key="race.start" />:&nbsp;&nbsp;&nbsp;
            </em>
        </td>
        <td align="left">
            <img src="${pageContext.request.contextPath}/images/green-dot.png" />
        </td>
        <td align="right">
            <em>
                <liferay-ui:message key="race.end" />:&nbsp;&nbsp;&nbsp;
            </em>
        </td>
        <td align="left">
            <img src="${pageContext.request.contextPath}/images/yellow-dot.png" />
        </td>
    </tr>
</table>
