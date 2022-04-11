create table USUARIO_Usuario (
	uuid_ VARCHAR(75) null,
	usuarioId LONG not null primary key,
	nombre VARCHAR(75) null,
	apellidos VARCHAR(75) null,
	fechaNacimiento DATE null,
	createDate DATE null,
	correo VARCHAR(75) null
);