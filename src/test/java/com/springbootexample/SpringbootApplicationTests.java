package com.springbootexample;

import com.springbootexample.web.i18n.I18nService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {

    @Autowired
    private I18nService i18nService;
    @Test
    public void contextLoads() {
        String expectResult = "Home";
        String messageId = "label.home";
        String actual =  i18nService.getMessage(messageId);
        Assert.assertEquals("resut dont match",expectResult,actual);
    }

}
