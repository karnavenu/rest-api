package com.apis.restapi.v1;

import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author Venu Karna
 */

@Path("v1/examples")
public class ExampleRESTService {

	@HeaderParam("token")
	private String token;

	public ExampleRESTService() {}

	@POST
	@Path("exampleapi")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateExample(String body) {
		//use token if needed. Validation is already done in web.xml
		return new Response();
	}

}