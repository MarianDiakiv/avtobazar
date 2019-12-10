<%@ include file="/WEB-INF/taglib.jsp" %>
<h1>Car List</h1>
<%-- <form:form modelAttribute="userEntity" method="POST" action="/user/${userEntity.id}/buy/${car.id}" >--%>
	<div class="container">
	    <div class="row">
	    
	    	<div class="col-md-12">
				<div class="col-sm-6 col-md-4">   <c:forEach items="${carList}" var = "car">
					<div class="thumbnail" >
						<h4 class="text-center"><span class="label label-info"> ${car.carMake.title}   ${car.model}</span></h4>
						 <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSpiv8fq1YHIpzQnpf3pD6yxKhcpfZRBJB6opMB-BGwHZFeIDxs" class="img-responsive"> 
						<!-- <img src="http://placehold.it/650x450&text=Galaxy S5" class="img-responsive"> -->
						<div class="caption">
							<div class="row">
								<div class="col-md-6 col-xs-6">
									<p>Engine ${car.engine.title}</p>
									<p>Power ${car.engine.power}</p>
									<p>Power ${car.engine.capacity}</p>
								</div>
								<div class="col-md-6 col-xs-6 price">
									<h3>
									<label> Price :${car.price} $ </label></h3>
								</div>
							</div>
							<p>Options: ${car.options}</p>
							<div class="row">
								<div class="col-md-6">
									<a href="/cars/user/${UserEntytiModel.id}/info/${car.id}" class="btn btn-primary btn-product"><span class="glyphicon glyphicon-thumbs-up"></span> show info</a> 
								</div>
								<div class="col-md-6">
									<a href="/cars/user/${UserEntytiModel.id}/buy/${car.id}" class="btn btn-success btn-product"><span class="glyphicon glyphicon-shopping-cart"></span> Buy</a></div>
							</div>
							<sec:authorize access="hasAnyRole('ROLE_ADMIN')">
							<a href="/admin/edit/${car.id}">Edit</a>
							</sec:authorize>
	
							
						</div> 
					</div>    </c:forEach> 
				</div>
			</div>       
		</div>   
	</div>
<%-- </form:form>--%>
