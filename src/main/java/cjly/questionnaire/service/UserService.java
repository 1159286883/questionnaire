package cjly.questionnaire.service;

import cjly.questionnaire.common.lang.Result;
import cjly.questionnaire.entity.User;
import cjly.questionnaire.shiro.AccountProfile;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author cjly
 * @since 2021-06-11
 */
public interface UserService extends IService<User> {
    Result register(User user);

    AccountProfile login(String phone, String password);
}
