<%@include file="../custom_init.jsp"%>


<table>
    <tr>
        <td align="right">
            <em>
                <liferay-ui:message key="participantLocationMarkerLabel" />:&nbsp;&nbsp;&nbsp;
            </em>
        </td>
        <td align="left">
            <img src="${pageContext.request.contextPath}/images/red-dot.png" />
        </td>
        <td colspan="2" align="left">
            &nbsp;
        </td>
        <td align="left">
            <liferay-util:include page="/jsp/liveEventDetail/live_event_description_buttons.jsp" servletContext="${pageContext.servletContext}" />
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