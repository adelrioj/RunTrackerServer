create index IX_85D4331B on GL_Device (deviceUUID);
create index IX_EB89AE50 on GL_Device (idUser);
create index IX_C793A9B1 on GL_Device (phoneNumber);
create index IX_5D48ABBC on GL_Device (status);

create index IX_800EF80C on GL_DeviceAndSensor (idDevice);

create index IX_39ECAEE0 on GL_Event (idAuthor);
create index IX_8340A1F8 on GL_Event (idRoute);

create index IX_3859D3F5 on GL_Location (idRace);

create index IX_F0334811 on GL_Power (idRace);

create index IX_B02E838B on GL_Race (idUser);

create index IX_16CBE00F on GL_Route (idAuthor);
create index IX_BE7E327C on GL_Route (isPublic);

create index IX_E170E2F4 on GL_RouteLocation (idRoute);

create index IX_4484A55B on GL_Sensor (type_);

create index IX_30769E81 on GL_UserAndEvent (idEvent);
create index IX_BBBF7FEE on GL_UserAndEvent (idRace);
create index IX_C1DCCA68 on GL_UserAndEvent (idUser);

create index IX_81E47B57 on GL_UserAndRoute (idUser);