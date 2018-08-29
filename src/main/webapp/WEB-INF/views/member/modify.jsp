<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div id="content-box">

	<form id="modifyFrom" name="modifyFrom">
	<table>
		<tr>
			<td rowspan="3">
				<img id="profile" src="${img}${profile}" />
			</td>
			
			<td>아이디</td>
			<td colspan="2" id="memberId"></td>
		</tr>
		<tr>
			<td>이름</td>
			<td colspan="2" id="name"></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td colspan="2">
				<input id="pass" type="password" name="pass" />
			</td>
		</tr>
		<tr>
			<td>나이</td>
			<td id="age"></td>
			<td><a id="moveUpdateTeamForm">팀명</a></td>
			<td>
				<input type="radio" name="teamId" id="ateam"
					value="ATEAM" />걍놀자
				<input type="radio" name="teamId" id="hteam"
					value="HTEAM" />지은이네
				<input type="radio" name="teamId" id="steam"
					value="STEAM" />왕거북이
				<input type="radio" name="teamId" id="cteam"
					value="CTEAM" />코딩짱 
			</td>
		</tr>
		<tr>
		<td>성별</td>
		<td id="gender"></td>
		<td><a id="moveUpdateRollForm">역활</a></td>
		<td>
			<select name="roll" id="roll">
				<option id="leader" value="leader">팀장</option>
				<option id="front" value="front">프론트개발</option>
				<option id="back" value="back">백단개발</option>
				<option id="android" value="android">안드로이드개발</option>
				<option id="minfe" value="minfe">민폐</option>
			</select>	
		</td>
		</tr>
	</table>
	<input id="modifyBtn" type="button" value="수정" />
	</form>
</div>
<%-- <form method="POST" enctype="multipart/form-data" action="${context}/member.do?action=fileupload&page=retrieve&userid=${user.memberId}">
  파일 업로드: <input type="file" name="upfile"><br/>
  <input type="submit" value="파일업로드">
</form>  --%>
<script>
	var j = JSON.parse(app.member());
	$('#memberId').text(j.memberId);
	$('#name').text(j.name);
	$('#age').text(j.age);
	$('#gender').text(j.gender);
	$('#roll').val(j.roll).attr("selected","selected");
	$("#"+j.teamId).attr('checked', 'checked');
</script>

