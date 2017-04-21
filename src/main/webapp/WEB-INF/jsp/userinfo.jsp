<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Address Successfully Submitted</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>

	<form:form action="/thankyou" method="post" modelAttribute="user">

		<div class="container">
		
			<div class="form-group">
				<c:if test="${errors != null}">	
			<div class="alert alert-danger" align="left">
			<table class="table table-condensed">									
						<c:forEach items="${errors}" var="error">
						<tr style="height:2px;"><td><c:out value="${error.defaultMessage}" /></td></tr>
						</c:forEach>														
			</table>
	       </div>
	       </c:if>	
			</div>
		
			<div class="form-group">
				<h2>Applicant Information:</h2>
			</div>

			<div class="form-group">
				<label for="Name">Name:</label> <form:input	class="form-control" path="name" />
			</div>
			
			<div class="form-group">
				<label for="phone">Phone:</label> <form:input class="form-control" path="phone" />
			</div>

			<div class="form-group">
				<label for="yeahsExperience">Years of Experience:</label> <form:input	class="form-control" path="yearsExperience" />
			</div>
			
			<div class="col-sm-12 form-group">
				<button class="btn pull-right btn-success" id="Submit"
					value="Enter another address" type="Submit">Submit</button>
			</div>

		</div>

	</form:form>


</body>
</html>
