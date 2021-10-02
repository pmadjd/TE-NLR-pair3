package com.techelevator.crm;

import com.techelevator.Billable;
import com.techelevator.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Customer extends Person implements Billable {
    private String phoneNumber;
    private List<Pet> pets = new ArrayList<>();

    public Customer() {

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public Customer(String firstName, String lastName, String phoneNumber){
        super.setFirstName(firstName);
        super.setLastName(lastName);
        this.phoneNumber = phoneNumber;
    }

    public Customer(String firstName, String lastName){
        new Customer(firstName, lastName, "");

    }

    @Override
    public double getBalanceDue(Map<String, Double> servicesRendered) {
        double totalDue = 0;
        for(Map.Entry<String, Double> map : servicesRendered.entrySet()){
            totalDue += map.getValue();
        }

        return totalDue;
    }
}
