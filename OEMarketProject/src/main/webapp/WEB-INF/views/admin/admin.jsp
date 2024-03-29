<%@page import="com.oe.domain.MarketUserVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"> -->
<link rel="stylesheet" href="/resources/assets/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
 <style>
    /* Set height of the grid so .sidenav can be 100% (adjust as needed) */
    .row content {
    	height: 550px;
    	margin-top: 100px;
    }
    
    /* Set gray background color and 100% height */
    .sidenav {
      background-color: #f1f1f1;
      height: 100%;
     
    }
        
    /* On small screens, set height to 'auto' for the grid */
    @media screen and (max-width: 767px) {
      .row.content {height: auto;} 
     
    }
  </style>
<title>관리자 페이지</title>
</head>
<body>
	<%@ include file="../includes/header.jsp"%>


<section>
	<div class="container-fluid">
		<div class="row content">
			<div class="col-sm-3 sidenav hidden-xs">
				<h2>관리자 님</h2>
				<ul class="nav nav-pills nav-stacked">
					<li><a href="#">Dashboard</a></li>
					<li><a href="#">회원관리</a></li>
					<li><a href="#">게시물관리</a></li>
					<li><a href="#">회원 모드 </a></li>
				</ul>
				<br>
			</div>
			<br>

			<div class="col-sm-9">
				<div class="well">
					<h4>Dashboard</h4>
					<p>Some text..</p>
				</div>
				<div class="row">
					<div class="col-sm-3">
						<div class="well">
							<h4>가입자 수</h4>
							<p>31 명 / 7 명</p>
						</div>
					</div>
					<div class="col-sm-3">
						<div class="well">
							<h4>차단된 회원</h4>
							<p>3 명</p>
						</div>
					</div>
					<div class="col-sm-3">
						<div class="well">
							<h4>신고 받은 게시글</h4>
							<p>게시글</p>
						</div>
					</div>
					<div class="col-sm-3">
						<div class="well">
							<h4>블라인드 게시글</h4>
							<p>게시글</p>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-4">
						<div class="well" var ="notice"  value=${notice }">
							<p>공지사항</p>
							<p>공지사항</p>
							<p>공지사항</p>
						</div>
					</div>
					<div class="col-sm-4">
						<div class="well">
							<p>Q</p>
							<p>Q</p>
							<p>Q</p>
						</div>
					</div>
					<div class="col-sm-4">
						<div class="well">
							<p>?</p>
							<p>?</p>
							<p>?</p>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-8">
						<div class="well">
							<p>...</p>
						</div>
					</div>
					<div class="col-sm-4">
						<div class="well">
							<p>...</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>







	<%@ include file="../includes/footer.jsp"%>
</body>
</html>