<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<liferay-theme:defineObjects />

<portlet:defineObjects />

<portlet:renderURL var="view">
	<portlet:param name="mvcPath" value="/view.jsp" />
</portlet:renderURL>
<portlet:actionURL name="getUsuarios" var="getUsuarios"></portlet:actionURL>
<portlet:actionURL name="modifyUsuario" var="modifyUsuario"></portlet:actionURL>
<portlet:actionURL name="deleteUsuario" var="deleteUsuario"></portlet:actionURL>
<c:set var="borrar">
	<liferay-ui:message key="portletcrud.eliminar" />
</c:set>
<c:set var="nuevo">
	<liferay-ui:message key="portletcrud.anadir" />
</c:set>
<c:set var="mostrar">
	<liferay-ui:message key="portletcrud.mostrar" />
</c:set>
<c:set var="modificar">
	<liferay-ui:message key="portletcrud.modificar" />
</c:set>
  <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
	  <a class="navbar-brand" href="<%= view %>">Usuarios Crud</a>
	  <button class="navbar-toggler" type="button" data-toggle="collapse" 
	  		  data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
	  		  aria-expanded="false" aria-label="Toggle navigation">
	          <span class="navbar-toggler-icon"></span>
	  </button>
	  <div class="collapse navbar-collapse" id="navbarSupportedContent">
	  	<ul class="navbar-nav mr-auto">
	    	<li class="nav-item">
	        	<a class="nav-link" href="<%= view %>">${nuevo}</a>
	      	</li>
	      	<li class="nav-item">
	        	<a class="nav-link" href="<%= getUsuarios %>">${mostrar}</a>
	      	</li>
	      	<li class="nav-item">
	        	<a class="nav-link" href="<%= modifyUsuario %>">${modificar}</a>
	      	</li>
	      	<li class="nav-item">
	        	<a class="nav-link" href="<%= deleteUsuario %>">${borrar}</a>
	      	</li>
	     </ul>
	  </div>
  </nav>

