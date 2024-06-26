package fr.iut.montreuil.entities.bo;

import fr.iut.montreuil.entities.dto.QuestionDto;
import fr.iut.montreuil.entities.tools.DifficulteEnum;
import fr.iut.montreuil.entities.tools.LangueEnum;

public class QuestionBo {

    private int id;
    private LangueEnum langue;
    private String libelle;
    private String reponse;
    private String reference;
    private String explication;
    private int difficulte;

    public QuestionBo(int id, LangueEnum langue, String libelle, String reponse, String reference, String explication, int difficulte) {
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

    public LangueEnum getLangue() {
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

    public void setLangue(LangueEnum langue) {
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

    public QuestionDto toDto() {
        return new QuestionDto(
                this.id,
                0,
                0,
                this.libelle,
                this.reponse,
                DifficulteEnum.values()[this.difficulte - 1]
        );
    }

    @Override
    public String toString() {
        return "QuestionBo{" +
                "id=" + id +
                ", langue=" + langue +
                ", libelle='" + libelle + '\'' +
                ", reponse='" + reponse + '\'' +
                ", reference='" + reference + '\'' +
                ", explication='" + explication + '\'' +
                ", difficulte=" + difficulte +
                '}';
    }
}
