package cjly.questionnaire.entity;

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
public class Question extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 题目内容
     */
    private String content;

    /**
     * 题目类型，1代表单选，2代表多选，3代表填空
     */
    private Integer type;

    /**
     * 是否必做题，1代表必做，0代表不一定
     */
    private Integer whetherDo;

    /**
     * 题目对应问卷，外键
     */
    private Long questionnaireId;


}
