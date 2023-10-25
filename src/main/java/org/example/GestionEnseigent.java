package org.example;

public interface GestionEnseigent <Enseignent>{
    public void ajouterEnseignant(Enseignent e);
    public boolean rechercherEnseignant (Enseignent e);
    public boolean rechercherEnseignant (int id);
    public void supprimerEnseignant (Enseignent e);
    public void displayEnseignants();
}




