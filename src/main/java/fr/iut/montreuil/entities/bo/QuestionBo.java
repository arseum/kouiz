package fr.iut.montreuil.entities.bo;

import fr.iut.montreuil.entities.tools.Difficulte;
import fr.iut.montreuil.entities.tools.Langue;

public class QuestionBo {

    private int id;
    private Langue langue;
    private String libelle;
    private String reponse;
    private String reference;
    private String explication;
    private int difficulte;

    public QuestionBo(int id, Langue langue, String libelle, String reponse, String reference, String explication, int difficulte) {
        this.id = id;
        this.langue = langue;
        this.libelle = libelle;
        this.reponse = reponse;
        this.reference = reference;
        this.explication = explication;
        this.difficulte = difficulte;
    }

    public int getId() {
        return id;
    }

    public Langue getLangue() {
        return langue;
    }

    public String getLibelle() {
        return libelle;
    }

    public String getReponse() {
        return reponse;
    }

    public String getReference() {
        return reference;
    }

    public String getExplication() {
        return explication;
    }

    public int getDifficulte() {
        return difficulte;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLangue(Langue langue) {
        this.langue = langue;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public void setExplication(String explication) {
        this.explication = explication;
    }

    public void setDifficulte(int difficulte) {
        this.difficulte = difficulte;
    }
}
