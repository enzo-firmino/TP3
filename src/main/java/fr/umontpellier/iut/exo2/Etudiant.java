package fr.umontpellier.iut.exo2;
import java.time.LocalDate;
import java.util.ArrayList;

public class Etudiant {

    private String nom;
    private String prenom;
    private String adressEmail;
    private String adressePostale;
    private LocalDate dateNaissance;
    private ArrayList<Note> listeNote;


    public Etudiant(String nom, String prenom, String adressEmail, String adressePostale, LocalDate dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.adressEmail = adressEmail;
        this.adressePostale = adressePostale;
        this.dateNaissance = dateNaissance;
    }


    @Override
    public String toString() {
        return "Etudiant{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adressEmail='" + adressEmail + '\'' +
                ", adressePostale='" + adressePostale + '\'' +
                ", dateNaissance=" + dateNaissance +
                '}';
    }

    public void setNom(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public void noter(Matiere matiere, float note){
        Note newNote = new Note(matiere, note);
        listeNote.add(newNote);
    }

    public float calculerMoyenne(){
        float moyenne =0;
        int nbNote =0;
        for(int i = 0; i<listeNote.size(); i++){
            moyenne = moyenne + listeNote.get(i).getNote()*listeNote.get(i).getMatiere().getCoeff();
            nbNote++;
        }
        moyenne = moyenne / nbNote;
        return  moyenne;
    }


}
