package com.assignment.services;

import com.assignment.entity.Person;

public interface ICRUDContacts {
    void createContacts(Person person);
    void editContacts(String firstName);
    void deleteContacts(String firstName);




}
