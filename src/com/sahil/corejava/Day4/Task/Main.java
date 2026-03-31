package com.sahil.corejava.Day4.Task;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        String menu = """
        ***** User guide *****
        Enter 1 to add a new contact
        Enter 2 to search contact by nam
        Enter 3 to search contact by phone number
        Enter 4 to see all contacts
        Enter 5 to exit program
        **********************
        """;
        System.out.println(menu);

        int input;
        Scanner s = new Scanner(System.in);

        do{
            System.out.print("Enter your choice: ");
            input = s.nextInt();
            s.nextLine();
            switch (input){
                case 1:
                    System.out.println("\nEnter the name of the contact you want to add: ");
                    String name = s.nextLine();
                    System.out.println("\nEnter the phone no. you want to add: ");
                    String phno = s.nextLine();
                    if(!pb.validPhoneNumber(phno)){
                        do{
                            System.out.println("Invalid phone number");
                            phno = s.nextLine();
                        }while(!pb.validPhoneNumber(phno));
                    }
                    while(!pb.validPhoneNumber(phno)){
                        System.out.println("Invalid phone number");
                        phno = s.nextLine();
                    }
                    pb.addContact(new Contact(name, phno));
                    System.out.println("Contact saved");
                    break;

                case 2:
                    System.out.println("Enter the text you want to search: ");
                    name = s.nextLine();
                    List<Contact> nameSearchResult = pb.searchContact(c->c.getName().startsWith(name));
                    if(nameSearchResult.isEmpty()){
                        System.out.println("No contact found");
                    }
                    else{
                        System.out.println("Search result:-");
                        nameSearchResult.forEach(System.out::println);
                    }
                    break;

                case 3:
                    System.out.println("Enter the phone no. to search the contact: ");
                    String phone = s.nextLine();
                    List<Contact> phoneSearchResult = pb.searchContact(c->c.getPhno().contains(phone));
                    if(phoneSearchResult.isEmpty()){
                        System.out.println("No contact found");
                    }
                    else{
                        System.out.println("Search result:-");
                        phoneSearchResult.forEach(System.out::println);
                    }
                    break;

                case 4:
                    System.out.println("Your contacts:");
                    if(pb.listAllContact().isEmpty()){
                        System.out.println("No contact found");
                    }
                    else{
                    System.out.println(pb.listAllContact());
                    }
                    break;

                case 5:
                    System.out.println("Exited program!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again");
            }

        } while(input!=5);




    }
}
