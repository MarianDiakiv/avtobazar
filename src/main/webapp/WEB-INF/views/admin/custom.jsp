<%@ include file="/WEB-INF/taglib.jsp" %>
<h1>Custom form</h1>
<form:form>
	<table border="1">
		<c:forEach items="${customListModel}" var = "custom" >
		<c:if test="${customListModel}==null">
		<p style="color:red}" > Null </p>
		</c:if>
			<tr>
				<td> Status:  ${custom.status} <a href="" ></a></td>
				<td> Model:  ${custom.model.model} </td>
				<td> Model Price:  ${custom.model.price} </td>
				<td> First Name:  ${custom.user.firstName} </td>
				<td> <a href="/admin/confirm/${custom.id}">Confirm</a></td>

			</tr>
			
		</c:forEach>
	</table>
</form:form>