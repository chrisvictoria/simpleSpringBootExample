package com.cristian.example.rest;


import java.util.List;
import java.util.ArrayList;


import javax.ws.rs.GET;
import javax.inject.Named;
import javax.ws.rs.Path;

import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Named
@Path("/")
public class ClientRest {
	private static List<Client> clients = new ArrayList<Client>();
	
	static{
		Client client1 = new Client();
		client1.setId(1);
		client1.setNome("Client 1");
		client1.setEmail("Client1@gmail.com");
		Client client2 = new Client();
		client2.setId(2);
		client2.setNome("Client 2");
		client2.setEmail("Client2@gmail.com");
		Client client3 = new Client();
		client3.setId(3);
		client3.setNome("Client 3");
		client3.setEmail("Client3@gmail.com");
		Client client4 = new Client();
		client4.setId(4);
		client4.setNome("Client 4");
		client4.setEmail("Client4@gmail.com");
		Client client5 = new Client();
		client5.setId(5);
		client5.setNome("Client 5");
		client5.setEmail("Client5@gmail.com");
		clients.add(client1);
		clients.add(client2);
		clients.add(client3);
		clients.add(client4);
		clients.add(client5);
	}
	

	@GET
	@Path("clients")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Client> getCustomers() {
		return clients;
	}
	
	@GET
	@Path("client")
	@Produces(MediaType.APPLICATION_JSON)
	public Client getCustomer(@QueryParam("id") long id) {
		Client cli = null;
		for (Client c : clients) {
			if (c.getId() == id)
				cli = c;
		}
		return cli;
	}
}
