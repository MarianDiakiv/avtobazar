<%@ include file="/WEB-INF/taglib.jsp" %>


<div class="col-md-4 col-md-offset-4">
		<div class="login-wrapper">
			<div class="box">
				<div class="content-wrap">
					<h3>Add new Engine</h3>
					<form:form method="POST" action="/admin/addEngine" modelAttribute="engineModel" >
						Title: <input type="text" name="title"><br>
						Power: <input type="text" name="power"><br>
						Capacity: <input type="text" name = "capacity"><br>
						<input type="submit" value="Create Car engine">
					</form:form>
				</div>
			</div>
		</div>
</div>		