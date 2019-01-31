package com.example.Spring_Project.com.example.Spring_Project.interfaces;

import com.example.Spring_Project.com.example.Spring_Project.model.Item;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<Item,String>
{

}
