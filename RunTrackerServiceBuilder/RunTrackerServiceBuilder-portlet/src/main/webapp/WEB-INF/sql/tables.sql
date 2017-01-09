create table GL_Device (
	idDevice LONG not null primary key,
	idUser LONG,
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

create table GL_DeviceAndSensor (
	idDevice LONG not null,
	idSensor LONG not null,
	status BOOLEAN,
	primary key (idDevice, idSensor)
);

create table GL_Event (
	idEvent LONG not null primary key,
	idRoute LONG,
	idAuthor LONG,
	name VARCHAR(75) null,
	plannedStartingTime DATE null,
	plannedFinishTime DATE null,
	realStartingTime DATE null,
	realFinishTime DATE null
);

create table GL_Location (
	idRace LONG not null,
	idMeasurement LONG not null,
	idDevice LONG,
	idSensor LONG,
	time_ DATE null,
	sensorMode VARCHAR(75) null,
	sysRef INTEGER,
	latitude DOUBLE,
	longitude DOUBLE,
	speed DOUBLE,
	distance DOUBLE,
	altitude DOUBLE,
	primary key (idRace, idMeasurement)
);

create table GL_Power (
	idMeasurement LONG not null,
	idRace LONG not null,
	idDevice LONG,
	idSensor LONG,
	time_ DATE null,
	sensorMode VARCHAR(75) null,
	level INTEGER,
	primary key (idMeasurement, idRace)
);

create table GL_Race (
	idRace LONG not null primary key,
	idUser LONG,
	idRoute LONG,
	type_ VARCHAR(75) null
);

create table GL_Route (
	idRoute LONG not null primary key,
	idAuthor LONG,
	type_ VARCHAR(75) null,
	name VARCHAR(75) null,
	description VARCHAR(75) null,
	isPublic BOOLEAN,
	creationTime DATE null
);

create table GL_RouteLocation (
	idRouteLocation LONG not null,
	idRoute LONG not null,
	latitude DOUBLE,
	longitude DOUBLE,
	elevation DOUBLE,
	primary key (idRouteLocation, idRoute)
);

create table GL_Sensor (
	idSensor LONG not null primary key,
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
	idUser LONG not null primary key,
	weight INTEGER,
	height INTEGER,
	smsCount LONG
);

create table GL_UserAndEvent (
	idUser LONG not null,
	idEvent LONG not null,
	idRace LONG,
	primary key (idUser, idEvent)
);

create table GL_UserAndRoute (
	idUser LONG not null,
	idRoute LONG not null,
	primary key (idUser, idRoute)
);