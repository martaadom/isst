package es.upm.dit.isst.bc.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import es.upm.dit.isst.bc.dao.ClienteDAOImplementation;
import es.upm.dit.isst.bc.model.Cliente;;


@Path("/Clientes")
public class ClienteResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Cliente> readAll () {
	        return ClienteDAOImplementation.getInstance().readAll();

	}
	
	
}