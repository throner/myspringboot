package test.throner.myspringboot.org.manager; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import throner.myspringboot.MyspringbootApplication;
import throner.myspringboot.org.manager.OrgManager;

/** 
* OrgManager Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 3, 2020</pre> 
* @version 1.0 
*/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyspringbootApplication.class)
public class OrgManagerTest {
    @Autowired
    private OrgManager orgManager;

    @Before
    public void before() throws Exception { 
    } 
    
    @After
    public void after() throws Exception { 
    } 
    
    /**
    * 
    * Method: getStaffName(String staffId) 
    * 
    */ 
    @Test
    public void testGetStaffName() throws Exception { 
        String sResult = orgManager.getStaffName("1");
        Assert.assertEquals("结果不正确","2212",sResult);
    } 
    
    /**
    * 
    * Method: queryUserByPage(long current, int size, String userId) 
    * 
    */ 
    @Test
    public void testQueryUserByPage() throws Exception { 
    //TODO: Test goes here... 
    } 

}
