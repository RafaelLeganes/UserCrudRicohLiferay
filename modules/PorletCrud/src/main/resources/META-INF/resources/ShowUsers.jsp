<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/init.jsp" %>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>
<%@page import="PortletService.service.UsuarioLocalServiceUtil"%>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" />
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<portlet:actionURL name="modifyUsuario" var="modifyUsuario"></portlet:actionURL>
<portlet:actionURL name="deleteUsuario" var="deleteUsuario"></portlet:actionURL>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Usuarios</title>
</head>
<body>
<c:set var="nombre"><liferay-ui:message key="portletcrud.nombre"/></c:set>
<c:set var="apellidos"><liferay-ui:message key="portletcrud.apellidos"/></c:set>
<c:set var="fechaNacimiento"><liferay-ui:message key="portletcrud.fechaNacimiento"/></c:set>
<c:set var="correo"><liferay-ui:message key="portletcrud.correo"/></c:set>
<table class="table table-responsive table-borderless text-center">
		<thead>
			<tr>
				<th scope="col">${nombre}</th>
      			<th scope="col">${apellidos}</th>
      			<th scope="col">${fechaNacimiento}</th>
      			<th scope="col">${correo}</th>
			</tr>
	    </thead>
			<c:forEach items="${listaUsuarios}" var="usuario" varStatus="estado">
				<tr>
					<td>${usuario.nombre}</td>
					<td>${usuario.apellidos}</td>
					<td>${usuario.fechaNacimiento}</td>
					<td>${usuario.correo}</td>
					<td><button type="button" data-bs-toggle="modal" data-bs-target="#Editar${usuario.usuarioId}"
					 class="btn btn-sm btn-warning">Modify</button>
						<div class="modal" id="Editar${usuario.usuarioId}">	
						 	<aui:form action="<%= modifyUsuario %>" id="frmUserModify${usuario.usuarioId}" name="<portlet:namespace />fmu" method="post">							
							<div class="modal-dialog">
								<div class="modal-content">
										<div class="modal-header">
											<button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
											<h4 class="modal-title" id="myModalLabaelModify${usuario.usuarioId}">${usuario.nombre}</h4>
										</div>
										<div class="modal-body">
											<fieldset>
											<div class="mb-3 mb-3">
												<aui:input name="mNombre${usuario.usuarioId}" type="text" label="${nombre}" required="true"
												 style="background: white" value="${usuario.nombre}">
												 	<aui:validator name="maxLength">100</aui:validator>
			            						</aui:input>
											</div>
											<div class="mb-3">
												<aui:input name="mApellidos${usuario.usuarioId}" type="text" label="${apellidos}" required="true"
												 style="background: white" value="${usuario.apellidos}">
													<aui:validator name="maxLength">200</aui:validator>
			           	 						</aui:input>
											</div>
											<div class="mb-3">
												<aui:input name="mFechaNacimiento${usuario.usuarioId}" type="text" label="${fechaNacimiento}" required="true"
												 style="background: white" value="${usuario.fechaNacimiento}" placeholder="${usuario.fechaNacimiento}" onfocus="(this.type='date')" onblur="(this.type='text')">
			           	 						</aui:input>
											</div>
											<div class="mb-3">
												<aui:input name="mCorreo${usuario.usuarioId}" type="email" label="${correo}" required="true"
												 style="background: white" value="${usuario.correo}">
												 	<aui:validator name="email"/>
			           	 						</aui:input>
											</div>
												<aui:input type="hidden" name="mUsuarioId" value="${usuario.usuarioId}"></aui:input>
											</fieldset>
										</div>
										<div class="modal-footer">
											<button type="submit" class="btn btn-success" name="action">Modify</button>
											<button type="button" class="btn btn-danger" data-bs-dismiss="modal">Close</button>
										</div>
							    </div>
							</div>
							</aui:form>
						</div>
					</td>
					<td><button type="button" data-bs-toggle="modal" data-bs-target="#Eliminar${usuario.usuarioId}"
					 class="btn btn-sm btn-warning">Delete</button>
						<div class="modal" id="Eliminar${usuario.usuarioId}">
							<aui:form action="<%= deleteUsuario %>" id="frmUserDelete${usuario.usuarioId}" name="<portlet:namespace />fmd">	
							<div class="modal-dialog">
								<div class="modal-content">
									<div class="modal-header">
										<button type="button" class="btn-close" data-bs-dismiss="modal"></button>
										<h4 class="modal-title" id="myModalLabaelDelete${usuario.usuarioId}">${usuario.nombre}</h4>
									</div>
									<div class="modal-body">
										<div class="mb-3 mb-3">
											<aui:input name="nombre${usuario.usuarioId}" type="text" label="${nombre}" 
											 style="background: grey" value="${usuario.nombre}" readonly="true">
		            						</aui:input>
										</div>
										<div class="mb-3">
											<aui:input name="apellidos${usuario.usuarioId}" type="text" label="${apellidos}" 
											 style="background: grey" value="${usuario.apellidos}" readonly="true">
		           	 						</aui:input>
										</div>
										<div class="mb-3">
											<aui:input name="fechaNacimiento${usuario.usuarioId}" type="text" label="${fechaNacimiento}" 
											style="background: grey" value="${usuario.fechaNacimiento}" readonly="true">
		           	 						</aui:input>
										</div>
										<div class="mb-3">
											<aui:input name="correo${usuario.usuarioId}" type="text" label="${correo}"
											 style="background: grey" value="${usuario.correo}" readonly="true">
		           	 						</aui:input>
										</div>
									</div>
									<aui:input type="hidden" name="usuarioId" value="${usuario.usuarioId}"></aui:input>
									<div class="modal-footer">
										<button type="submit" class="btn btn-success" name="action">Delete</button>
										<button type="button" class="btn btn-danger" data-bs-dismiss="modal">Close</button>
									</div>
							    </div>
							</div>
							</aui:form>
						</div>
					</td>
				</tr>
			</c:forEach>
	</table>
</body>
</html>	