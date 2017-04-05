<%@include file="custom_init.jsp"%>

<h4 class="text-center">
    <liferay-ui:message key="detailsTitle" />
</h4>

<hr/>

<table class="table table-condensed">
    <tr>
        <td class="text-right">
            <em>
                <liferay-ui:message key="description" />:&nbsp;&nbsp;&nbsp;
            </em>
        </td>
        <td>
            <c:out value="${requestScope.routeToEdit.description}" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        </td>
        <td class="text-right">
            <portlet:actionURL name="addRouteAction" var="addRouteURL">
                <portlet:param name="${constants.PARAM_ROUTEID}" value="${requestScope.routeToEdit.idRoute}" />
            </portlet:actionURL>
            <aui:button cssClass="btn-info fillCell"
                        icon="icon-plus"
                        iconAlign="left"
                        value="addRoute"
                        onClick="${addRouteURL}"/>
        </td>
        <td>&nbsp;</td>
    </tr>
    <tr>
        <td class="text-right">
            <em>
                <liferay-ui:message key="type" />:&nbsp;&nbsp;&nbsp;
            </em>
        </td>
        <td>
            <c:out value="${requestScope.routeToEdit.type}" />
        </td>
        <td colspan="2">&nbsp;</td>
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
                              value="${requestScope.routeToEdit.distanceInMeters / 1000}"
            />
            <liferay-ui:message key="kilometers" />
        </td>
        <td colspan="2">&nbsp;</td>
    </tr>
    <tr>
        <td class="text-right">
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
        <td colspan="2">&nbsp;</td>
    </tr>
    <tr>
        <td class="text-right">
            <em>
                <liferay-ui:message key="startLocationMarkerLabel" />:&nbsp;&nbsp;&nbsp;
            </em>
        </td>
        <td align="left">
            <img src="${pageContext.request.contextPath}/images/green-dot.png" />
        </td>
        <td class="text-right">
            <em>
                <liferay-ui:message key="finishLocationMarkerLabel" />:&nbsp;&nbsp;&nbsp;
            </em>
        </td>
        <td align="left">
            <img src="${pageContext.request.contextPath}/images/yellow-dot.png" />
        </td>
    </tr>
</table>