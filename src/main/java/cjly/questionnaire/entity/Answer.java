package cjly.questionnaire.entity;

import java.time.LocalDateTime;
import cjly.questionnaire.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author cjly
 * @since 2021-06-05
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Answer extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 填写者id
     */
    private Long userId;

    /**
     * 答案对应问题
     */
    private Long questionId;

    /**
     * 答案对应选项，获取内容
     */
    private Long optionId;

    /**
     * 答案内容
     */
    private String answerContent;

    /**
     * 答案提交时间
     */
    private LocalDateTime commitTime;


}
