<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>
<div class ="container">
	<form action="#">
		<div class ="form-group">
			<label for="userName">User Name :</label>
			<input type="text" class="form-control" placeholder="Enter userName" id="username">		
		</div>
		
		<div class ="form-group">
			<label for="passWord">Password :</label>
			<input type="password" class="form-control" placeholder="Enter passWord" id="password">		
		</div>
		<div class="from-group form-check">
			<label class ="form-check-label">
				<input class="form-check-input" type="checkbox"/>Remember me</label>
		</div>
		<br/>
		<button id="btn-login" type ="button" class="btn btn-primary">로그인</button>
	</form>
</div>
<br/>

<script src ="/js/user.js"></script>
<%@ include file="../layout/footer.jsp" %>