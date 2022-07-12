package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.user;

public interface userRepository  extends MongoRepository<user,Integer>{

}
