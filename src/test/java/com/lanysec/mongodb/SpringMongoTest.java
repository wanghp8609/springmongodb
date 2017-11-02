package com.lanysec.mongodb;

import com.lanysec.mongodb.po.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;

public class SpringMongoTest {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Before
    public void testBefore(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        mongoTemplate = (MongoTemplate)context.getBean("mongoTemplate");
    }

    @Test
    public void testUserAdd(){
        User user = new User("wanghp");
        mongoTemplate.insert(user);
    }
}
