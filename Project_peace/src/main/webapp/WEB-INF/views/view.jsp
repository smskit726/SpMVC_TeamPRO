<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name='viewport' content='width=device-width, initial-scale=1'>
<!-- 우리가 만든 style을 적용해주기 위하여 해당 경로에 있는 css 파일과 붙여주는 것 -->
<link rel="stylesheet" type="text/css" href="static/css/main.css"/>
</head>
<body>
    <section id="main">
        <article id="button">
        	<!-- <a href="input"> 이걸 작성하면 내가 블로그작성 버튼을 누르면 웹사이트 주소가
        	 input으로 되어 있는 곳으로 이동을 한다 -->
            <button><a href="input">로그인</a></button>
             <button><a href="input">회원가입</a></button>
              <button><a href="input">마이페이지</a></button>
        </article>
   
        <!-- 이름명 명명할 때 가급적 _(언더바)로 해주기
        나중에 자바 스크립으로 넘어가면 -(일반)로 명명했을 때 문제 생길 수도 있다. -->
        <article id="blog_body">
            <section class="blog_title">
                <h4 >${TITLE}</h4>
               
            </section>
            
            
            <section class="blog_text">
                <p>${CONTENT}</p>
            </section>
       

      

</body>
</html>