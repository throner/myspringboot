package throner.myspringboot.org.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import throner.myspringboot.org.entity.User;
import throner.myspringboot.org.mapper.UserMapper;
import throner.myspringboot.org.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author throner
 * @since 2020-06-30
 */
@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public IPage<User> queryUserByPage(Page<User> page, String userId) {
        return userMapper.queryUserByPage(page,userId);
    }
}
