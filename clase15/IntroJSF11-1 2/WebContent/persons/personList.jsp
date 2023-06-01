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
	<h:form id="personaForm">
		<b>Listado</b>
		<br>
		<table width="500">
			<tr>
				<td><h:outputText value="#{personBean.generalMsg}" /></td>
			</tr>
		</table>
		<h:dataTable value="#{personBean.personList}" var="person" width="500"
			rules="all">
			<h:column>
				<f:facet name="header">
					<h:outputText value="id" />
				</f:facet>
				<f:verbatim>click para editar:</f:verbatim>
				<h:commandLink action="#{personBean.viewPerson}">
					<h:outputText value="#{person.id}" />
					<f:param name="idPerson" value="#{person.id}" />
				</h:commandLink>
			</h:column>
			<h:column>
				<f:facet name="header">
					<h:outputText value="#{msg.label_first_name}" />
				</f:facet>
				<h:outputText value="#{person.firstName}" />
			</h:column>
			<h:column>
				<f:facet name="header">
					<h:outputText value="#{msg.label_last_name}" />
				</f:facet>
				<h:outputText value="#{person.lastName}" />
			</h:column>
			<h:column>
				<f:facet name="header">
					<h:outputText value="#{msg.label_age}" />
				</f:facet>
				<h:outputText value="#{person.age}" />
			</h:column>
			<h:column>
				<f:facet name="header">
					<h:outputText value="#{msg.label_email}" />
				</f:facet>
				<h:outputText value="#{person.email}" />
			</h:column>
		</h:dataTable>
	</h:form>
</f:view>

</body>
</html>