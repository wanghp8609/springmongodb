package com.lanysec.mongodb.repository.repositoryImpl;

import com.lanysec.mongodb.po.Person;
import com.lanysec.mongodb.repository.PersonRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.query.Criteria;

public class PersonRepositoryImpl{

    public Page<Person> find(Criteria criteria, Pageable pageable) {
        return null;
    }

}
