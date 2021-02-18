package com.chekan.M2;

import java.util.ArrayList;

public class Operator {

    private String name; //характеристика
    private ArrayList<Customer> customers = new ArrayList<>();

    public Operator(String name) {    // конструктор
        this.name = name;
    }

    public void addCustomer(Customer customer) {   // шо умеет
        customers.add(customer);
    }

    public String getName( ) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Customer> getCustomerListByAlphabet( ) {
        return customers;
    }

    public ArrayList<Customer> getCustomerListWithLocal(int i) {
        return customers;
    }

    public ArrayList<Customer> getCustomerListWithInternational(int i) {
        return customers;
    }
}
