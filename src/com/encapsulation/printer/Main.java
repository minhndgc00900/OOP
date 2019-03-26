package com.encapsulation.printer;



public class Main {

    public static void main(String[] args)
    {
        printer printer = new printer(30, 1, true);

        System.out.println("the toner printer now has " + printer.getTonerLevel()
                + " and printed " + printer.getNumberOfPage() + " page(s)");

        printer.fillup(50);
        printer.printingPage(5);

        System.out.println("the toner printer now has " + printer.getTonerLevel()
                + " and printed " + printer.getNumberOfPage() + " page(s)");
    }
}
//n