package test.throner.myspringboot.org.controller; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import throner.myspringboot.MyspringbootApplication;

/** 
* OrgController Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 3, 2020</pre> 
* @version 1.0 
*/

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyspringbootApplication.class)
public class OrgControllerTest {
    /**
     * 模拟mvc测试对象
     */
    private MockMvc mockMvc;

    /**
     * web项目上下文
     */
    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void before() throws Exception {
        //获取mockmvc对象实例
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @After
    public void after() throws Exception {
    }

    /**
    *
    * Method: getStaffName(@PathVariable String staffId)
    *
    */
    @Test
    public void testGetStaffName() throws Exception {
        MvcResult mvcResult = mockMvc
                .perform(
                        MockMvcRequestBuilders.get("/org/getStaffName/1")
                )
                .andReturn();
        int status = mvcResult.getResponse().getStatus();
        String responseString = mvcResult.getResponse().getContentAsString();
        Assert.assertEquals("请求错误", 200, status);
        Assert.assertEquals("返回结果不一致", "222", responseString);
    }

    /**
    *
    * Method: queryUserByPage(@PathVariable long current, @PathVariable int size, @PathVariable String userId)
    *
    */
    @Test
    public void testQueryUserByPage() throws Exception {
    //TODO: Test goes here...
    }

} 
