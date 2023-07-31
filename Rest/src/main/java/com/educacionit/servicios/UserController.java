package com.educacionit.servicios;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.educacionit.entidades.Usuario;
import com.educacionit.implementacion.mysql.UsuarioImplementacion;

@Path("/usuarios")
@Produces(MediaType.APPLICATION_JSON)
public class UserController {
	
	private UsuarioImplementacion imp = new UsuarioImplementacion();
	@GET
	@Path("/listar")	
	public List<Usuario> listar(){
		System.getProperty("user.dir");
		return imp.listar();
		
	}
	
	
}
