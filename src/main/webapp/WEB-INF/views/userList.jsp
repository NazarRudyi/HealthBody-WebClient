<!DOCTYPE html> 
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<tiles:insertDefinition name="base-definition">
	<tiles:putAttribute name="body">
	<div class="container">
		<table class="table">
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
			<c:forEach items="${AllUsers}" var="p">
				<tr>
					<td>${p.login}</td>
					<td>${p.firstname}</td>
					<td>${p.lastname}</td>
				<%-- 	<td>${p.email}</td> --%>
					<td>${p.age}</td>
					<%-- <td>${p.weight}</td> --%>
					<td>${p.gender}</td>
					<td>${p.health}</td>
					<td>${p.score}</td>
					<td>${p.roleName}</td>
				</tr>
			</c:forEach>
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