<%@ include file="/WEB-INF/taglib.jsp" %>

<div class="row">
	<div class="col-md-4 col-md-offset-4">
		<div class="login-wrapper">
			<div class="box">
				<div class="content-wrap">
					
					<c:if test="${param.fail}">
						<div style="color: red;" class="text-center">
							Fail to authorize
						</div>
					</c:if>	
					
					<form:form action="/login" method="POST">
						<fieldset>
							<legend>Login</legend>
							
							<div class="form-group">
	  							<label class="control-label">E-mail address</label>
								<input name="email" type="email" class="form-control" title="E-mail address" />
								
								<label class="control-label">Password</label>
								<input name="password" type="password" class="form-control" title="Password" />
								
								<div class="col-sm-10">
									<div class="checkbox">
										<label><input type="checkbox" name="rememberMe"/> Remember me</label>
									</div>
								</div>
							</div>
														
							<div class="form-group">
								<span class="input-group-btn">
									<input type="submit" class="btn btn-primary btn-block">
								</span>
							</div>
						</fieldset>
					</form:form>
				</div>
			</div>

			<div class="already">
				<p>Don't have an account yet?
					<a href="${pageContext.request.contextPath}/register">Register</a>
				</p>
			</div>
		</div>
	</div>
</div>