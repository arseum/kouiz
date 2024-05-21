package fr.iut.montreuil.entities.dto;

import fr.iut.montreuil.entities.tools.Difficulte;

public class QuestionDto {

    private int id;
    private int nombreApparition;
    private int nombreReussite;
    private String libelle;
    private String reponse;
    private Difficulte difficulte;

    public QuestionDto(int id, int nombreApparition, int nombreReussite, String libelle, String reponse, Difficulte difficulte) {
        this.id = id;
        this.nombreApparition = nombreApparition;
        this.nombreReussite = nombreReussite;
        this.libelle = libelle;
        this.reponse = reponse;
        this.difficulte = difficulte;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNombreApparition() {
        return nombreApparition;
    }

    public void setNombreApparition(int nombreApparition) {
        this.nombreApparition = nombreApparition;
    }

    public int getNombreReussite() {
        return nombreReussite;
    }

    public void setNombreReussite(int nombreReussite) {
        this.nombreReussite = nombreReussite;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getReponse() {
        return reponse;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }

    public Difficulte getDifficulte() {
        return difficulte;
    }

    public void setDifficulte(Difficulte difficulte) {
        this.difficulte = difficulte;
    }
}
