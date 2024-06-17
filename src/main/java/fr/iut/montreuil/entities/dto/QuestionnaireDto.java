package fr.iut.montreuil.entities.dto;

import java.util.ArrayList;
import java.util.List;

public class QuestionnaireDto {

    private int id;
    private String name;
    private List<QuestionDto> questions;
    public static int compteur_id = 1;

    public QuestionnaireDto(String name) {
        this(name, new ArrayList<>());
    }

    public QuestionnaireDto(String name, List<QuestionDto> questions) {
        this.id = compteur_id;
        compteur_id++;
        this.name = name;
        this.questions = questions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<QuestionDto> getQuestions() {
        return questions;
    }

    public void setQuestions(List<QuestionDto> questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "QuestionnaireDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", questions=" + questions +
                '}';
    }
}