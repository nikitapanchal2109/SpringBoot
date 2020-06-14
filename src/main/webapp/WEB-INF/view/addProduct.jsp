<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Product</title>
</head>
<jsp:include page="menu.jsp" />
<body>
	<h3 style="color: red;">Add New Product</h3>

	<div id="addProduct">
		<form:form action="${pageContext.request.contextPath}/addNewProduct" method="post" modelAttribute="product">
			<p>
				<label>Enter Product Name</label>
				<form:input path="productName" />
			</p>
			<p>
				<label>Enter Product Category</label>
				<form:input path="productCategory" />
			</p>
			<p>
				<label>Enter Product Stock</label>
				<form:input path="stock" />
			</p>
			<input type="SUBMIT" value="Submit" />
		</form:form>
	</div>
</body>
</html>
