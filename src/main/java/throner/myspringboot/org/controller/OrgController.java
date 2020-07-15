package throner.myspringboot.org.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import throner.myspringboot.org.manager.OrgManager;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author throner
 * @since 2020-06-30
 */
@RestController
@RequestMapping("/org")
@Slf4j
public class OrgController {
    @Resource
    private OrgManager orgManager;

    @RequestMapping("/getStaffName/{staffId}")
    public String getStaffName(@PathVariable String staffId){
        String sResult = "";
        sResult = orgManager.getStaffName(staffId);
        return sResult;
    }

    @RequestMapping("/queryUserByPage/{current}/{size}/{userId}")
    public String queryUserByPage(@PathVariable long current,@PathVariable int size,@PathVariable String userId){
        String sResult = "";
        sResult = orgManager.queryUserByPage(current,size,userId);
        return sResult;
    }

    @RequestMapping("/setRedis/{key}/{value}")
    public String setRedis(@PathVariable String key,@PathVariable String value){
        String sResult = "";
        orgManager.setRedisValue(key,value);
        return "0";
    }

    @RequestMapping("/getByEs/{searchContent}")
    public String  setRedis(@PathVariable String searchContent){
        return orgManager.getValueByEs(searchContent);
    }

    @RequestMapping("/getByEs1/{searchContent}")
    public String  setRedis1(@PathVariable String searchContent){
        return orgManager.getValueByEs1(searchContent);
    }

}
