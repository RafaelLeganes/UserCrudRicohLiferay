<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/init.jsp" %>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>
<%@page import="PortletService.service.UsuarioLocalServiceUtil"%>
<div class="container" id="contenedorPrincipal">
	<div class="row">
		<div class="col-12">
			<c:set var="thnombre"><liferay-ui:message key="portletcrud.nombre"/></c:set>
			<c:set var="thapellidos"><liferay-ui:message key="portletcrud.apellidos"/></c:set>
			<c:set var="thfechaNacimiento"><liferay-ui:message key="portletcrud.fechaNacimiento"/></c:set>
			<c:set var="thcorreo"><liferay-ui:message key="portletcrud.correo"/></c:set>
			<table class="table table-responsive table-borderless text-center">
					<thead>
						<tr>
							<th scope="col">${thnombre}</th>
			      			<th scope="col">${thapellidos}</th>
			      			<th scope="col">${thfechaNacimiento}</th>
			      			<th scope="col">${thcorreo}</th>
						</tr>
				    </thead>
						<c:forEach items="${listaUsuarios}" var="usuario" varStatus="estado">
							<tr>
								<td>${usuario.nombre}</td>
								<td>${usuario.apellidos}</td>
								<td>${usuario.fechaNacimiento}</td>
								<td>${usuario.correo}</td>
							</tr>
						</c:forEach>
				</table>
		</div>
	</div>
</div>