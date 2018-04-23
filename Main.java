package jdbcPracice

import java.util.ArrayList;

/***
 * @author Ulices Cardenas
 * @Version 02/07/2018
 *
 *
 */



public class Main {


    public static void main (String[]args){
        System.out.println("FiredUp Customers:");
        FiredUpDB firedUp = new FiredUpDB();
        ArrayList<edu.pcc.cis233j.jdbctutorial.Customer> customers = firedUp.readCustomers();
        for (edu.pcc.cis233j.jdbctutorial.Customer cust: customers){
            System.out.println("ID: " + cust.getId() +
                    ", Name: " + cust.getName() +
                    ", City: " + cust.getCity() +
                    ", State: " + cust.getState());
        }


    }




}

