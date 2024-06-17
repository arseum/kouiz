import fr.iut.montreuil.entities.dto.QuestionDto;
import fr.iut.montreuil.entities.dto.QuestionnaireDto;
import fr.iut.montreuil.entities.tools.DifficulteEnum;

import java.util.ArrayList;
import java.util.List;

public class QuestionnaireMock {

    public static List<QuestionnaireDto> dataTest1() {
        List<QuestionnaireDto> questionnaireDtos = new ArrayList<>();

        QuestionnaireDto questionnaireDto = new QuestionnaireDto(
                ""
        );

        List<QuestionDto> questionDtos = new ArrayList<>();
        QuestionDto q1 = new QuestionDto(
                1,
                0,
                0,
                "combien de @?",
                "Tee",
                DifficulteEnum.SIMPLE
        );

        QuestionDto q2 = new QuestionDto(
                2,
                0,
                0,
                "Quel sport de raquett&e porte le nom de la ville anglaise où il fut inventé ?",
                "Badminton",
                DifficulteEnum.SIMPLE
        );

        questionDtos.add(q1);
        questionDtos.add(q2);
        questionnaireDto.setQuestions(questionDtos);
        questionnaireDtos.add(questionnaireDto);
        return questionnaireDtos;
    }


}
