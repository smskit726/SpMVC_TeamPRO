<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name='viewport' content='width=device-width, initial-scale=1'>
<title>얼렁뚱땅 블로그</title>

<!-- css파일 불러들일 때 아래 코드가 필요함 -->
<link rel="stylesheet" type="text/css" href="static/css/main.css" />
<link rel="stylesheet" type="text/css" href="static/css/input.css" />

</head>
<body>
	<style>
		#main {
			text-align: center;
		}
		
		header {
			text-align: center;
		}
	
	
	</style>
	<header>
		<h3>로그인화면</h3>

	</header>

	<section id="main">
		<form action="writer" method="POST">
			<div>
				<input name="id" placeholder="아이디를 입력하세요" />
			</div>

			<div>
				<input name="pw" placeholder="비밀번호를 입력하세요" />
			</div>



			<div>
				<button type="button">처음으로</button>
				<button type="submit">로그인!</button>
			</div>

		</form>

	</section>


	
</body>
</html>