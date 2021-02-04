package fr.epsi.service;

import java.util.List;

import fr.epsi.entite.Client;

public interface ClientService {
	
	public List<Client> getClients();
    public void createClient(String nom, String adresse);
}
