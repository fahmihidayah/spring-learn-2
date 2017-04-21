/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.learn.spring2.beans;

import com.learn.spring2.model.Person;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fahmi
 */
public class PersonRepository {

    private List<Person> listPerson = new ArrayList<Person>();

    public PersonRepository() {
        listPerson.add(new Person());
        listPerson.add(new Person());
        listPerson.add(new Person());
        listPerson.add(new Person());
        listPerson.add(new Person());
        listPerson.add(new Person());
        listPerson.add(new Person());
        listPerson.add(new Person());
        listPerson.add(new Person());
        listPerson.add(new Person());
        listPerson.add(new Person());
    }

    public List<Person> findAll() {
        return listPerson;
    }
}
