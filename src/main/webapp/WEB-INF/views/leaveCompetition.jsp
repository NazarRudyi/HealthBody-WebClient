<!DOCTYPE html> 
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<link rel="icon"
	href="https://d13yacurqjgara.cloudfront.net/users/678458/screenshots/1856046/h-icon.png">
<!-- Bootstrap -->
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script  type="text/javascript"
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js" async></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script  type="text/javascript" src="resources/js/bootstrap.min.js" async></script>
	<!-- bootbox code -->
	<script src="resources/js/bootbox.min.js" async></script>
	<script>
		$(document).on("click", ".confirm", function(e) {
	        bootbox.confirm("Are you sure? All your scores and awards in this competition will be lost!", function(result){ 
					if (result) {
						location.href = "leaveCompetition.html?idCompetition=${getCompetition.idCompetition}&userLogin=${user.login}";
					} else {
					}
			});
	    });
	</script>
<tiles:insertDefinition name="base-definition">
	<tiles:putAttribute name="body">
	<div class="container">
		<table class="table">
			<tr class="info">
				<th>Name :</th>
				<td>${getCompetition.name}</td>
			</tr>
			<tr class="info">
				<th>Description :</th>
				<td>${getCompetition.description}</td>
			</tr>
			<tr class="info">
				<th>Start Date :</th>
				<td>${getCompetition.startDate}</td>
			</tr>
			<tr class="info">
				<th>Finish Date :</th>
				<td>${getCompetition.finishDate}</td>
			</tr>
			<tr class="info">
				<th>My Score :</th>
				<td>${getScore.userScore}</td>
			</tr>
			<tr>
				<td><a class="confirm btn btn-primary" type="submit" href=#>Leave
						competition</a></td>
			</tr>
		</table>
	</div>
</tiles:putAttribute>
</tiles:insertDefinition>