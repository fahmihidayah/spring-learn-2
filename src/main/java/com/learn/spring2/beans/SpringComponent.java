/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.learn.spring2.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author fahmi
 */
@Configuration
public class SpringComponent {
    @Bean
    public PersonRepository personRepository(){
        return new PersonRepository();
    }
    
    @Bean
    @Autowired
    public PersonService psersonService(PersonRepository personRepository){
        return new PersonService(personRepository);
    }
}
