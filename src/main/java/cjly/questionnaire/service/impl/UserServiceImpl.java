package cjly.questionnaire.service.impl;

import cjly.questionnaire.common.lang.Result;
import cjly.questionnaire.entity.User;
import cjly.questionnaire.mapper.UserMapper;
import cjly.questionnaire.service.UserService;
import cjly.questionnaire.shiro.AccountProfile;
import cn.hutool.core.bean.BeanUtil;
import cn.hutool.crypto.SecureUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.stereotype.Service;

import java.util.Date;

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
    @Override
    public Result register(User user) {
        int count = this.count(new QueryWrapper<User>()
                .eq("phone", user.getPhone())
                .or()
                .eq("username", user.getUsername())
        );
        if(count > 0) return Result.fail("用户名或手机号已被占用");

        User temp = new User();
        temp.setUsername(user.getUsername());
        temp.setPassword(SecureUtil.md5(user.getPassword()));
        temp.setPhone(user.getPhone());
        temp.setUseravatar("/res/images/avatar/default.png");

        this.save(temp);

        return Result.success();
    }

    @Override
    public AccountProfile login(String phone, String password) {

        User user = this.getOne(new QueryWrapper<User>().eq("phone", phone));
        if(user == null) {
            throw new UnknownAccountException();
        }
        if(!user.getPassword().equals(password)){
            throw new IncorrectCredentialsException();
        }

        this.updateById(user);

        AccountProfile profile = new AccountProfile();
        BeanUtil.copyProperties(user, profile);

        return profile;
    }
}
