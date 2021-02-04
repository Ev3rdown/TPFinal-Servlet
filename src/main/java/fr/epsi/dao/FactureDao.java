package fr.epsi.dao;

import java.util.List;

import fr.epsi.entite.Facture;

public interface FactureDao {
        
    List<Facture> getFactures();
    Facture getFactureByNumero(String numero);
    
}
