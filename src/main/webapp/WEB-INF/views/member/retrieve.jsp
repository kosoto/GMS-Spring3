<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<section id="portfolio">
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
			<td><a>비밀번호</a></td>
			<td colspan="2">**********</td>
		</tr>
		<tr>
			<td>나이</td>
			<td id="age"></td>
			<td><a>팀명</a></td>
			<td id="teamId"></td>
		</tr>
		<tr>
		<td>성별</td>
		<td id="gender"></td>
		<td><a>역활</a></td>
		<td id="roll"></td>
		</tr>
	</table>
</section>
<script>
var j = JSON.parse(app.member());
$('#memberId').text(j.memberId);
$('#name').text(j.name);
$('#age').text(j.age);
$('#gender').text(j.gender);
$('#roll').text(j.roll);
$("#teamId").text(j.teamId);
</script>
