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
public class Option extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 答案（选项）内容
     */
    private String optionContent;

    /**
     * 对应问题id
     */
    private Long questionId;


}
