<%@include file="../custom_init.jsp"%>

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
        <td colspan="2"></td>
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