<%@ include file="/WEB-INF/taglib.jsp" %>
<link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<div class="container">
  <div class="row">
    <div class="span12">
      <div class="head">
        <div class="row-fluid">
            <div class="span12"><%--
                <div class="span6">
                    <h1 class="muted">Company Name</h1>
                </div>

                <div class="span4 offset2" style="margin-top:15px;">
                    <button class="btn pull-right" type="button">Sign In</button>
                </div>
                --%>
            </div>
        </div>

        <div class="navbar">
            <div class="navbar-inner">
                <div class="container">
                    <ul class="nav">
                        <li>
                            <a href="/home">Home</a>
                        </li>

                        <li>
                            <a href="/info">Info</a>
                        </li>

                        <li>
                            <a href="/login">Login</a>
                        </li>

                        <li>
                            <a href="/register">Registered</a>
                        </li>
                        <sec:authorize access="isAuthenticated()">
                        		<li>
                            		<a href="/cars/carlist">Car List</a>
                        		</li>
                        		
                        	<sec:authorize access="hasAnyRole('ROLE_USER')">
                        		<li>
                        			<a href="/user/profile">profile</a>
                        		</li> 
                        		                       	
                        	</sec:authorize>
                        	<sec:authorize access="hasAnyRole('ROLE_ADMIN')">
                        		
                        		<li>
                        			<a href="/admin/admin">profile</a>
                        		</li>
                        	
                        		<li>
                            		<a href="/admin/addcar">Add Car</a>
                        		</li>	
                        		<li>
                            		<a href="/admin/custom">Custom</a>
                        		</li>	
                        		<li>
                            		<a href="/admin/admin">Admin info page</a>
                        		</li>
                        		<li>
                            		<a href="/admin/addEngine">Add engine</a>
                        		</li>
                        		<li>
                            		<a href="/admin/addMaker">Add Maker</a>
                        		</li>
                        		
              
                        		
                        	</sec:authorize>
                        	
                        </sec:authorize>
                    </ul>
                </div>
            </div>
        </div>
      </div>
    </div>
  </div>
</div>

<%--<nav class="navbar navbar-expand-lg navbar-dark bg-dark ">
	<div class="conteiner">
		<div class="navbar-header">
			<div class="collapse navbar-collapse" id ="navbarSupportedContent">
				<a href="#" class="navbar-brand">
					<img  src="https://www.google.com.ua/search?hl=uk&biw=1366&bih=637&tbm=isch&sa=1&ei=WBS1WoLANYSn6AS-2I3gDQ&q=M&oq=M&gs_l=psy-ab.3..0i67k1j0l2j0i67k1j0l6.2952.3403.0.3770.2.2.0.0.0.0.120.120.0j1.2.0....0...1c.1.64.psy-ab..0.1.118.0...82.Y-clpmpKYQA#imgrc=golKxnEBlTstdM:" width="30px" height="30px" alt="logo">
				
				</a>
				<ul class="navbar-nav rm-auto"style="width: 300px">
					<li class="nav-item">
						<a href="#" class ="nav-link">Home</a>
					</li>
					<li class="nav-item">
						<a href="#" class ="nav-link">About as</a>
					</li>
					<li class="nav-item">
						<a href="#" class ="nav-link">Login</a>
					</li>
					<li class="nav-item">
						<a href="#" class ="nav-link">Registery</a>
					</li>
				</ul>
			</div>
		</div>
	</div>
</nav>--%>
<%-- 
<nav class="navbar navbar-default">
  <div class="container">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-2">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="${pageContext.request.contextPath}/">Web Project</a>
    </div>

    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-2">
      <ul class="nav navbar-nav">
        <li><a href="/">Home<span class="sr-only">(current)</span></a></li>
        <li><a href="#">Dreams</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Dropdown <span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="#">Action</a></li>
            <li><a href="#">Another action</a></li>
            <li class="divider"></li>
            <li><a href="#">Something else here</a></li>
          </ul>
        </li>
      </ul>

      <ul class="nav navbar-nav navbar-right" style="width: 300px;">
			<sec:authorize access="!isAuthenticated()">
		            <li><a href="/login">Login</a></li>
		            <li class="divider"></li>
		            <li><a href="/register">Register</a></li>		
		     </sec:authorize>
		     
		     <sec:authorize access="isAuthenticated()">
		     		<sec:authentication property="principal.username" var="username"/>
	     			<li><a href="/user">${username}</a></li>

					<c:url var="logoutUrl" value="/logout" />
					<form:form action="${logoutUrl}" method="post" cssStyle="padding-top: 7px;">
						<li><input class="btn btn-danger" type="submit" value="logout" /></li>
					</form:form>
			</sec:authorize>
      </ul>
    </div>
  </div>
</nav>
--%>
