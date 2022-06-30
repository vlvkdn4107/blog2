<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>

<div class="container">
	<form action="#">
		 <div class="form-group">
			<label for ="userName">User name :</label>
			<input type = "text" class = "form-control" placeholder="Enter userName" id ="userName" >
		</div>
		
		 <div class="form-group">
			<label for ="passWord">Password :</label>
			<input type = "password" class = "form-control" placeholder="Enter passWord" id ="passWord" >
		</div>
		
		 <div class="form-group">
			<label for ="email">Email :</label>
			<input type = "email" class = "form-control" placeholder="Enter email" id ="email" >
		</div>
		
		<button id="btn-save" type="button" class="btn btn-primary" >회원가입</button>
	</form>
</div>
<br/>
<script src ="/js/user.js"></script>
<%@ include file="../layout/footer.jsp" %>