package com.inheritance.vehicle;

public class honda extends car
{
    private int roadServiceMonths;

    public honda(int roadServiceMonths) {
        super("Civic", 44, 4, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate)
    {
        int newSpeed = getSpeed() + rate;

        if (newSpeed == 0)
        {
            super.stop();
            super.updateGears(1);
        }
        else if (newSpeed > 0 && newSpeed <= 10)
        {
            updateGears(1);
        }
        else if (newSpeed > 10 && newSpeed <= 20)
        {
            updateGears(2);
        }
        else if (newSpeed > 20 && newSpeed <= 30)
        {
            updateGears(3);
        }

        if (newSpeed > 0)
        {
            updateMove(newSpeed, getDirection());
        }
    }
}
