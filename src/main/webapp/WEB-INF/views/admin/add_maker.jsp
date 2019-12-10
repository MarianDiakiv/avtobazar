<%@ include file="/WEB-INF/taglib.jsp" %>

<form:form method="POST" modelAttribute="carMake">
<div class="col-md-4 col-md-offset-4">
		<div class="login-wrapper">
			<div class="box">
				<div class="content-wrap">
					<h3>Add new maker</h3>
					
					
					<form:errors path="title"  style="color:red"/><br>
						Car Maker: <input type="text" name="maker"><br>
						<input type="submit" value="Create Car Maker">
					
				</div>
			</div>
		</div>
</div>
</form:form>		