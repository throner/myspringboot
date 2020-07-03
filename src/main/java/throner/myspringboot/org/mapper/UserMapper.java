package throner.myspringboot.org.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import throner.myspringboot.org.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author throner
 * @since 2020-06-30
 */
public interface UserMapper extends BaseMapper<User> {
    IPage<User> queryUserByPage(Page<?> page, @Param("userId") String userId);
}
