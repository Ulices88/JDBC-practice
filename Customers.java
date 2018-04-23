package edu.pcc.cis233j.jdbctutorial;

import java.util.ArrayList;

public class Customer {
    private int id;
    private String name;
    private String city;
    private String state;
    private ArrayList<String>emailAddresses;


    public Customer(int id, String name, String city, String state) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.state = state;
        this.emailAddresses = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public ArrayList<String> getEmailAddresses() {
        return emailAddresses;
    }

    public void addEmailAddresses(String newEmail)
    {
        emailAddresses.add(newEmail);
    }

}