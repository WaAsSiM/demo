package com.example.demo.ressources;

import com.example.demo.entities.Person;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class UserResource {

    @Autowired
    UserService userService;


    @PostMapping("/api/users")
    public ResponseEntity<Person> saveUser(@RequestBody() Person user) {
        Person result = userService.save(user);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

    @PutMapping("/api/users")
    public ResponseEntity<Person> updateUser(@RequestBody Person user) {
        Person result = userService.update(user);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping("/api/users/{id}")
    public ResponseEntity<Optional<Person>> findById(@PathVariable(name = "id") long id) {
        Optional<Person> result = userService.findById(id);
        return new ResponseEntity<>(result, HttpStatus.FOUND);
    }

    @GetMapping("/api/users")
    public ResponseEntity<List<Person>> findAll() {
        List<Person> result = userService.findAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
