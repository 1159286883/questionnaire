package cjly.questionnaire.Vo;

import cjly.questionnaire.entity.Questionnaire;
import lombok.Data;

@Data
public class QuestionnaireVo extends Questionnaire {

    private Long authorId;
    private String authorAvatar;
    private String authorName;

}
