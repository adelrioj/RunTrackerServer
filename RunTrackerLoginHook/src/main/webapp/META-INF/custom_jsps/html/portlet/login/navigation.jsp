<%@ include file="/html/portlet/login/init.jsp" %>

<liferay-util:buffer var="navigation">
	<%
		for (String section : PropsValues.LOGIN_FORM_NAVIGATION_PRE) {
	%>
		<liferay-util:include page='<%= "/html/portlet/login/navigation/" + _getSectionJsp(section) + ".jsp" %>'
							  portletId="<%= portletDisplay.getRootPortletId() %>" />
	<%
		}

		for (String section : PropsValues.LOGIN_FORM_NAVIGATION_POST) {
	%>
		<liferay-util:include page='<%= "/html/portlet/login/navigation/" + _getSectionJsp(section) + ".jsp" %>'
							  portletId="<%= portletDisplay.getRootPortletId() %>" />
	<%
		}
	%>
</liferay-util:buffer>

<%
	navigation = navigation.trim();
%>

<c:if test="<%= Validator.isNotNull(navigation) %>">
	<div>
		<%= navigation %>
	</div>
</c:if>

<%!
	private String _getSectionJsp(String name) {
		return TextFormatter.format(name, TextFormatter.N);
	}
%>