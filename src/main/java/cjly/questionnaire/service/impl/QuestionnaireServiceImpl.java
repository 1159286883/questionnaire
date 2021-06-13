package cjly.questionnaire.service.impl;

import cjly.questionnaire.Vo.QuestionnaireVo;
import cjly.questionnaire.entity.Questionnaire;
import cjly.questionnaire.mapper.QuestionnaireMapper;
import cjly.questionnaire.service.QuestionnaireService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cjly
 * @since 2021-06-11
 */
@Service
public class QuestionnaireServiceImpl extends ServiceImpl<QuestionnaireMapper, Questionnaire> implements QuestionnaireService {

    @Autowired
    QuestionnaireMapper questionnaireMapper;

    @Override
    public IPage<QuestionnaireVo> paging(Page page, Long Id, String order) {

        QueryWrapper wrapper = new QueryWrapper<Questionnaire>()
                .eq(Id != null, "id", Id)
                .orderByDesc(order != null, order);


        return questionnaireMapper.selectQuestionnaires(page, wrapper);
    }
}
