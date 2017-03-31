<%@include file="custom_init.jsp"%>

<div id="eventListDiv" class="center-div">
    <div id="titleDiv" class="title-div">
        <liferay-util:include page="/jsp/eventList/event_title.jsp" servletContext="${pageContext.servletContext}" />
    </div>
    <div id="listDiv" class="margin-div" >
        <liferay-util:include page="/jsp/eventList/event_list.jsp" servletContext="${pageContext.servletContext}" />
    </div>
</div>