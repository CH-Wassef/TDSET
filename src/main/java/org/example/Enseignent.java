package org.example;

public class Enseignent implements Comparable<Enseignent>{
    private int id;
    private String nom;
    private String prenom;

    public Enseignent(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Enseignent(){}

    @Override
    public boolean equals(Object obj) {
        if(obj==this)
            return true;
        if(obj==null) return false;
        if(obj.getClass()!=this.getClass())
            return false;

        Enseignent pe=(Enseignent) obj;
        return pe.id==id;
    }

    @Override
    public String toString() {
        return "Enseignant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public int hashCode() {
        return 3;
    }

    @Override
    public int compareTo(Enseignent o) {
        return o.id-id;
    }
}