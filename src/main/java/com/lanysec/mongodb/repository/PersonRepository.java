package com.lanysec.mongodb.repository;

import com.lanysec.mongodb.po.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person,String> {
    Page<Person> find(Criteria criteria, Pageable pageable);

}