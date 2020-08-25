<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name='viewport' content='width=device-width, initial-scale=1'>
<title>Short Navi</title>

<link rel="stylesheet" type="text/css" href="static/css/main.css"/>
</head>
<body>

<style>
#header {
	text-align: center;
	padding: 1.5rem;
	background-color: skyblue;
}
#button1{
	background-color: skyblue;
	text-align: right;
	padding: 8px;
}
#button2 {
	background-color: skyblue;
	text-align: right;
	padding: 8px;
}
#button3 {
	background-color: skyblue;
	text-align: right;
	padding: 8px;
}
</style>
	<header>
	<div id="header">
		<h3>Short Navi</h3>
		<p>이곳은 로그인,회원가입,마이페이지 메뉴를 놓는곳<br>
		마이페이지 안에는 회원정보수정, 회원탈퇴를 구현한다</p>
	</div>
	</header>

	<section id="main">
		<article id="button1">
			<button><a href="#">로그인</a></button>
			
		</article>
		
		<article id="button2">
			<button><a href="#">회원가입</a></button>
			
		</article>
		
		
		<article id="button3">
			<button><a href="#">마이페이지</a></button>
			
		</article>
		
	</section>

	
</body>
</html>