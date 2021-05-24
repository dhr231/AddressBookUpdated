package com.assignment.controller;

import java.util.*;

import com.assignment.entity.*;
import com.assignment.services.*;
public class MainMenu {
     System.out.println("\t\t\t#### Welcome to Address Book ####");
    ICRUDContacts services = new CRUDContacts();
    Scanner scanner = new Scanner(System.in);
    int option;
        do {
        System.out.println("\t\tChoose Options : ");
        System.out.println("\t\t1. create new contact");
        System.out.println("\t\t2. edit existing contact");
        System.out.println("\t\t3. delete existing contact");
        System.out.println("\t\t4. exit");
        option = scanner.nextInt();
        switch (option) {
            case 1:
                String dummy = scanner.nextLine();
                System.out.println("Enter First Name : ");
                String firstName = scanner.nextLine();
                System.out.println("Enter Last Name:  ");
                String lastName = scanner.nextLine();
                System.out.println("Enter City : ");
                String city = scanner.nextLine();
                System.out.println("Enter State : ");
                String state = scanner.nextLine();
                System.out.println("Enter Pin Code : ");
                String zipCode = scanner.nextLine();
                System.out.println("Enter Phone Number : ");
                String phoneNo = scanner.nextLine();
                System.out.println("Enter Email : ");
                String email = scanner.nextLine();
                services.createContacts(new Person(firstName, lastName, city, state, zipCode, phoneNo, email));
                break;
            case 2:
                String dummy2 = scanner.nextLine();
                System.out.println("Enter first name");
                String name1 = scanner.nextLine();
                System.out.println("Enter last name");
                String name2 = scanner.nextLine();
                System.out.println("Enter New First Name");
                String newFirstName = scanner.nextLine();
                System.out.println("Enter New Last Name");
                String newLastName = scanner.nextLine();
                System.out.println("Enter New City");
                String newCity = scanner.nextLine();
                System.out.println("Enter New State");
                String newState = scanner.nextLine();
                System.out.println("Enter New Pin Code");
                String newPinCode = scanner.nextLine();
                System.out.println("Enter New Phone Number");
                String newMobileNo = scanner.nextLine();
                System.out.println("Enter New Email");
                String newEmail = scanner.nextLine();
                services.editContacts(name1);
                break;
            case 3:
                String dummy1 = scanner.nextLine();
                System.out.println("Enter first Name :  ");
                String fName = scanner.nextLine();
                services.deleteContacts(fName);
                break;
            default:
                break;


        }

    } while (option != 5);
}
}
}
