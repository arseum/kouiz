package domain;

import com.github.javafaker.Faker;
import fr.iut.montreuil.entities.dto.QuestionDto;
import fr.iut.montreuil.entities.dto.QuestionnaireDto;
import fr.iut.montreuil.entities.tools.DifficulteEnum;

import java.util.List;
import java.util.stream.IntStream;

public class QuestionnaireFixture {

    private static final Faker FAKER = Faker.instance();

    public static class QuestionFixture {

        public static QuestionDto oneQuestion() {

            int nbApparition = FAKER.number().numberBetween(1, 100);

            return new QuestionDto(
                    FAKER.number().numberBetween(1, 100),
                    nbApparition,
                    FAKER.number().numberBetween(0, nbApparition),
                    FAKER.lorem().characters(1, 100),
                    FAKER.lorem().characters(1, 70),
                    DifficulteEnum.values()[FAKER.number().numberBetween(0, 2)]);
        }

        public static List<QuestionDto> of(int nb) {

            assert nb > 0;

            return IntStream.range(0, nb)
                    .mapToObj(i -> oneQuestion()).toList();
        }

    }

    public static class QuestionnaireDtoFixture {

        public static QuestionnaireDto oneQuestionnaire() {

            return new QuestionnaireDto(
                    FAKER.number().numberBetween(1, 100),
                    FAKER.lorem().characters(1, 100),
                    QuestionFixture.of(FAKER.number().numberBetween(1, 20))
            );
        }

        public static List<QuestionnaireDto> of(int nb) {

            assert nb > 0;

            return IntStream.range(0, nb)
                    .mapToObj(i -> oneQuestionnaire()).toList();
        }

    }
}
