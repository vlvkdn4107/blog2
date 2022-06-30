let board={
	init:function(){
		$("#btn-boardSave").bind("click",()=>{
			alert("글쓰기 클릭!");
			this.saveBoard();
		});
	},
	saveBoard: function(){
		let data = {
			title: $("#title").val(),
			content: $("#content").val()
		}
		$.ajax({
			
		})
		.done(function(data){
			alert("글쓰기 성공!");
			console.log(data);
		})
		.fail(function(error){
			
		});
	}
}

board.init();