package com.github.posmicanomaly.ezpzjerseyjboss;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;

@Path("shop")
public class JerseyController {

	@GET
	@Path("/bagels")
	public String getBagels() {
		return "You call these bagels?";
	}
}
