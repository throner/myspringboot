package throner.myspringboot.org.service.impl;

import throner.myspringboot.org.entity.Staff;
import throner.myspringboot.org.mapper.StaffMapper;
import throner.myspringboot.org.service.IStaffService;
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
public class StaffServiceImpl extends ServiceImpl<StaffMapper, Staff> implements IStaffService {

}
