<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<tiles:insertDefinition name="base-definition">
	<tiles:putAttribute name="body">
		<script>
		<!--
			function searchUsers() {
				var log = document.getElementById('Search').value;
				login = "";
				firsName = "";
				lastName = "";
				age = "";
				gender = "";
				health = "";
				score = "";
				roleName = "";
				var url = 'http://ws-healthbody.rhcloud.com/HealthBody-WebService/listener/searchusers?login='
						+ log
				$
						.getJSON(
								url,
								function(data) {
									var trHTML = '<tr class="info"><th>Login</th><th>Name</th><th>Surname</th><th>Age</th><th>Gender :</th><th>Health :</th><th>Score :</th><th>Role :</th>';
									$.each(data, function(i, item) {
										trHTML += '<tr><td>' + item.login
												+ '</td><td>' + item.firsName
												+ '</td><td>' + item.lastName
												+ '</td><td>' + item.age
												+ '</td><td>' + item.gender
												+ '</td><td>' + item.health
												+ '</td><td>' + item.score
												+ '</td><td>' + item.roleName
												+ '</td></tr>';
									});
									document.getElementById('table').innerHTML = trHTML;
								});
			}
		//-->
		</script>
		<div class="container">
		<form>
			<h4 align="right">
				search&nbsp;&nbsp;&nbsp;<input type="text" id="Search"
					oninput="searchUsers();">
			</h4>
		</form>
			<table class="table" id="table">
				<tr class="info">
					<th>Login</th>
					<th>Name</th>
					<th>Surname</th>
					<!-- <th>E-mail :</th> -->
					<th>Age</th>
					<!-- <th>Weight :</th> -->
					<th>Gender :</th>
					<th>Health :</th>
					<th>Score :</th>
					<th>Role :</th>
				</tr>
				 <c:if test="${empty document.getElementById('Search').value}">
					<c:forEach items="${AllUsers}" var="p">
						<tr id="tr">
							<td id="login">${p.login}</td>
							<td id="firsName">${p.firstname}</td>
							<td id="lastName">${p.lastname}</td>
							<td id="age">${p.age}</td>
							<td id="gender">${p.gender}</td>
							<td id="health">${p.health}</td>
							<td id="score">${p.score}</td>
							<td id="roleName">${p.roleName}</td>
						</tr>
					</c:forEach>
				</c:if>
			</table>
		</div>
		<div class="container" align="center">
			<ul class="pagination">

				<%--For displaying Previous link --%>
				<li><c:if test="${currentPage != 1}">
						<a
							href="<c:url value="/userlist.html" >
        <c:param name="partNumber" value="${currentPage - 1}"/>${p}</c:url>">«</a>
					</c:if></li>

				<%--For displaying Page numbers --%>
				<li><c:forEach begin="${startPartNumber}"
						end="${lastPartNumber}" var="p">
						<a
							href="<c:url value="/userlist.html" >
        <c:param name="partNumber" value="${p}"/>${p}</c:url>">${p}</a>
					</c:forEach></li>

				<%--For displaying Next link --%>
				<li><c:if test="${currentPage lt lastPartNumber}">
						<a
							href="<c:url value="/userlist.html" >
        <c:param name="partNumber" value="${currentPage + 1}"/>${p}</c:url>">»</a>
					</c:if></li>
			</ul>
		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>