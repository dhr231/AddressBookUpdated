package com.assignment.services;
import com.assignment.entity.Person;

import java.util.*;

public class CRUDContacts implements ICRUDContacts {
    List<Person> personList=new ArrayList<>();

    @Override
    public void createContacts(Person person){
        personList.add(person);
    }

    @Override
    public void editContacts(String firstName){
        for(Person per: personList){
            if(per.getFirstName().equalsIgnoreCase(firstName)){
                per.setFirstName(per.getFirstName());
                per.setLastName(per.getLastName());
                per.setCity(per.getCity());
                per.setState(per.getState());
                per.setZipCode(per.getZipCode());
                per.setPhoneNo(per.getPhoneNo());
                per.setEmail(per.getEmail());
                break;
            }
        }
    }

    @Override
    public void deleteContacts(String firstName){
        for(Person per: personList){
            if(per.getFirstName().equalsIgnoreCase(firstName)){
                personList.remove(per);
                break;
            }
        }
    }

}
