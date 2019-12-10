<%@ include file="/WEB-INF/taglib.jsp" %>
<link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
<sec:authorize access="isAuthenticated()" >
<%-- <sec:authentication property="principal" var="user"/> --%>
	<form:form action="/logout" method="POST" modelAttribute="user">
	
	
	<div class="container">
      <div class="row">
      
        <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad" >
   
   
          <div class="panel panel-info">
            <div class="panel-heading">
              <h3 class="panel-title">User: ${user.role}  <br> <input type="submit" value="logout"></h3>
            </div>
            <div class="panel-body">
              <div class="row">
   
                <div class=" col-md-9 col-lg-9 "> 
                  <table class="table table-user-information">
                    <tbody>
                      <tr>
                        <td>email</td>
                        <td>${user.email}</td>
                      </tr>
                      
                   

  
                    </tbody>
                  </table>
                  
                
                </div>
              </div>
            </div>
                 
            
          </div>
        </div>
      </div>
    </div>
	
	<table>
		
	</table>
	
	
	</form:form>
</sec:authorize>