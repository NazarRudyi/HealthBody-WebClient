<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
	
<tiles:insertDefinition name="base-definition">
	<tiles:putAttribute name="body">
		<div class="container">
			<table class="table">
				<tr class="info">
					<th>Name:</th>
					<th>Status:</th>
					<th></th>
				</tr>
				<tr>
					<c:forEach items="${groups}" var="p">
						<tr class="info">
							<td><a
								href="group.html?nameGroup=${p.idGroup}&userLogin=${user.login}">${p.name}</a>
							</td>
							<td>${p.status}</td>

							<c:forEach items="${groupcompetitions}" var="t">
								<c:if test="${t.idGroup == p.idGroup}">
									<c:set var="check" value="true" />
								</c:if>
							</c:forEach>
							<c:choose>
								<c:when test="${check}">
									<td><a class="confirm btn btn-primary" type="submit"
										href="leaveGroupCompetition.html?idGroup=${p.idGroup}&idCompetition=${getCompetition.idCompetition}">Leave
											group from competition</a></td>	
								</c:when>
								<c:otherwise>
									<td><a class="btn btn-success" type="submit"
										href="joinGroupCompetition.html?idGroup=${p.idGroup}&idCompetition=${getCompetition.idCompetition}">Join
											group to competition</a></td>
								</c:otherwise>
							</c:choose>
						</tr>
					</c:forEach>
				</tr>
			</table>
		</div>

		<div class="container" align="center">
			<ul class="pagination">

				<%--For displaying Previous link --%>
				<li><c:if test="${currentPage > 1}">
						<a
							href="<c:url value="/listOfGroups.html?idCompetition=${getCompetition.idCompetition}" >
        <c:param name="partNumber" value="${currentPage - 1}"/>${p}</c:url>">«</a>
					</c:if></li>

				<%--For displaying Page numbers --%>
				<li><c:forEach begin="${startPartNumber}"
						end="${lastPartNumber}" var="p">
						<a
							href="<c:url value="/listOfGroups.html?idCompetition=${getCompetition.idCompetition}" >
        <c:param name="partNumber" value="${p}"/>${p}</c:url>">${p}</a>
					</c:forEach></li>

				<%--For displaying Next link --%>
				<li><c:if test="${currentPage < lastPartNumber}">
						<a
							href="<c:url value="/listOfGroups.html?idCompetition=${getCompetition.idCompetition}" >
        <c:param name="partNumber" value="${currentPage + 1}"/>${p}</c:url>">»</a>
					</c:if></li>
			</ul>
		</div>

	</tiles:putAttribute>
</tiles:insertDefinition>