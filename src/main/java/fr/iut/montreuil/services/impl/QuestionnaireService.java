package fr.iut.montreuil.services.impl;

import fr.iut.montreuil.entities.bo.QuestionBo;
import fr.iut.montreuil.entities.dto.QuestionDto;
import fr.iut.montreuil.entities.dto.QuestionnaireDto;
import fr.iut.montreuil.entities.tools.LangueEnum;
import fr.iut.montreuil.exception.QuestionnaireException;
import fr.iut.montreuil.services.interfaces.IQuestionnaireService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class QuestionnaireService implements IQuestionnaireService {

    private ArrayList<String[]> readFromInputStream(InputStream inputStream) throws IOException {
        ArrayList<String[]> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {

            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line.split(";"));
            }
        }
        return lines;
    }

    @Override
    public List<QuestionnaireDto> getQuestionnaires(String fileLink) throws QuestionnaireException {

        InputStream inputStream = getClass().getResourceAsStream(fileLink);
        List<QuestionnaireDto> questionnaireDtos = new ArrayList<>();
        QuestionBo question;
        boolean est_ajouter;

        try {
            ArrayList<String[]> file = readFromInputStream(inputStream);
            for (String[] line : file) {
                question = new QuestionBo(
                        Integer.parseInt(line[1]),
                        LangueEnum.FR,
                        line[3],
                        line[4],
                        line[7],
                        line[6],
                        Integer.parseInt(line[5]));
                if (questionnaireDtos.isEmpty()) {
                    List<QuestionDto> l = new ArrayList<>();
                    l.add(question.toDto());
                    System.out.println(line[0]);
                    int number = Integer.parseInt(line[0]);
                    System.out.println(number);
                    questionnaireDtos.add(
                            new QuestionnaireDto(
                                    Integer.parseInt(line[0]),
                                    "",
                                    l)
                    );
                } else {
                    est_ajouter = false;
                    for (QuestionnaireDto d : questionnaireDtos) {
                        if (d.getId() == Integer.parseInt(line[0])) {
                            est_ajouter = true;
                            d.getQuestions().add(question.toDto());
                        }
                    }
                    if (!est_ajouter) {
                        List<QuestionDto> l = new ArrayList<>();
                        l.add(question.toDto());
                        questionnaireDtos.add(new QuestionnaireDto(Integer.parseInt(line[0]), "", l));
                    }
                }
            }
        } catch (IOException ignored) {
            System.out.println(ignored.fillInStackTrace());
            return List.of();
        }

        return questionnaireDtos;
    }
}
