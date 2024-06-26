package fr.iut.montreuil.services.interfaces;

import fr.iut.montreuil.entities.dto.QuestionnaireDto;
import fr.iut.montreuil.exception.QuestionnaireException;

import java.util.List;

public interface IQuestionnaireService {
    List<QuestionnaireDto> getQuestionnaires(String fileLink) throws QuestionnaireException;
}
