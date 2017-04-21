/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.learn.spring2;

import com.learn.spring2.beans.PersonRepository;
import com.learn.spring2.beans.PersonService;
import com.learn.spring2.beans.SpringComponent;
import com.learn.spring2.model.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author fahmi
 */
public class MainTest {
    
    public static void main(String args[]){
        AnnotationConfigApplicationContext annotationConfigApplicationContext 
                = new AnnotationConfigApplicationContext(SpringComponent.class);
        PersonService personRepository = annotationConfigApplicationContext.getBean(PersonService.class);
        for(Person person : personRepository.findAll()){
            System.out.println("person name is " + person.getName());
        }
    }
    
}
