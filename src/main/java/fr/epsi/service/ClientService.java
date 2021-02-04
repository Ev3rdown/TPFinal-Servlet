package fr.epsi.service;

import java.util.List;

import fr.epsi.entite.Client;

public interface ClientService {
	
	List<Client> getClients();
    void createClient(String nom, String adresse);
}
