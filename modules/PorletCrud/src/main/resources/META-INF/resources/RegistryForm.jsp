<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/init.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registro</title>
</head>
<body>
	<div style="position:relative; margin: 30px 0 0 0;">
		<c:set var="nombre"><liferay-ui:message key="portletcrud.nombre"/></c:set>
		<c:set var="apellidos"><liferay-ui:message key="portletcrud.apellidos"/></c:set>
		<c:set var="fechaNacimiento"><liferay-ui:message key="portletcrud.fechaNacimiento"/></c:set>
		<c:set var="correo"><liferay-ui:message key="portletcrud.correo"/></c:set>
		<aui:input name="nombre" type="text" label="${nombre}" style="background: grey" placeholder="<%=renderRequest.getParameter("nombre")%>" readonly="true">
		</aui:input>
		<aui:input name="apellidos" type="text" label="${apellidos}" style="background: grey" placeholder="<%=renderRequest.getParameter("apellidos")%>" readonly="true">
		</aui:input>
		<aui:input name="fechaNacimiento" type="text" label="${fechaNacimiento}" style="background: grey" placeholder="<%=renderRequest.getParameter("fechaNacimiento")%>" readonly="true">
		</aui:input>
		<aui:input name="correo" type="text" label="${correo}" style="background: grey" placeholder="<%=renderRequest.getParameter("correo")%>" readonly="true">
		</aui:input>
	</div>
</body>
</html>