package com.bankaccount;

public class bank_account
{
    private int number;
    private int balance;
    private String cusName;
    private String email;
    private String phone;

    public bank_account() //<= this is how to create a constructor contains another constructor
    {
        this(123, 444,"ddd", "add@ddd.com", "1234");
        System.out.println("empty Constructor");
    }
    //the purpose of constructor is for us to essentially initialize =>
    //the object that you're creating and do whatever else you want =>
    //when the object is created.


    public bank_account(int number, int balance, String cusName, String email, String phone) {
        //this is contrustor, its name must be similar with class name
        this.number = number;
        this.balance = balance;
        this.cusName = cusName;
        this.email = email;
        this.phone = phone;
    }

    public void depositAccount(int depositAccount)
    {
        this.balance += depositAccount;
    }

    public void withdrawAccount(int withdrawAccount)
    {
        if (this.balance >= withdrawAccount)
        {
            this.balance = this.balance - withdrawAccount;
//            System.out.println(this.balance);
        }
        else
        {
            System.out.println("you are not allowed to do that");
        }

    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getNumber() {
        return number;
    }

    public int getBalance() {
        return balance;
    }

    public String getCusName() {
        return cusName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}
//