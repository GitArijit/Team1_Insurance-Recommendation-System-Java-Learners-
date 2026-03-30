package com.sahil.corejava.Day3.Task;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        Contact c1= new Contact("md sahil", "+917894561230");
        Contact c2 = new Contact("biswanath tudu", "+919876542102");
        Contact c3 = new Contact("ijaz ahmed", "+917894012023");
        pb.addContact(c1);
        pb.addContact(c2);
        pb.addContact(c3);
        pb.addContact(new Contact("seema parasar", "+917887454100"));

//      List All elements in the list in sorted by last name
        System.out.println("*************************");
        System.out.println(pb.listAllContact());

//      Searching by name
        System.out.println("*************************");
        System.out.println("Search by name result:-");
        Optional<Contact> resultByName= pb.searchByName("md sahil");
        resultByName.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("No such contact")
        );

//      Search by phone no
        System.out.println("*************************");
        System.out.println("Search by phno result:-");
        Optional<Contact> resultByPhone = pb.searchByPhone("+917894012023");
        resultByPhone.ifPresentOrElse(
                System.out::println,
                ()-> System.out.println("No such contact")
        );
        System.out.println("*************************");
    }
}
