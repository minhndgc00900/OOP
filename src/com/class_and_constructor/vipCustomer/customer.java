package com.class_and_constructor.vipCustomer;

public class customer
{
    private String name;
    private double creditLimit;
    private String email;

    public customer() {
        this("Minh", 423.00, "minh@abc.com");

        System.out.println("we have " + name + " and " + creditLimit + " and " + email);
    }

    public customer(String name, double creditLimit) {
        this(name, creditLimit, "lam@abc.com");
    }

    public customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
