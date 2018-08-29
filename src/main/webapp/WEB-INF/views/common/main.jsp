<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
	<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
	<script src="${context}/resources/js/app.js"></script>
    <title>Freelancer - Start Bootstrap Theme</title>

    <!-- Bootstrap core CSS -->
    <link href="${context}/resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom fonts for this template -->
    <link href="${context}/resources/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css">

    <!-- Plugin CSS -->
    <link href="${context}/resources/vendor/magnific-popup/magnific-popup.css" rel="stylesheet" type="text/css">

    <!-- Custom styles for this template -->
    <link href="${context}/resources/css/freelancer.min.css" rel="stylesheet">

	 <!-- Bootstrap core JavaScript -->
    <script src="${context}/resources/vendor/jquery/jquery.min.js"></script>
    <script src="${context}/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="${context}/resources/vendor/jquery-easing/jquery.easing.min.js"></script>
    <script src="${context}/resources/vendor/magnific-popup/jquery.magnific-popup.min.js"></script>

    <!-- Contact Form JavaScript -->
    <script src="${context}/resources/js/jqBootstrapValidation.js"></script>
    <script src="${context}/resources/js/contact_me.js"></script>

    <!-- Custom scripts for this template -->
    <script src="${context}/resources/js/freelancer.min.js"></script>

  </head>
<body id="page-top"> 	
	<div id="navi">
		<tiles:insertAttribute name="navi"/>
	</div> 
	<div id="header">
		<tiles:insertAttribute name="header"/>
	</div> 
	<div id="content">
		<tiles:insertAttribute name="content"/>
	</div> 
	<div id="footer">
		<tiles:insertAttribute name="footer"/>
	</div> 
	<div id="copyright">
		<tiles:insertAttribute name="copyright"/>
	</div> 
	<div id="scrollToTopButton">
		<tiles:insertAttribute name="scrollToTopButton"/>
	</div> 
	<div id="portfolioModal1">
		<tiles:insertAttribute name="portfolioModal1"/>
	</div> 
	<div id="portfolioModal2">
		<tiles:insertAttribute name="portfolioModal2"/>
	</div> 
	<div id="portfolioModal3">
		<tiles:insertAttribute name="portfolioModal3"/>
	</div> 
	<div id="portfolioModal4">
		<tiles:insertAttribute name="portfolioModal4"/>
	</div> 
	<div id="portfolioModal5">
		<tiles:insertAttribute name="portfolioModal5"/>
	</div> 
	<div id="portfolioModal6">
		<tiles:insertAttribute name="portfolioModal6"/>
	</div> 
	
	
	<script>
	app.init("${context}");
	app.session.setMember({
		memberId:"${member.memberId}",
		teamId:"${member.teamId}",
		name:"${member.name}",
		ssn:"${member.ssn}",
		roll:"${member.roll}",
		pass:"${member.pass}",
		age:"${member.age}",
		gender:"${member.gender}",
		subject:"${member.subject}"
	});
/* 	if(member.name != ""){
	 user.session({
		memberId:"${member.memberId}",
		teamId:"${member.teamId}",
		name:"${member.name}",
		ssn:"${member.ssn}",
		roll:"${member.roll}",
		pass:"${member.pass}",
		age:"${member.age}",
		gender:"${member.gender}",
		subject:"${member.subject}"
	}); 
	} */
	</script>
</body>
</html>

