package com.chekan.M2;

import java.util.ArrayList;

public class MainTask {

    public static void main(String[] args) {

        Operator telecom = new Operator("Kyiv Star");  //  создания объектов

        telecom.addCustomer(new Customer("Курочкин","Иван","Петрович","Киев, Крещатик.",
                74305720455314L,345.45,456736.60,5353,3456));

        telecom.addCustomer(new Customer("Ципочкин","Федор","Николаевич","Одесса, Деребасовсксая.",
                6275849503679L,23276.50,23.66,1345,664546));

        telecom.addCustomer(new Customer("Гусятников","Иван","Федорович","Донецк, Ленина.",
                23571056402749L,113355.37,4346.34,42225,0));

        telecom.addCustomer(new Customer("Перепелкин","Константин","Владимирович","Умань, Героев.",
                56304829561048L,226794.35,234850.35,1154656,34535));

        telecom.addCustomer(new Customer("Тетеров","Максим","Егорович","Львов, Площа.",
                57205637402739L,336.98,2544645.75,8389,0));

        telecom.addCustomer(new Customer("Уткин","Геннадий","Евдотович","Харьков, Майдан.",
                56203657208632L,5.03,253666.43,458,855672));

        telecom.addCustomer(new Customer("Воробьев","Александр","Никодимович","Киев, Оболонь.",
                72275930573902L,2432568.11,2546746.54,245267,0));


        System.out.println("Customers sorted by name:");
        ArrayList<Customer> listName = telecom.getCustomerListByAlphabet();
        for (Customer cust : listName) {
            System.out.println(cust);
        }


        System.out.println("\n\nCustomers with Local time more then 10000ms:");
        ArrayList<Customer> listLocal = telecom.getCustomerListWithLocal(10000);
        for (Customer cust : listLocal) {
            System.out.println(cust);
        }

        System.out.println("\n\nCustomers who has International calls:");
        ArrayList<Customer> listInternational = telecom.getCustomerListWithInternational(0);
        for (Customer cust : listInternational) {
            System.out.println(cust);
        }

    }
}