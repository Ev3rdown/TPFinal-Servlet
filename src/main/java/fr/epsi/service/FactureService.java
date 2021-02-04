package fr.epsi.service;

import java.util.List;

import fr.epsi.entite.Facture;

public interface FactureService {
    
    public Facture getFactureByNumero(String numero);
    public List<Facture> getFactures();
}
