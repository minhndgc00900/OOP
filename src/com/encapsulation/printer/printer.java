package com.encapsulation.printer;

public class printer
{
    private int tonerLevel;
    private int numberOfPage;
    private boolean duplexPrinter;

    public printer(int tonerLevel, int numberOfPage, boolean duplexPrinter) {

        if (tonerLevel > 0 && tonerLevel <= 100)
        {
            this.tonerLevel = tonerLevel;
        }
        else if (tonerLevel < 0)
        {
            this.tonerLevel = 0;
        }
        else
        {
            this.tonerLevel = 100;
        }

        if (numberOfPage >= 0)
        {
            this.numberOfPage = numberOfPage;
        }
        else
        {
            this.numberOfPage = 0;
        }

        this.duplexPrinter = duplexPrinter;
    }

    public int fillup(int ink)
    {
        if (tonerLevel > 0 && tonerLevel <= 100)
        {
            if (this.tonerLevel + ink > 100)
            {
                return -1;
            }
            this.tonerLevel += ink;
            return this.tonerLevel;
        }
        else
        {
            return -1;
        }
//        System.out.println("toner level is " + this.tonerLevel);
    }

    public int printingPage(int pages)
    {
        int pageToPrint = pages;
        if (this.duplexPrinter)
        {
            pageToPrint = (pages / 2) + (pages % 2);
            System.out.println("This is printed in duplex mode");
        }
        this.numberOfPage += pageToPrint;
        return pageToPrint;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }
}
