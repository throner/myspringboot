package throner.myspringboot.org.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import throner.myspringboot.org.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author throner
 * @since 2020-06-30
 */
public interface IUserService extends IService<User> {

    public IPage<User> queryUserByPage(Page<User> page, String userId);

}
