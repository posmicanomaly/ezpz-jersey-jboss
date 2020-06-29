package com.github.posmicanomaly.ezpzjerseyjboss;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Startup
@Singleton
public class JerseyApplication {
	
	private final String lotsOfStars = "********************";
	
	@PostConstruct
	public void doPost() {
		System.out.println(String.format("%s -- Visit http://localhost:8080/app/api/shop/bagels in your browser -- %s", lotsOfStars, lotsOfStars));
	}
}
