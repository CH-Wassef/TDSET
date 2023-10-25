package org.example;

import java.util.Comparator;
import java.util.TreeSet;

public class EspritTreeSet implements GestionEnseigent, Comparator<Enseignent> {

    TreeSet<Enseignent> treeSet = new TreeSet<>();


    public TreeSet<Enseignent> trieeParId(){
        TreeSet<Enseignent> treeSetord = new TreeSet<>(new EspritTreeSet());
        treeSetord.addAll(treeSetord);
        return treeSetord;
    }


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
