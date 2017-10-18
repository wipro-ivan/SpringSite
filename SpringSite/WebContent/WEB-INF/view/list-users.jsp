<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>List All Users</title>
	</head>
	<body>
		<!-- Heading of page -->
		<div id="wrapper">
			<div id ="header">
			<h2>CRM - Customer Relationship Manager</h2>
			</div>
		</div>
		<!-- content of page -->
		<div id="container">
			<div id="content">
				<!--  HTML TABLE -->
				<table>
					<tr> 
					<!-- Headings for each column -->
						<th>First Name</th>
						<th>Last Name</th>
						<th>Email</th>
					</tr>
					<!--  Loop to print out all customers details under correct column-->
					<c:forEach var = "tempUser"	items="${users}"> 
						<tr>
							<td> ${tempUser.firstName}</td>
							<td> ${tempUser.lastName}</td>
							<td> ${tempUser.emailAddr}</td>
						</tr>
					</c:forEach>
				</table>		 
			</div>
		</div>
		
	</body>
</html>