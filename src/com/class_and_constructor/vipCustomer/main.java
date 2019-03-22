package com.class_and_constructor.vipCustomer;

public class main
{
    public static void main(String[] args) {
        customer cus = new customer();
        customer cus2 = new customer("lam", 2312.00);
        customer cus3 = new customer("tuan", 212.00, "ghj@abc.com");

        System.out.println( "we have " + cus2.getName() + " and " + cus2.getCreditLimit() + " and " + cus2.getEmail());
        System.out.println( "we have " + cus3.getName() + " and " + cus3.getCreditLimit() + " and " + cus3.getEmail());

    }
}
