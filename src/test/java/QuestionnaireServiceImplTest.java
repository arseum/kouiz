import domain.QuestionnaireFixture.QuestionnaireDtoFixture;
import fr.iut.montreuil.exception.QuestionnaireException;
import fr.iut.montreuil.services.impl.QuestionnaireService;
import fr.iut.montreuil.services.interfaces.IQuestionnaireService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class QuestionnaireServiceImplTest {

//    IQuestionnaireService questionnaireService;

    QuestionnaireMock questionnaireService;
    @BeforeEach
    void setUp() {

//        questionnaireService = new QuestionnaireService();
        questionnaireService = new QuestionnaireMock();
    }

    @Test
    @DisplayName("doit retourner des questionBO en fonction d'un input file")
    void test1() throws QuestionnaireException {

        // GIVEN

        // WHEN todo

        // THEN
//        Assertions.assertThat(questionnaireDtos)
//                .containsExactlyInAnyOrderElementsOf(questionnaireService.getQuestionnaires("test"));
    }

}