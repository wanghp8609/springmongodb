package com.lanysec.mongodb;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean("mongoClient")
    public MongoClient mongoClient(){

        System.out.println("test");
        return new MongoClient("192.168.3.212",27017);
    }
}
