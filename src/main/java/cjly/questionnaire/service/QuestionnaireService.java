package cjly.questionnaire.service;

import cjly.questionnaire.entity.Questionnaire;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author cjly
 * @since 2021-06-11
 */
public interface QuestionnaireService extends IService<Questionnaire> {

    IPage paging(Page page, Long Id, String order);
}
