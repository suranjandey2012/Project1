<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>OrderConfirmation</title>
</head>
<body>
	<%@ include file="Header.jsp"%>

	<div class="container">
		<form action="<c:url value='/Payment'/>" method="post">
			<table align="center" class="table">

				<tr bgcolor="#EFBE63">

					<td colspan="5"><center>
							<h1>Your Orders</h1>
						</center></td>
				</tr>

				<tr bgcolor="#0F900E">
					<td><b>Product Id</b></td>
					<td><b>Product Name</b></td>
					<td><b>Quantity</b></td>
					<td><b>Price</b></td>
					<td><b>Total Price</b></td>
				</tr>


				<c:forEach items="${cartItems}" var="cartItem">
					<tr bgcolor="#61E9F6">
						<td>${cartItem.productId}</td>
						<td>${cartItem.productName}</td>
						<td>${cartItem.quantity}</td>
						<td>${cartItem.price}</td>
						<td>${cartItem.price*cartItem.quantity}</td>
						</form>
					</tr>
				</c:forEach>
				<tr bgcolor="#0F900E">
					<td colspan="4">TotalAmount</td>
					<td>${totalAmount}</td>

				</tr>


				<tr>
					<td colspan="5">
						<table width="100%">
							<tr bgcolor="#0F900E">
								<td><b>Select Your Payment Mode</b></td>
								<td><input type="radio" name="pmode" value="CD">Cash
									on Delivery <input type="radio" name="pmode" value="CC">Credit
									Card <input type="radio" name="pmode" value="NB">NetBanking
								</td>
							</tr>
						</table>
					</td>
				</tr>


				<tr bgcolor="#0F900E">
					<td colspan="4"><a href="<c:url value='/Cart'/>"
						class="btn btn-danger btn-block">Change Order</a></td>
					<td colspan="2"><input type="submit" value="Payment"
						class="btn btn-danger btn-block"/></td>
				</tr>
			</table>

		</form>
	</div>



	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<%@ include file="Footer.jsp"%>
</body>
</html>