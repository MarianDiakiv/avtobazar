<%@ include file="/WEB-INF/taglib.jsp" %>
<h1>Car Info Form </h1>


<!-- <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script> -->
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->


<form:form method="POST" action="/cars/user/${userModel.id}/info/${carModelInfo.id}" modelAttribute="carModelInfo" enctype="multipart/from-data">
		<div class="container">
			<div class="row">       
		       <div class="col-md-7 ">
		
		<div class="panel panel-default">
		  <div class="panel-heading">  <h4 >Car Info page</h4></div>
		   <div class="panel-body">
		       
		    <div class="box box-info">
		        
		            <div class="box-body">
		                     <div class="col-sm-6">
		                     <div  align="center"> <img alt="User Pic" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSpiv8fq1YHIpzQnpf3pD6yxKhcpfZRBJB6opMB-BGwHZFeIDxs" id="profile-image1" class="img-circle img-responsive"> 
		
		                     </div>
		              
		              <br>
		    
		              <!-- /input-group -->
		            </div>
		            <div class="col-sm-6">
		            <h4 style="color:#00b1b1;">${carModelInfo.model} </h4>
		            
		            	<input type="submit" value="By Car">
		            
		            	<sec:authorize access="hasAnyRole('ROLE_ADMIN')">
		            		<br>
							<a href="/admin/edit/${carModelInfo.id}">Edit</a>
							</sec:authorize>
		             <!--  <span><p>Aspirant</p></span>  -->           
		            </div>
		            <div class="clearfix"></div>
		            <hr style="margin:5px 0 5px 0;">
		    
		              
		<div class="col-sm-5 col-xs-6 tital " >Car Model:</div><div class="col-sm-7 col-xs-6 ">${carModelInfo.model}</div>
		     <div class="clearfix"></div>
		<div class="bot-border"></div>
		
		<div class="col-sm-5 col-xs-6 tital " > Car Make:</div><div class="col-sm-7"> ${carModelInfo.carMake.title}</div>
		  <div class="clearfix"></div>
		<div class="bot-border"></div>
		
		<div class="col-sm-5 col-xs-6 tital " >Price:</div><div class="col-sm-7"> ${carModelInfo.price} $</div>
		  <div class="clearfix"></div>
		<div class="bot-border"></div>
		
		<div class="col-sm-5 col-xs-6 tital " >Options:</div><div class="col-sm-7">${carModelInfo.options}</div>
		
		  <div class="clearfix"></div>
		<div class="bot-border"></div>
		
		<div class="col-sm-5 col-xs-6 tital " >Year make:</div><div class="col-sm-7">${carModelInfo.year}</div>
		
		  <div class="clearfix"></div>
		<div class="bot-border"></div>
		
		<div class="col-sm-5 col-xs-6 tital " >Color:</div><div class="col-sm-7">${carModelInfo.color}</div>
		
		 <div class="clearfix"></div>
		<div class="bot-border"></div>
		
		<div class="col-sm-5 col-xs-6 tital " >BodyType:</div><div class="col-sm-7">${carModelInfo.bodyType}</div>
		
		 <div class="clearfix"></div>
		<div class="bot-border"></div>
		
		<div class="col-sm-5 col-xs-6 tital " >Fuel:</div><div class="col-sm-7">${carModelInfo.fuel}</div>
		
		<div class="clearfix"></div>
		<div class="bot-border"></div>
		
		<div class="col-sm-12">${carModelInfo.descriptions}</div>
		
		
		            <!-- /.box-body -->
		          </div>
		          <!-- /.box -->
		
		        </div>
		       
		            
		    </div> 
		    </div>
		</div>  
		     <!-- <script>
		              $(function() {
		    $('#profile-image1').on('click', function() {
		        $('#profile-image-upload').click();
		    });
		});        
		              </script>  -->      
		   </div>
		</div>
</form:form>



         





<%-- <form:form  >

model:<p> ${carModelInfo.model} </p>
Descriptions:<p> ${carModelInfo.price} </p>
<input type="submit" value="By Car">

</form:form> --%>