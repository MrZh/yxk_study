<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="/js/jquery-3.2.1.min.js"></script>
</head>
<body>

</body>

<script type="text/javascript">
	$().ready(function(){
		
		$.ajax({
			url:"/userManage/userlistdata",
			type:"get",
			success:function(data){
				console.log(JSON.stringify(data));
			}
		});
		
		$("#submit").click(function(){
		})
	})
	</script>
</html>