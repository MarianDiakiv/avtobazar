<%@ include file="/WEB-INF/taglib.jsp" %>


<div class="col-md-4 col-md-offset-4">
		<div class="login-wrapper">
			<div class="box">
				<div class="content-wrap">
					<h3>Add new car</h3>
					<form:form method="POST" action="/admin/addcar" modelAttribute="modelRequest" enctype="multipart/from-data">
						Car Model: <input type="text" name="model"><br>
						Price: <input type="text" name="price"><br>
						Year: <input type="text" name="year"><br>
						Options: <input type="text" name="options"><br>
						Descriptions: <input type="text" name="descriptions"><br>
						Color: <input type="text" name="color"><br>
						
						Body: 
						<form:select path="bodyType" items="${bodyModel}"></form:select><br>
						
						Engine:
						
						<form:select path="engine" items="${listEngine}" itemLabel="title"></form:select><br>
						Car Make:
						<form:select path="carMake" items="${makers}" itemLabel="title"></form:select><br>
						Fuel:
						<form:select path="fuel" items="${typeFuel}" itemLabel="type"></form:select>
						
						 <%-- <label class="control-label">Car Image:</label><br>
							<form:input path="carImage" type="file"/> <br>--%>
						<input type="submit" value="Create Car">
					</form:form>
				</div>
			</div>
		</div>
</div>		
<%-- 
<div class="row">
	<div class="col-md-4 col-md-offset-4">
		<div class="login-wrapper">
			<div class="box">
				<div class="content-wrap">
					<h3>Add new car</h3>
					<form:form action="/register" modelAttribute="userModel">
						<div class="form-group">
							<form:errors path="*" cssClass="error"/>
						</div>
						<div class="form-group">
  							<label class="control-label">E-mail address</label>
							<form:input path="email" cssClass="form-control" title="E-mail address" />
							
							 <label class="control-label">First Name</label>
							<form:input path="firstName" cssClass="form-control" title="E-mail address" />
							
							<label class="control-label">Last Name</label>
							<form:input path="lastName" cssClass="form-control" title="E-mail address" />
							
							<label class="control-label">Age</label>
							<form:input path="age" cssClass="form-control" title="E-mail address" />

							<label class="control-label">Password</label>
							<form:password path="password" cssClass="form-control" title="Password" />
							
							<label class="control-label">Password Confirmation</label>
							<form:password path="passwordConfirmation" cssClass="form-control" title="Password Confirmation" />
						</div>
						<div class="form-group">
							<span class="input-group-btn">
								<input type="submit" class="btn btn-primary" value="Register">
							</span>
						</div>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</div>
--%>