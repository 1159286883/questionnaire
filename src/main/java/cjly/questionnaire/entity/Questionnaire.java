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
 * @since 2021-06-11
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Questionnaire extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 问卷标题
     */
    private String title;

    /**
     * 问卷创建时间
     */
    private LocalDateTime establishTime;

    /**
     * 1代表发布，0代表没发布
     */
    private Integer status;

    /**
     * 创建者id
   外键
     */
    private Long establisherId;

    private String username;

    private String useravatar;

}
