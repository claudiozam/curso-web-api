<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<f:view>
	<h:form id="testTagsForm">
		<table>

			<tr>
				<td>text</td>
				<td><h:inputText id="text" value="#{testSessionBean.text}" /></td>
			</tr>
			<tr>
				<td>inputSecret</td>
				<td><h:inputSecret value="#{testSessionBean.text}" /></td>
			</tr>


			<tr>
				<td>hidden</td>
				<td><h:inputHidden id="hidden" value="#{testSessionBean.text}" /></td>
			</tr>


			<tr>
				<td>textArea</td>
				<td><h:inputTextarea id="textArea" rows="4" cols="7"
					value="Text............." /></td>
			</tr>

			<tr>
				<td>graphicImage</td>
				<td><h:graphicImage id="image" alt="img feliz"
					url="/img/imgfeliz.gif">
				</h:graphicImage></td>
			</tr>

			<tr>
				<td>validation</td>
				<td><h:inputText id="address" value="#{testSessionBean.text}"
					required="true" /> <h:commandButton
					action="#{testSessionBean.save}" value="Save" /><h:message
					style="color: red" for="address" /></td>
			</tr>

			<tr>
				<td>convert</td>
				<td><h:outputText value="#{testSessionBean.now}">
					<f:convertDateTime type="date" dateStyle="short" />
				</h:outputText></td>
			</tr>
			<tr>
				<td>convert</td>
				<td><h:inputText id="now" value="#{testSessionBean.now}">
					<f:convertDateTime type="date" dateStyle="short" />
				</h:inputText><h:message
					style="color: red" for="now" /></td>
			</tr>
			<tr>
				<td>selectOneMenu</td>
				<td><h:selectOneMenu id="selectOne"
					valueChangeListener="#{testSessionBean.testValueChange}"
					value="#{testSessionBean.itemValue}" immediate="true"
					onchange="this.form.submit();">
					<f:selectItems value="#{testSessionBean.itemList}" />
				</h:selectOneMenu></td>
			</tr>
			<tr>
				<td>selectManyCheckbox</td>
				<td><h:selectManyCheckbox  id="selectManyCheckbox"
					value="#{testSessionBean.itemValues}">
					<f:selectItems value="#{testSessionBean.itemList}" />
				</h:selectManyCheckbox></td>
			</tr>
		</table>
	</h:form>
</f:view>

</body>
</html>