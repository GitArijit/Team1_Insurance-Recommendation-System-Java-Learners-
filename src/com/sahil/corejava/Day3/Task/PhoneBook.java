package com.sahil.corejava.Day3.Task;

import java.util.*;

public class PhoneBook{
    List<Contact> list = new ArrayList<>();
    Map<String, Contact> nameMap = new HashMap<>();
    Map<String, Contact> phnoMap = new HashMap<>();

    public void addContact(Contact c) {
        list.add(c);
        nameMap.put(c.getName(), c);
        phnoMap.put(c.getPhno(), c);

    }
    public Optional<Contact> searchByName(String name){
        return Optional.ofNullable(nameMap.get(name));
    }

    public Optional<Contact> searchByPhone(String phno){
        return Optional.ofNullable(phnoMap.get(phno));
    }

    public List<Contact> listAllContact(){
        list.sort(Comparator.comparing(Contact::getLastName).thenComparing(Contact::getPhno));
        return list;
    }
}
