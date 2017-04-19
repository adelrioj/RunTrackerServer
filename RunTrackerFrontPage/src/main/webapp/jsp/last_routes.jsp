<%@ page import="java.util.Date" %>
<%@ page import="es.eina.tfg.RunTrackerBL.entity.Race" %>
<%@include file="custom_init.jsp"%>

<script type="text/javascript">

    var map;

    function initialize() {

        var trainings = ${requestScope.lastRacesJson};

        for (var i=0; i < trainings.length; i++){
            var mapCenterPoint = new google.maps.LatLng(
                trainings[i].startLocation.latitude,
                trainings[i].startLocation.longitude
            );

            var myOptions = {
                zoom: 14,
                center: mapCenterPoint,
                mapTypeId: google.maps.MapTypeId.ROADMAP
            };

            map = new google.maps.Map(document.getElementById(trainings[i].idRace), myOptions);

            var routeCoordinates = [];
            for (var j = 0; j < trainings[i].route.locations.length; j++){
                var routeCoords = {lat:trainings[i].route.locations[j].latitude, lng:trainings[i].route.locations[j].longitude};
                routeCoordinates.push(routeCoords);
            }
            setPolyLine(map, routeCoordinates, '#FF0000', 0.5, 4);

            var raceCoordinates =[];
            for (var k = 0; k < trainings[i].locations.length; k++){
                var raceCoords = {lat:trainings[i].locations[k].latitude, lng:trainings[i].locations[k].longitude};
                raceCoordinates.push(raceCoords);
            }
            setPolyLine(map, raceCoordinates, '#389145', 1.0, 4);

            setMarker(map,
                trainings[i].startLocation.latitude,
                trainings[i].startLocation.longitude,
                '<liferay-ui:message key="startLocationMarkerLabel" />',
                '/images/green-dot.png');

            setMarker(map,
                trainings[i].endLocation.latitude,
                trainings[i].endLocation.longitude,
                '<liferay-ui:message key="finishLocationMarkerLabel" />',
                '/images/yellow-dot.png');
        }
    }

    function setMarker(map, latitude, longitude, title, iconPath) {
        var myLatlng = new google.maps.LatLng(latitude, longitude);
        var marker = new google.maps.Marker({
            position: myLatlng,
            title: title,
            icon: '${renderRequest.contextPath}' + iconPath
        });
        marker.setMap(map);
    }

    function setPolyLine (map, coordinates, color, strokeOpacity, strokeWeight){
        var path = new google.maps.Polyline({
            path: coordinates,
            geodesic: true,
            strokeColor: color,
            strokeOpacity: strokeOpacity,
            strokeWeight: strokeWeight
        });

        path.setMap(map);
    }

    function loadScript() {
        var script = document.createElement("script");
        script.type = "text/javascript";
        script.src = "http://maps.google.com/maps/api/js?callback=initialize&key=AIzaSyDHGIgNTF3GMNjx6JjcNAisC5MoT0ebom0";
        document.body.appendChild(script);
    }

    window.onload = loadScript;
</script>

    <h4 class="text-center">
        <liferay-ui:message key="lastTrainingsTitle" />
    </h4>

    <hr />

    <c:forEach items="${requestScope.lastRaces}" var="training">

        <%
            Race requestedRace = (Race) pageContext.getAttribute("training");
            Date startLocationTime = requestedRace.getStartLocation().getTime().toDate();
            Date endLocationTime = requestedRace.getEndLocation().getTime().toDate();
        %>

        <div class="lightgrayBG">

            <h4 class="text-center">
                <c:out value="${training.route.name}" />
            </h4>

            <hr/>

                <div id="${training.idRace}" class="map_canvas"></div>

            <hr/>

            <table class="table table-condensed">
                <tr>
                    <td class="text-right">
                        <em>
                            <liferay-ui:message key="raceStartingTime" />:&nbsp;&nbsp;&nbsp;
                        </em>
                    </td>
                    <td>
                        <fmt:formatDate type="both" dateStyle="short" value="<%= startLocationTime%>" />
                    </td>
                    <td class="text-right">
                        <em>
                            <liferay-ui:message key="raceFinishTime" />:&nbsp;&nbsp;&nbsp;
                        </em>
                    </td>
                    <td>
                        <fmt:formatDate type="both" dateStyle="short" value="<%= endLocationTime%>" />
                    </td>
                </tr>
                <tr>
                    <td class="text-right">
                        <em>
                            <liferay-ui:message key="type" />:&nbsp;&nbsp;&nbsp;
                        </em>
                    </td>
                    <td>
                        <c:out value="${training.type}" />
                    </td>
                    <td class="text-right">
                        <em>
                            <liferay-ui:message key="routeName" />:&nbsp;&nbsp;&nbsp;
                        </em>
                    </td>
                    <td>
                        <c:out value="${training.route.name}" />
                    </td>
                </tr>
                <tr>
                    <td class="text-right">
                        <em>
                            <liferay-ui:message key="raceDistance" />:&nbsp;&nbsp;&nbsp;
                        </em>
                    </td>
                    <td>
                        <fmt:formatNumber type="number"
                                          maxFractionDigits="2"
                                          value="${training.distanceInMeters / 1000}"
                        />
                        <liferay-ui:message key="kilometers" />
                    </td>
                    <td class="text-right">
                        <em>
                            <liferay-ui:message key="routeDistance" />:&nbsp;&nbsp;&nbsp;
                        </em>
                    </td>
                    <td>
                        <fmt:formatNumber type="number"
                                          maxFractionDigits="2"
                                          value="${training.route.distanceInMeters / 1000}"
                        />
                        <liferay-ui:message key="kilometers" />
                    </td>
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
                                          value="${training.maxElevationDifference}"
                        />
                        <liferay-ui:message key="meters" />
                    </td>
                    <td colspan="2"></td>
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
                </tr>
            </table>
        </div>
    </c:forEach>
