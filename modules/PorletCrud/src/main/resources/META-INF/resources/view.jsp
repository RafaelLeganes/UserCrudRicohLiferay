<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/init.jsp" %>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>
<%@ taglib uri="http://liferay.com/tld/captcha" prefix="liferay-captcha" %>
<%@ page import="com.liferay.portal.kernel.captcha.CaptchaTextException"%>
<portlet:actionURL name="addUsuario" var="addUsuario"></portlet:actionURL>
<portlet:resourceURL id="captcha" var="captchaResourceURL"/>
<liferay-ui:error exception="<%= CaptchaTextException.class %>" message="captcha-verification-failed" />
<liferay-ui:success key="success" message="Greeting saved successfully!"/>
<div class="container" id="contenedorPrincipal">
	<div class="row">
		<div class="col-12">
			<aui:form action="<%= addUsuario %>" id="frmUser" name="<portlet:namespace />fm">	
				<aui:fieldset>
					<c:set var="nombre"><liferay-ui:message key="portletcrud.nombre"/></c:set>
					<c:set var="apellidos"><liferay-ui:message key="portletcrud.apellidos"/></c:set>
					<c:set var="fechaNacimiento"><liferay-ui:message key="portletcrud.fechaNacimiento"/></c:set>
					<c:set var="correo"><liferay-ui:message key="portletcrud.correo"/></c:set>
					<aui:input name="nombre" type="text" label="${nombre}" required="true" style="background: white">
						<aui:validator name="maxLength">100</aui:validator>
				    </aui:input>
					<aui:input name="apellidos" type="text" label="${apellidos}" required="true" style="background: white">
						<aui:validator name="maxLength">200</aui:validator>
				    </aui:input>
				    <aui:input name="fechaNacimiento" type="date" label="${fechaNacimiento}" required="true" style="background: white">
				    </aui:input>
				    <aui:input name="correo" type="text" label="${correo}" required="true" style="background: white">
						<aui:validator name="email"/>
				    </aui:input>
				    <div class="form-group input-text-wrapper"> 
				    	<liferay-captcha:captcha url="<%= captchaResourceURL %>"/>
				    </div>
				</aui:fieldset>
				<aui:button-row>
					<aui:button type="submit"></aui:button>
					<aui:button type="reset" value="clear"/>
				</aui:button-row>
			</aui:form>
		</div>
	</div>
</div>
