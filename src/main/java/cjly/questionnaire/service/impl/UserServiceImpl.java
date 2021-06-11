package cjly.questionnaire.service.impl;

import cjly.questionnaire.entity.User;
import cjly.questionnaire.mapper.UserMapper;
import cjly.questionnaire.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
