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
	<b>Form</b><br>
	<h:form id="personaForm">
		<h:messages ></h:messages>
		<h:inputHidden value="#{personBean.idPerson}" />
		<table width="500">
			<tr>
				<td><h:outputLabel value="#{msg.label_first_name}" for="firstName" /></td>
				<td><h:inputText  id="firstName"
					value="#{personBean.firstName}" required="true">
					<f:validateLength minimum="2" maximum="20" />
				</h:inputText> <h:message for="firstName" /></td>
			</tr>
			<tr>
				<td><h:outputLabel value="#{msg.label_last_name}" for="lastName" /></td>
				<td><h:inputText id="lastName"
					value="#{personBean.lastName}" required="true">
					<f:validateLength minimum="2" maximum="20" />
				</h:inputText><h:message for="lastName" /></td>
			</tr>
			<tr>
				<td><h:outputLabel value="#{msg.label_age}" for="age" /></td>
				<td><h:inputText  id="age"
					value="#{personBean.age}">
				</h:inputText><h:message for="age" /></td>
			</tr>
			<tr>
				<td><h:outputLabel value="#{msg.label_sex}" for="sex" /></td>
				<td><h:selectOneMenu  id="sex"
					value="#{personBean.sex}">
					<f:selectItems value="#{personBean.sexList}" />
				</h:selectOneMenu></td>
			</tr>
			<tr>
				<td><h:outputLabel value="#{msg.label_email}" for="email" /></td>
				<td>
					<h:inputText  id="email" value="#{personBean.email}" />
				</td>
			</tr>
			<tr>
				<td colspan="2"><h:commandButton
					action="#{personBean.saveNewPerson}"
					value="#{msg.button_save_text}" /></td>
			</tr>
		</table>
	</h:form>
</f:view>

</body>
</html>