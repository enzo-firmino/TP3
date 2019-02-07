package fr.umontpellier.iut.exo1;

import java.util.ArrayList;

public class Departement {
    private String specialite;
    private String adresse;
    private  ArrayList<Etudiant> listeEtudiant;

    public Departement(String specialite, String adresse) {
        this.specialite = specialite;
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "listeEtudiant=" + listeEtudiant +
                '}';
    }

    public  void inscrire(Etudiant etu){
        listeEtudiant.add(etu);
    }

    public  void desinscire(Etudiant etu){
        listeEtudiant.remove(etu);
    }
}
