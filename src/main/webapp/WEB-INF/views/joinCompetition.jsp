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
			<tr>
				<td><a class="btn btn-success" type="submit"
					href="joinCompetition.html?idCompetition=${getCompetition.idCompetition}&userLogin=${user.login}">Join
						Competition</a></td>
			</tr>
		</table>
	</div>
</tiles:putAttribute>
</tiles:insertDefinition>