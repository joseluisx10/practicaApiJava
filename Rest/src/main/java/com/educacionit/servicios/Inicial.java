package com.educacionit.servicios;


import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/inicial")
public class Inicial {
	
	private static List<String> nombres = new ArrayList<>();
	
	@GET //devolver info
	@Path("/holamundo")
	@Produces(MediaType.TEXT_PLAIN)
	public String holaMundo() {
		//exponemos el holamundo
		return "Hola Mundo!!!";
	}
	
	public Response agregar(String nombre) {
		return Response.ok().build();
	}
}
