package com.example.demo.service;

import com.example.demo.entities.Person;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    Person save(Person user);
    Person update(Person user);
   Optional<Person> findById(long id);
    List<Person> findAll();



}
