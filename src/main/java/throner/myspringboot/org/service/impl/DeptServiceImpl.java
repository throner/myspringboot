package throner.myspringboot.org.service.impl;

import throner.myspringboot.org.entity.Dept;
import throner.myspringboot.org.mapper.DeptMapper;
import throner.myspringboot.org.service.IDeptService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author throner
 * @since 2020-06-30
 */
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements IDeptService {

}
