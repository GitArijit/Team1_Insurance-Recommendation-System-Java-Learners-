package com.sahil.corejava.Day2.Task;

public class Contact{
    private String name;
    private String phno;

    Contact(String name, String phno){
        this.name = name;
        this.phno = phno;
    }

    public String getLastName(){
        return name.substring(name.lastIndexOf(" ") + 1);
    }


    public String getName(){
        return name;
    }

    public String getPhno(){
        return phno;
    }


    public String toString(){
        return "Name: " + name + ", Phno: " + phno;
    }
}
