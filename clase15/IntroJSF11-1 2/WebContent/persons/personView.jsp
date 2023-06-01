<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Persona</title>
</head>
<body>
<f:view>
	<f:loadBundle basename="edu.curso.java.web.bundle.text" var="msg" />
	<b>Vista</b>
	<br>
	<h:form id="personaForm">
		<h:inputHidden id="idPerson" value="#{personBean.idPerson}" />
		<table width="500">
			<tr>
				<td><h:outputText value="#{personBean.generalMsg}" /></td>
			</tr>
		</table>
		<table width="500">
			<tr>
				<td><h:outputText value="#{msg.label_first_name}" /></td>
				<td><h:outputText value="#{personBean.firstName}" /></td>
			</tr>
			<tr>
				<td><h:outputText value="#{msg.label_last_name}" /></td>
				<td><h:outputText value="#{personBean.lastName}" /></td>
			</tr>
			<tr>
				<td><h:outputText value="#{msg.label_age}" /></td>
				<td><h:outputText value="#{personBean.age}" /></td>
			</tr>
			<tr>
				<td><h:outputText value="#{msg.label_sex}" /></td>
				<td><h:outputText value="#{personBean.sex}" /></td>
			</tr>
			<tr>
				<td colspan="2"><h:commandButton
					action="#{personBean.editPerson}" value="#{msg.button_edit_text}">
				</h:commandButton></td>

			</tr>
		</table>
	</h:form>
</f:view>

</body>
</html>