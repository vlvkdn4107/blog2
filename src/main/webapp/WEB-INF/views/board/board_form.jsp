<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>
 
<div class ="container">
	<form>
		<div class ="form-group">
			<label for = "title">제목 : </label>
			<input type="text" placeholder="title" class = form-control id="title" >
		</div>
		
		<div class ="form-group">
			<label for = "content">내용 : </label>
			<textArea class ="form-control summernote" rows="5" id="content"></textArea>
		</div>
		<button type="button" class="btn btn-primary"  id ="btn-boardSave">글쓰기</button>
	</form>
	<br/>
</div>

<script src = "/js/board.js"></script>
<%@ include file="../layout/footer.jsp" %>