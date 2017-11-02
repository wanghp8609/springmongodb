package com.lanysec.mongodb;

import com.lanysec.mongodb.po.User;
import com.mongodb.MongoClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;

public class App 
{
    public static void main( String[] args ) {

        /*ApplicationContext context = new AnnotationConfigApplicationContext("com.lanysec.mongodb");*/
        /*MongoClient mongoClient = (MongoClient)context.getBean("mongoClient");*/


        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        /*MongoOperations mongoOps = new MongoTemplate(mongoClient,"somc");*/

        MongoOperations mongoOps = (MongoTemplate)context.getBean("mongoTemplate");
        User user = new User("wanghp111");
        mongoOps.insert(user);
        System.out.println(user.getId());
    }
}
