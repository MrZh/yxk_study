<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登录</title>
<script src="/js/jquery-3.2.1.min.js"></script>
</head>
<body>
	<form action="/Spring/login" method="POST">
		<input type="text" id="username" name="username"/>
		<input type="password" id="password" name="password"/>
		<input type="button" id="submit" value="提交"/>
		<input type="button" class="sub" value="提交">
	</form> 
	
	<script type="text/javascript">
	$().ready(function(){
		$("#submit").click(function(){

			$.ajax({
				url:"/Spring/login",
				type:"post",
				data:{
					"password":$("#password").val(),
					"username":$("#username").val()
				},
				success:function(data){
					alert(data.message);
					console.log(JSON.stringify(data));
					if(data.code == 1)
					{
						window.location.href="/Spring/Manage";
					}
				}
			});
		})

		$(".sub").click(function(){
			alert("sv");
		})
	})
	</script>
</body>
</html>