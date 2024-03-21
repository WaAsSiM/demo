package com.example.demo.service;

import com.example.demo.entities.Person;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserServiceImpl  implements  UserService{

    @Autowired
    UserRepository userRepository;

    public Person save (Person user){

        return  userRepository.save(user);
    }
    public Person update(Person user){
        return  userRepository.save(user);
    }

    public Optional<Person> findById(long id){

        return userRepository.findById(id);
    }

    public List<Person> findAll(){
        return  userRepository.findAll();
    }

}
