let index={
	init: function(){
		$("#btn-save").bind("click",()=>{
			alert("회원가입 클릭!");
			this.save();
		});
		$("#btn-login").bind("click",()=>{
			alert("로그인 클릭!");
			this.login();
		});	
	},
	save: function(){
		let data = {
			userName: $("#userName").val(),
			passWord: $("#passWord").val(),
			email: $("#email").val()
		}
		console.log(data);
		$.ajax({
			type: "POST",
			url: "/api/joinuser",
			data: JSON.stringify(data),
			contentType: "application/json; charset=utf-8",
			dataType:"json"
		})
		.done(function(data){
			alert("회원가입 성공!");
			location.href ="/";
			console.log("data :" + data);
		})
		.fail(function(error){
			alert("회원가입 실패!");
		});
	},
	login: function(){
		let data = {
			userName: $("#username").val(),
			passWord: $("#password").val()
		}
		$.ajax({
			type: "POST",
			url: "/api/login",
			data: JSON.stringify(data),
			contentType: "application/json; charset=utf-8",
			dataType:"json"
		})
		.done(function(data){
			alert("로그인 성공!");
			location.href = "/";
			console.log(data);
			
		})
		.fail(function(error){
			alert("로그인 실패!");
		});
	}
	

}

index.init();

