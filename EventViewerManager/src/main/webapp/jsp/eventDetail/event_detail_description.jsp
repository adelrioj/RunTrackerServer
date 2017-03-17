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
    </tr>
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
        <c:choose>
            <c:when test="${requestScope.requestedEvent.author.userId ne user.userId}">
                <td align="right">
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <liferay-util:include page="/jsp/eventDetail/event_detail_description_actions.jsp" servletContext="${pageContext.servletContext}" />
                </td>
            </c:when>
        </c:choose>
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
