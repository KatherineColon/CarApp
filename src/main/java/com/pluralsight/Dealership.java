package com.pluralsight;

import java.util.ArrayList;

public class Dealership {
    String name;
    String address;
    String phone;
    ArrayList<Vehicle> inventory = new ArrayList<>();
    public Dealership (String name, String address, String phone){
        this.name = name;
        this.address = address;
        this.phone = phone;
    }


    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getPhone (){
        return phone;
    }

}
