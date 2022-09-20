<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
<style type="text/css">
.input_wrap{
	padding: 5px 20px;
}
label{
    display: block;
    margin: 10px 0;
    font-size: 20px;	
}

input{
	padding: 5px;
    font-size: 17px;
}
textarea{
	width: 800px;
    height: 200px;
    font-size: 15px;
    padding: 10px;
}

</style>
</head>
<body>

<h1>게시판 등록</h1>


<form action = "/board/enroll" method = "post">
	<div class = "input_wrap">
		<label>제목</label>
		<input name = "title">
	</div>
	<div class = "input_wrap">
		<label>내용</label>
		<textarea rows = "3" name = "content"></textarea>
	</div>
	<div class = "input_wrap">
		<label>이름</label>
		<input name = "writer">
	</div>
	
	<button class = "btn">등록</button>

</form>
</body>
</html>