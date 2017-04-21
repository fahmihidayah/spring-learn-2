/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.learn.spring2.beans;

import com.learn.spring2.model.Person;
import java.util.List;

/**
 *
 * @author fahmi
 */
public class PersonService {
    
    private PersonRepository personRepository;
    
    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }
    
    public List<Person> findAll(){
        return personRepository.findAll();
    }
    
}
