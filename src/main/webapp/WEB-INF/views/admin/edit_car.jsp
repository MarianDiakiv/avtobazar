<%@ include file="/WEB-INF/taglib.jsp" %>
<h1>Edit car Form</h1>

<div class="col-md-4 col-md-offset-4">
		<div class="login-wrapper">
			<div class="box">
				<div class="content-wrap">
					<h3>Edit car</h3>
					<form:form method="POST" action="/admin/edit/${editCarModel.id}" modelAttribute="editCarModel" enctype="multipart/from-data">
						Car Model: <input type="text" name="model" disabled="true"><br>
						Price: <input type="text" name="price"><br>
						Year: <input type="text" name="year"><br>
						Options: <input type="text" name="options"><br>
						Descriptions: <input type="text" name="descriptions"><br>
						Color: <input type="text" name="color"><br>
						
						Body: 
						<form:select path="bodyType" items="${bodyModel}" disabled="true"></form:select><br>
						
						Engine:
						
						<form:select path="engine" items="${engineList}" itemLabel="title"></form:select><br>
						Car Make:
						<form:select path="carMake" items="${makers}" disabled="true" itemLabel="title"></form:select><br>
						Fuel:
						<form:select path="fuel" items="${typeFuel}" disabled="true" itemLabel="type"></form:select>
						
						 <%-- <label class="control-label">Car Image:</label><br>
							<form:input path="carImage" type="file"/> <br>--%>
						<input type="submit" value="Edit Car">
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
		



<%-- <div class="col-md-4 col-md-offset-4">
		<div class="login-wrapper">
			<div class="box">
				<div class="content-wrap">
					<h3>Edit Cars</h3>
					<form:form method="POST" action="${pageContext.request.contextPath}/custom" modelAttribute="editCarModel">
						
						Price: <input type="text" name="price"><br>
						Options: <input type="text" name="options"><br>
						Descriptions: <input type="text" name="descriptions"><br>
						Color: <input type="text" name="color"><br>
						
						
						<input type="submit" value="Create Car">
					</form:form>
				</div>
			</div>
		</div>
</div>	 --%>	