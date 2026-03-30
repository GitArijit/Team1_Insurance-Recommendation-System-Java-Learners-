package com.sahil.corejava.Day2.Task;
import java.util.*;

public class PhoneBook{
    List<Contact> list = new ArrayList<>();
    Map<String, Contact> nameMap = new HashMap<>();
    Map<String, Contact> phnoMap = new HashMap<>();

//    add contact details
    void addContact(Contact c) {
        list.add(c);
        nameMap.put(c.getName(), c);
        phnoMap.put(c.getPhno(), c);

    }
//    search by name
    void searchByName(String name){
        if(!nameMap.containsKey(name)){
            System.out.println("No contact found with name " + name);
        }
        else{
            System.out.println(nameMap.get(name));
        }
    }
//      search by phone
    void searchByPhone(String phno){
        if(!phnoMap.containsKey(phno)){
            System.out.println("No contact found with phone " + phno);
        }
        else{
            System.out.println(phnoMap.get(phno));
        }
    }

//    list all sorted by last name
    void listAllContact(){
        Collections.sort(list, new Comparator<Contact>(){
            @Override
            public int compare(Contact o1, Contact o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        for(Contact c: list){
            System.out.println(c);
        }
    }
}
