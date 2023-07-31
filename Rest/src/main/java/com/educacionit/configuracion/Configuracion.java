package com.educacionit.configuracion;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/servicios")
public class Configuracion extends ResourceConfig {
	
	public Configuracion() {
		//Le indicamos el paquete donde se encuentran los servicios
		packages("com.educacionit.servicios");
	}
	
}
