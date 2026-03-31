package com.sahil.corejava.Day4.Task;

import java.util.*;
import java.util.function.Predicate;

public class PhoneBook{
    List<Contact> list = new ArrayList<>();
    Map<String, Contact> nameMap = new HashMap<>();
    Map<String, Contact> phnoMap = new HashMap<>();

    public void addContact(Contact c) {
        list.add(c);
        nameMap.put(c.getName(), c);
        phnoMap.put(c.getPhno(), c);

    }

    public List<Contact> listAllContact(){
        list.sort(Comparator.comparing(Contact::getLastName).thenComparing(Contact::getPhno));
        return list;
    }

    public List<Contact> searchContact(Predicate<Contact> p){
        List<Contact> result = new ArrayList<>();
        for (Contact c : list){
            if(p.test(c)){
                result.add(c);
            }
        }
        return result;
    }

    public boolean validPhoneNumber(String phno){
        return phno.length() == 10;
    }

}
