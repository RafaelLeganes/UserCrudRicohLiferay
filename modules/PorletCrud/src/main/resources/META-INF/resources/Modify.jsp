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
<div class="container" id="contenedorPrincipal">
	<div class="row">
		<div class="col-12">
			<c:forEach items="${listaUsuarios}" var="usuario" varStatus="estado">
				<aui:form action="<%=modifyUsuario%>" id="frmUser"
					name="<portlet:namespace />fm">
					<table>
						<tr>
							<td><aui:input name="nombre${usuario.usuarioId}" label="${nombre}" type="text" required="true"
									style="background: white" value="${usuario.nombre}">
									<aui:validator name="maxLength">100</aui:validator>
								</aui:input></td>
							<td><aui:input name="apellidos${usuario.usuarioId}" label="${apellidos}" type="text" required="true"
									style="background: white" value="${usuario.apellidos}">
									<aui:validator name="maxLength">200</aui:validator>
								</aui:input></td>
							<td><aui:input name="fechaNacimiento${usuario.usuarioId}" label="${fechaNacimiento}" type="text"
									required="true" style="background: white"
									value="${usuario.fechaNacimiento}"
									placeholder="${usuario.fechaNacimiento}"
									onfocus="(this.type='date')" onblur="(this.type='text')">
								</aui:input></td>
							<td><aui:input name="correo${usuario.usuarioId}" label="${correo}" type="email" required="true"
									style="background: white" value="${usuario.correo}">
									<aui:validator name="email" />
								</aui:input></td>
								<aui:input type="hidden" name="usuarioId" value="${usuario.usuarioId}"></aui:input>
							<td><aui:button type="submit"></aui:button></td>
						</tr>
					</table>
				</aui:form>
			</c:forEach>
		</div>
	</div>
</div>