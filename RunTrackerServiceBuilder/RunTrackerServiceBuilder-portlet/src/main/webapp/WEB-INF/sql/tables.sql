create table GL_Device (
	deviceId LONG not null primary key,
	userId LONG,
	deviceUUID VARCHAR(75) null,
	description VARCHAR(75) null,
	status VARCHAR(75) null,
	phoneNumber VARCHAR(75) null,
	serverPhoneNumber VARCHAR(75) null,
	smsPollTime VARCHAR(75) null,
	smsTransmitPeriod VARCHAR(75) null,
	cloudId VARCHAR(75) null,
	serverIp VARCHAR(75) null,
	httpTransmitPeriod VARCHAR(75) null
);

create table GL_Device_Sensor (
	deviceId LONG not null,
	sensorId LONG not null,
	status BOOLEAN,
	primary key (deviceId, sensorId)
);

create table GL_Location (
	measurementId LONG not null primary key,
	raceId LONG,
	userId LONG,
	deviceId LONG,
	sensorId LONG,
	time_ DATE null,
	sensorMode VARCHAR(75) null,
	sysRef INTEGER,
	latitude DOUBLE,
	longitude DOUBLE,
	speed DOUBLE,
	distance DOUBLE,
	altitude DOUBLE
);

create table GL_Power (
	measurementId LONG not null primary key,
	raceId LONG,
	userId LONG,
	deviceId LONG,
	sensorId LONG,
	time_ DATE null,
	sensorMode VARCHAR(75) null,
	level INTEGER
);

create table GL_Race (
	raceId LONG not null primary key,
	userId LONG,
	routeId LONG,
	type_ VARCHAR(75) null,
	userHeight INTEGER,
	userWeight INTEGER
);

create table GL_Route (
	routeId LONG not null primary key,
	type_ VARCHAR(75) null,
	name VARCHAR(75) null,
	description VARCHAR(75) null,
	authorId LONG,
	isPublic BOOLEAN,
	startingTime DATE null,
	creationTime DATE null
);

create table GL_RouteLocation (
	routePositionId LONG not null primary key,
	routeId LONG,
	latitude DOUBLE,
	longitude DOUBLE
);

create table GL_Sensor (
	sensorId LONG not null primary key,
	type_ INTEGER,
	description VARCHAR(75) null,
	dataUnits VARCHAR(75) null,
	dataType VARCHAR(75) null,
	dataUncertainity VARCHAR(75) null,
	dataLowerRange VARCHAR(75) null,
	dataUpperRange VARCHAR(75) null,
	dataPacketFormat VARCHAR(75) null
);

create table GL_UserAdditionalData (
	userId LONG not null primary key,
	registerType VARCHAR(75) null,
	weight INTEGER,
	height INTEGER,
	smsCounter LONG
);

create table GL_UserSelectedRoutes (
	userId LONG not null,
	routeId LONG not null,
	primary key (userId, routeId)
);