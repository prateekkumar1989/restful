package com.pk.web;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorldService {
 
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
		String output = "Jersey says : " + msg;
		return Response.status(200).entity(output).build();
		//http://localhost:8080/rest/hello/pk
		/*
		 * For https
		 * "%JAVA_HOME%"\bin\keytool -genkey -alias tomcat -keyalg RSA -keystore keystore.jks
		 * Place keystore in /src/main/resources/
		 * https://localhost:8443/rest/hello/pk
		 */
	}
 
}