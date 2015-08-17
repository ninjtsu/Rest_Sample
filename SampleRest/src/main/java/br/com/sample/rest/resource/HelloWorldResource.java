package br.com.sample.rest.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("hello")
public class HelloWorldResource {

	@GET
	@Path("{name}")
	public String sayHello(@PathParam("name") final String name) {
		final StringBuilder stringBuilder = new StringBuilder("SandBox | Hello ");
		stringBuilder.append(name).append("!");

		return stringBuilder.toString();
	}
}
