<%@include file="custom_init.jsp"%>

<table>
    <tr>
        <td align="right">
            <em>
                <liferay-ui:message key="description" />:&nbsp;&nbsp;&nbsp;
            </em>
        </td>
        <td>
            <c:out value="${requestScope.routeToEdit.description}" />&nbsp;&nbsp;&nbsp;
        </td>
        <td colspan="2" align="left">
            <c:choose>
                <c:when test="${requestScope.routeToEdit.author.userId eq requestScope.USER.userId}">
                    <portlet:renderURL var="editRouteDescURL">
                        <portlet:param name="${constants.PARAM_ROUTEID}" value="${requestScope.routeToEdit.idRoute}" />
                        <portlet:param name="mvcPath" value="/jsp/route_edit.jsp" />
                    </portlet:renderURL>
                    <aui:button cssClass="btn-info fillCell"
                                icon="icon-pencil"
                                iconAlign="left"
                                value="edit"
                                onClick="${editRouteDescURL}"/>
                </c:when>
                <c:otherwise>
                    <portlet:actionURL name="deleteRouteAction" var="deleteRouteDescURL">
                        <portlet:param name="${constants.PARAM_ROUTEID}" value="${requestScope.routeToEdit.idRoute}" />
                    </portlet:actionURL>
                    <liferay-ui:icon-delete url="${deleteRouteDescURL}" />
                    <aui:button cssClass="btn-danger fillCell"
                                icon="icon-remove"
                                iconAlign="left"
                                value="delete"
                                onClick="${deleteRouteDescURL}"/>
                </c:otherwise>
            </c:choose>
        </td>
    </tr>
    <tr>
        <td align="right">
            <em>
                <liferay-ui:message key="type" />:&nbsp;&nbsp;&nbsp;
            </em>
        </td>
        <td>
            <c:out value="${requestScope.routeToEdit.type}" />
        </td>
        <td colspan="2" align="left">
            <c:choose>
                <c:when test="${requestScope.routeToEdit.author.userId eq requestScope.USER.userId}">
                    <portlet:actionURL name="deleteRouteAction" var="deleteRouteDescURL">
                        <portlet:param name="${constants.PARAM_ROUTEID}" value="${requestScope.routeToEdit.idRoute}" />
                    </portlet:actionURL>
                    <aui:button cssClass="btn-danger fillCell"
                                icon="icon-remove"
                                iconAlign="left"
                                value="deleteRoute"
                                onClick="${deleteRouteDescURL}"/>
                </c:when>
            </c:choose>
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
                              value="${requestScope.routeToEdit.distanceInMeters / 1000}"
            />
            <liferay-ui:message key="kilometers" />
        </td>
    </tr>
    <tr>
        <td align="right">
            <em>
                <liferay-ui:message key="elevationDifference" />:&nbsp;&nbsp;&nbsp;
            </em>
        </td>
        <td>
            <fmt:formatNumber type="number"
                              maxFractionDigits="2"
                              value="${requestScope.routeToEdit.maxElevationDifference}"
            />
            <liferay-ui:message key="meters" />
        </td>
    </tr>
    <tr>
        <td align="right">
            <em>
                <liferay-ui:message key="startLocationMarkerLabel" />:&nbsp;&nbsp;&nbsp;
            </em>
        </td>
        <td align="left">
            <img src="${pageContext.request.contextPath}/images/green-dot.png" />
        </td>
        <td align="right">
            <em>
                <liferay-ui:message key="finishLocationMarkerLabel" />:&nbsp;&nbsp;&nbsp;
            </em>
        </td>
        <td align="left">
            <img src="${pageContext.request.contextPath}/images/yellow-dot.png" />
        </td>
    </tr>
</table>