package com.offcn.controller;

import com.offcn.dao.PersonRepository;
import com.offcn.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    PersonRepository personRepository;


    @PostMapping("/add")
    public void add(Person person){
        personRepository.save(person);
    }

    @GetMapping("/getAll")
    public List<Person> getAll(){
       return personRepository.findAll();
    }
    @GetMapping("/getById/{id}")
    public Person getById(@PathVariable Long id){
        return personRepository.getOne(id);


    }
    @PutMapping("/update")
    public void update(@RequestBody Person person){
        personRepository.saveAndFlush(person);
    }
    @DeleteMapping("/delete")
    public void delete(@RequestParam Long id){
        personRepository.deleteById(id);
    }

    @GetMapping("/findByNameIs/{name}")
    public Person findByNameIs(@PathVariable String name){
        return personRepository.findByNameIs(name);
    }

}
