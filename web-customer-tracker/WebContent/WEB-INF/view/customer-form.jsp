<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
	<title>Save Customer</title>

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css">

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
</head>
<script type="text/javascript" language="javascript"> 

function validateForm()
{
	//alert("First Name and Last Name should not be left blank  \  email should be of the form xyz@gmail.com");
	var a = document.getElementById("fname");
    var b = document.getElementById("lname");
    var c = document.getElementById("email");
    var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
    //alert(a.value.length);
	if(a.value.length <= 0)
    {
      alert("First Name should not be left blank");
      //document.frm.pwd.focus();
      return false;

    }
    else if(b.value <=0)
    {
      alert("Last Name should not be left blank");
      //document.frm.pwd.focus();
      return false;
    }
	
    else if(!c.value.match(mailformat))
    {
      alert("email should be in the form name@domain.com");
      //document.frm.pwd.focus();
      return false;
    };
}
</script>
<body>
	
	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>

	<div id="container">
		<h3>Save Customer</h3>
	
		<form:form action="saveCustomer"  name ="frm" modelAttribute="customer" method="POST" onsubmit="return validateForm()">

			<!-- need to associate this data with customer id -->
			<form:hidden path="id" />
					
			<table>
				<tbody>
					<tr>
						<td><label>First name:</label></td>
						<td><form:input path="firstName" id ="fname" /></td>
					</tr>
				
					<tr>
						<td><label>Last name:</label></td>
						<td><form:input path="lastName" id = "lname"/></td>
					</tr>

					<tr>
						<td><label>Email:</label></td>
						<td><form:input path="email" id = "email" /></td>
					</tr>

					<tr>
						<td><label></label></td>
						<td><input type="submit"  value="Save" class="save" /></td>
					</tr>

				
				</tbody>
			</table>
		
		
		</form:form>
	
		<div style="clear; both;"></div>
		
		<p>
			<a href="${pageContext.request.contextPath}/customer/list">Back to List</a>
		</p>
	
	</div>

</body>
 
</html>




