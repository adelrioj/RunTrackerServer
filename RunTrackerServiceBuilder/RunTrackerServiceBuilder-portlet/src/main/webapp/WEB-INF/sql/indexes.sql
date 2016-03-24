create index IX_85D4331B on GL_Device (deviceUUID);
create index IX_C793A9B1 on GL_Device (phoneNumber);
create index IX_5D48ABBC on GL_Device (status);
create index IX_FEC7C510 on GL_Device (userId);

create index IX_61A03B74 on GL_Device_Sensor (deviceId);

create index IX_5DC0A135 on GL_Location (raceId);

create index IX_159A1551 on GL_Power (raceId);

create index IX_C36C9A4B on GL_Race (userId);

create index IX_4729D98F on GL_Route (authorId);
create index IX_BE7E327C on GL_Route (isPublic);

create index IX_D19304CA on GL_RouteLocation (routeId);

create index IX_4484A55B on GL_Sensor (type_);

create index IX_3D76D5AA on GL_UserSelectedRoutes (userId);