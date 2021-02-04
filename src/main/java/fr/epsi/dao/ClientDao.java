package fr.epsi.dao;

import java.util.List;

import fr.epsi.entite.Client;

public interface ClientDao {
    
    List<Client> getClients();
    void createClient(Client c);
    
}
