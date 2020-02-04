package com.fuatKara;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path(value = "/selam")
public class mainApp {

// GET  -- READ demek
// POST -- INSERT 
// PUT -- UPDATE
// DELETE -- DELETE
	
	@GET  // GET bize, sitelere erisimimi sagliyor.
	public String method1() {
		System.out.println("Method 1");
		return "SELAMLAR HERKESE";
	}
	
}
