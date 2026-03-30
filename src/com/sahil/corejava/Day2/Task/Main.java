package com.sahil.corejava.Day2.Task;

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
//        lists all contact details
        System.out.println("****************************");
        System.out.println("All contact details:");
        pb.listAllContact();
        System.out.println("****************************");
//        searching by name
        System.out.println("Details of search by name:");
        pb.searchByName("tudu");
        System.out.println("****************************");
//        searching by phone
        System.out.println("Details of search by phone:");
        pb.searchByPhone("+917894561230");
        System.out.println("****************************");
    }
}
