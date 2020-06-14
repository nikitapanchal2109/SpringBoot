<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div style="border: 1px solid #ccc; padding: 5px; margin-bottom: 20px;">

	<a href="${pageContext.request.contextPath}/home">Home</a> | &nbsp;

	<a href="${pageContext.request.contextPath}/addNewProduct">Add Product</a> |   
	
	<a href="${pageContext.request.contextPath}/getProducts">Show Products</a> |   
	
	<%-- <u><h2 style="color: red;">
            <a onclick="document.forms['logoutForm'].submit()">Logout</a>
            </h3></u>

    <form id="logoutForm" method="POST" action="${contextPath}/logout">
    </form> --%>

</div>