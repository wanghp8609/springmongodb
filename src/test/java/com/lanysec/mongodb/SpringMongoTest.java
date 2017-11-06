package com.lanysec.mongodb;

import com.lanysec.mongodb.po.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

public class SpringMongoTest extends BaseJunit4Test{

    @Autowired
    private MongoTemplate mongoTemplate;

    @Test
    public void testUserAdd(){
        User user = new User("wanghp");
        mongoTemplate.insert(user);
    }
}
