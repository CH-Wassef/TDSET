package org.example;


import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class EspritHashSet implements GestionEnseigent, Comparator<Enseignent> {


    HashSet<Enseignent> hashset =new HashSet<>();


    @Override
    public int compare(Enseignent o1, Enseignent o2) {
        return 0;
    }

    @Override
    public void ajouterEnseignant(Object e) {

    }

    @Override
    public boolean rechercherEnseignant(Object e) {
        return false;
    }

    @Override
    public boolean rechercherEnseignant(int id) {
        return false;
    }

    @Override
    public void supprimerEnseignant(Object e) {

    }

    @Override
    public void displayEnseignants() {

    }
}

