<%@include file="custom_init.jsp"%>

<div class="container">
    <div class="row">
        <div class="span12">
            <h1 class="text-center">
                <liferay-ui:message key="liveTitle" />
            </h1>
            <hr />
            <liferay-util:include page="/jsp/eventList/event_list.jsp" servletContext="${pageContext.servletContext}" />
        </div>
    </div>
</div>