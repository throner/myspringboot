package throner.myspringboot.org.manager;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import throner.myspringboot.org.entity.Staff;
import throner.myspringboot.org.entity.User;
import throner.myspringboot.org.service.IDeptService;
import throner.myspringboot.org.service.IEccCodeDictService;
import throner.myspringboot.org.service.IStaffService;
import throner.myspringboot.org.service.IUserService;
import throner.myspringboot.tool.RedisUtils;

import javax.annotation.Resource;
/**
 * Created by chenjiansheng on 2020-6-30.
 */
@Component
@Slf4j
public class OrgManager {
    @Resource
    private IStaffService staffService;
    @Resource
    private IDeptService deptService;
    @Resource
    private IUserService userService;
    @Resource
    private IEccCodeDictService eccCodeDictService;


    // 启用事务
    @Transactional
//    @DS("slave")
    public String getStaffName(String staffId){
        String sResult = "";
        QueryWrapper<Staff> queryWrapper = new QueryWrapper<Staff>();
        queryWrapper.lambda().eq(Staff::getStaffId,staffId);
        sResult = staffService.getOne(queryWrapper).getStaffName();
//        Staff staff = new Staff();
//        staff.setStaffId("11");
//        staff.setStaffName("1");
//        staffService.save(staff);
//        Staff staff1 = new Staff();
//        staff1.setStaffId("22");
//        staff1.setStaffName("2");
//        staffService.save(staff1);
//        Staff staff2 = null;
//        staffService.save(staff2);
        return sResult;
    }

    @Transactional
    @DS("slave")
    public String queryUserByPage(long current,int size,String userId){
        log.info("queryUserByPage.....................................");
        String sResult = "";
        Page<User> page = new Page<User>();
        page.setCurrent(current);
        page.setSize(size);
        sResult = userService.queryUserByPage(page,userId).getRecords().get(0).getName();

        Staff staff = new Staff();
        staff.setStaffId("11");
        staff.setStaffName("1");
        staffService.save(staff);
        Staff staff1 = new Staff();
        staff1.setStaffId("22");
        staff1.setStaffName("2");
        staffService.save(staff1);
        return sResult;
    }

    public void setRedisValue(String key,String value){
        boolean bResult = RedisUtils.set(key,value);
    }
}
