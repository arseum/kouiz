package fr.iut.montreuil.entities.tools;

public enum Difficulte {
    SIMPLE(1), INTERMEDIARE(1),EXPERT(2);

    private int value;

    Difficulte(int value) {
        this.value = value;
    }
}
