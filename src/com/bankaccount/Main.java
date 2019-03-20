package com.bankaccount;

import com.company.Car;

public class Main {

    public static void main(String[] args) {
        //bank_account baa = new bank_account(); <= the bracket is empty as =>
        //sometimes we want to use constructor insides another construction
        bank_account ba = new bank_account(312, 444, "Minh", "minh@m.com", "123714");

//        ba.setNumber(312);
//        ba.setBalance(444);
//        ba.setCusName("Minh");
//        ba.setEmail("minh@m.com");
//        ba.setPhone("0123914");

        ba.depositAccount(144);
        ba.withdrawAccount(53);

        System.out.println(ba.getNumber());
        System.out.println(ba.getBalance());
        System.out.println(ba.getCusName());
        System.out.println(ba.getEmail());
        System.out.println(ba.getPhone());


    }
}
