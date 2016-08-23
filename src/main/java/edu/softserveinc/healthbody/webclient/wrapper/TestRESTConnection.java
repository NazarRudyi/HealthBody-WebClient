package edu.softserveinc.healthbody.webclient.wrapper;

import java.io.IOException;

public class TestRESTConnection {
	
	public static void main(String[] args) throws IOException {
//		HttpURLConnectionREST.getInstance().sendGet(new CompetitionREST("Competitions", 1, 3));
//		HttpURLConnectionREST.getInstance().sendGet(new CompetitionREST("activeUserCompetitions", 1, 2, "Login%201"));
		HttpURLConnectionREST.getInstance().sendGet(new UserREST("UserByLogin", "Login%206"));
//		HttpURLConnectionREST.getInstance().sendGet(new UserREST("UsersWithNoCompetition", 1, 2));
//		HttpURLConnectionREST.getInstance().sendGet(new UserREST("UsersInGroup", 1, 2));
//		HttpURLConnectionREST.getInstance().sendGet(new GroupREST("groupDescription", "Name%20group%20number%201"));
//		HttpURLConnectionREST.getInstance().sendGet(new GroupREST("Groups", 1, 3));
	}

}
