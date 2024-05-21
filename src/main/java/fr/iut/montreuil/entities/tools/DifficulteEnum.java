package fr.iut.montreuil.entities.tools;

public enum DifficulteEnum {
    SIMPLE(1), INTERMEDIARE(1),EXPERT(2);

    private int value;

    DifficulteEnum(int value) {
        this.value = value;
    }
}
