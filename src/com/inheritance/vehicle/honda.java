package com.inheritance.vehicle;

public class honda extends car
{
    private int roadServiceMonths;

    public honda(String name, String size, int doors, int gears, boolean isManual, int roadServiceMonths) {
        super("honda", "4dw", 4, 6, true);
        this.roadServiceMonths = roadServiceMonths;
    }
}
