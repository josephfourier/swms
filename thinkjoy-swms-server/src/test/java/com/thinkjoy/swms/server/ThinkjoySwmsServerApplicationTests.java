package com.thinkjoy.swms.server;

import com.thinkjoy.ThinkjoySwmsServerApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ThinkjoySwmsServerApplication.class)
@WebAppConfiguration
public class ThinkjoySwmsServerApplicationTests {

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        // 构造appcontext
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();

    }

    /**
     * get方式:
     *
         mockMvc.perform(get("/manage/app/6"))
         .andExpect(status().isOk())//期望返回的code
         .andExpect(jsonPath("$.code",is(1)))//用jsonpath解析返回值是否符合规则
         .andExpect(jsonPath("$.message",notNullValue()))
         .andExpect(jsonPath("$.data",notNullValue()));
     *
     * post方式:
         mockMvc.perform(post("/user")
         .contentType(MediaType.APPLICATION_JSON_UTF8)
         .content(mapper.writeValueAsString(userInfo)))
         .andExpect...
     *
     * put方式:
          mockMvc.perform(put("/user")
          ...
     *
     * delete方式:
          mockMvc.perform(delete("/user/6")
          ...
     *
     * 其他参数参考api文档
     * @throws Exception
     */
    @Test
    public void testGetApp() throws Exception {
        //Mockito.when(appService.cacheDemo()).thenReturn(1);
        mockMvc.perform(get("/manage/app/6"))
                .andExpect(status().isOk())//期望返回的code
                .andExpect(jsonPath("$.code",is(1)))//用jsonpath解析返回值是否符合规则
                .andExpect(jsonPath("$.message",notNullValue()))
                .andExpect(jsonPath("$.data",notNullValue()));
                //.andExpect(redirectedUrl("/person/1"))
//                .andExpect(model().size(1))//
//                .andExpect(model().attributeExists("person"))
//                .andExpect(flash().attributeCount(1))
//                .andExpect(flash().attribute("message", "success!"));
    }


}
