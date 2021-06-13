package cjly.questionnaire.mapper;

import cjly.questionnaire.Vo.QuestionnaireVo;
import cjly.questionnaire.entity.Questionnaire;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author cjly
 * @since 2021-06-11
 */
public interface QuestionnaireMapper extends BaseMapper<Questionnaire> {

    IPage<QuestionnaireVo> selectQuestionnaires(Page page, @Param(Constants.WRAPPER) QueryWrapper wrapper);
}
