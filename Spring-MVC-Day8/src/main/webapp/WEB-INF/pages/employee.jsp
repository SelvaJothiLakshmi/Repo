<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.errMsg{
	color: red;
	font-size: 14px;
	font-style: italic;
}

</style>

</head>
<body>

<form:form action="saveEmployee" commandName="employee" method="post">
<h1 align="center">Employee Details</h1>
<table>
 <tr>
		<!-- <td>Employee Id:</td> -->
		<td>
			<form:hidden path="empId"/>
		</td>
		<td></td>
	</tr> 
	
	<tr>
		<td>FirstName:</td>
		<td>
			<form:input path="firstName"/>
		</td>
		<td> 
			<form:errors cssClass="errMsg" path="firstName"/>
		</td>
	</tr>
	
	
	
	<tr>
		<td>Last Name:</td>
		<td>
			<form:input path="lastName"/>
		</td>
		<td></td>
	</tr>
	
	
	<tr>
		<td>Salary:</td>
		<td>
			<form:input path="salary"/>
		</td>
		<td>
		<form:errors cssClass="errMsg" path="salary"/>
		</td>
	</tr>
	
	<tr>
		<td>Date of Birth:</td>
		<td>
			<form:input path="dob"/>
		</td>
		<td>
		<form:errors cssClass="errMsg" path="dob"/>
		</td>
	</tr>
	
	
	<tr>
		<td>Date of Joining:</td>
		<td>
			<form:input path="doj"/>
		</td>
		<td></td>
	</tr>
	<tr>
		<td></td>
		<td>
			<input type="submit" value="Save">
			<input type="submit" value="Update">
		</td>
		<td></td>
	</tr>

</table>

</form:form>

<c:if test="${!empty employees }">

	<table>
		<tr>
			<th>EmployeeId</th>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Salary</th>
			<th>Date Of birth</th>
			<th>Date Of joining</th>
			<th>Edit</th>
		</tr>
		
		<c:forEach items="${employees}" var="emp">
			<tr>
				<td>${emp.empId}</td>
				<td>${emp.firstName}</td>
				<td>${emp.lastName}</td>
				<td>${emp.salary}</td>
				<td>${emp.dob}</td>
				<td>${emp.doj}</td>
				
				<td>
					<a href="deleteEmp/${emp.empId}">delete</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<a href="getEmpRcrd/${emp.empId}">update</a>
				</td>
			</tr>
		</c:forEach>
	
	</table>

</c:if>



</body>
</html>