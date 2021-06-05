package cjly.questionnaire.service.impl;

import cjly.questionnaire.entity.Question;
import cjly.questionnaire.mapper.QuestionMapper;
import cjly.questionnaire.service.QuestionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cjly
 * @since 2021-06-05
 */
@Service
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question> implements QuestionService {

}
