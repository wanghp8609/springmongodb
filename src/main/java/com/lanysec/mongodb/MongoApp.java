package com.lanysec.mongodb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.lanysec.mongodb.po.User;

import java.util.List;

import static org.springframework.data.mongodb.core.query.Query.query;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Update.update;

public class MongoApp {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        MongoOperations mongoOps = (MongoTemplate)context.getBean("mongoTemplate");

        User user = new User("zhangsan");
        user.setAddress("北京市海淀区");
        user.setAge(30);

        mongoOps.insert(user); //插入数据

        user = mongoOps.findById(user.getId(),User.class); //根据ID查找
        System.out.println(user);

        mongoOps.updateFirst(query(where("name").is("zhangsan")),update("age",35),User.class);  //更新update
        user = mongoOps.findOne(query(where("name").is("zhangsan")),User.class); //条件查找
        System.out.println(user);

        mongoOps.remove(user); //删除
        List<User> users = mongoOps.findAll(User.class);  //查找全部
        System.out.println("user size:" + users.size());
    }
}
