package com.composition;

public class Main
{
    public static void main(String[] args)
    {
        Dimension dimension = new Dimension(13,41,42);
        Resolution resolution = new Resolution(21,41);
        Case theCase = new Case("elegant", "dell", "214", dimension);
        Monitor monitor = new Monitor("CIB7", "asus", 35, resolution);
        Motherboard motherboard = new Motherboard("classical", "hp", 2, 2, "HIED");

        PC thePC = new PC(theCase, monitor,motherboard);
        thePC.draw(3,4, "blue");
        thePC.powerUp();
    }
}
