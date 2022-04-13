<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/init.jsp"%>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util"%>
<%@page import="PortletService.service.UsuarioLocalServiceUtil"%>
<portlet:actionURL name="modifyUsuario" var="modifyUsuario"></portlet:actionURL>
<c:set var="nombre">
	<liferay-ui:message key="portletcrud.nombre" />
</c:set>
<c:set var="apellidos">
	<liferay-ui:message key="portletcrud.apellidos" />
</c:set>
<c:set var="fechaNacimiento">
	<liferay-ui:message key="portletcrud.fechaNacimiento" />
</c:set>
<c:set var="correo">
	<liferay-ui:message key="portletcrud.correo" />
</c:set>
<c:set var="borrar">
	<liferay-ui:message key="portletcrud.eliminar" />
</c:set>
<div class="container" id="contenedorPrincipal">
	<div class="row">
		<div class="col-12">
			<c:forEach items="${listaUsuarios}" var="usuario" varStatus="estado">
				<aui:form action="<%=deleteUsuario%>" id="frmUser"
					name="<portlet:namespace />fm">
					<table>
						<tr>
							<td><aui:input name="nombre${usuario.usuarioId}" type="text"
									style="background: grey" label="${nombre}" value="${usuario.nombre}" readonly="true">
								</aui:input></td>
							<td><aui:input name="apellidos${usuario.usuarioId}" type="text" 
									style="background: grey" label="${apellidos}" value="${usuario.apellidos}" readonly="true">
								</aui:input></td>
							<td><aui:input name="fechaNacimiento${usuario.usuarioId}" type="text"
									 style="background: grey" label="${fechaNacimiento}" value="${usuario.fechaNacimiento}" readonly="true">
								</aui:input></td>
							<td><aui:input name="correo${usuario.usuarioId}" type="text" 
									style="background: grey" label="${correo}" value="${usuario.correo}" readonly="true">
								</aui:input></td>
								<aui:input type="hidden" name="usuarioId" value="${usuario.usuarioId}"></aui:input>
							<td><aui:button type="submit" value="${borrar}"></aui:button></td>
						</tr>
					</table>
				</aui:form>
			</c:forEach>
		</div>
	</div>
</div>