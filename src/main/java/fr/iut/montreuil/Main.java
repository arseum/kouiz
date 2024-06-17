package fr.iut.montreuil;

import fr.iut.montreuil.entities.dto.QuestionnaireDto;
import fr.iut.montreuil.exception.QuestionnaireException;
import fr.iut.montreuil.services.impl.QuestionnaireService;
import fr.iut.montreuil.services.interfaces.IQuestionnaireService;

import java.util.List;

public class Main {
    public static void main(String[] args) throws QuestionnaireException {
        IQuestionnaireService q = new QuestionnaireService();

        List<QuestionnaireDto> a = q.getQuestionnaires("/questionsQuizz_V1.1.csv");
        System.out.println(a);

    }
}