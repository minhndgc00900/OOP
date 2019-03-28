package com.oop_challenge;

public class healthyBurger extends hamburger
{
    private String healthyExtraName;
    private double healthyExtraPrice;

    private String healthyExtraName2;
    private double HealthyExtraPrice2;

    public healthyBurger(String meat, double price) {
        super("healthy burger", "brown", meat, price);
    }

    public void addHealthAddition1(String exname1, double exprice1)
    {
        this.healthyExtraName = exname1;
        this.healthyExtraPrice = exprice1;
    }

    public void addHealthAddition2(String exname2, double exprice2)
    {
        this.healthyExtraName2 = exname2;
        this.HealthyExtraPrice2 = exprice2;
    }

    @Override
    public double itemizeBurger() {

        double addingBurger = super.itemizeBurger();
        if (healthyExtraName != null)
        {
            System.out.println("add more " + this.healthyExtraName + " with $" + this.healthyExtraPrice);
            addingBurger = addingBurger + this.healthyExtraPrice;
        }
        if (healthyExtraName2 != null)
        {
            System.out.println("add more " + this.healthyExtraName2 + " with $" + this.HealthyExtraPrice2);
            addingBurger += this.HealthyExtraPrice2;
        }
        return addingBurger;
    }


}
