package com.composition.house;

public class livingRoom
{
    private tv tv;
    private curtain curtain;

    public livingRoom(com.composition.house.tv tv, com.composition.house.curtain curtain) {
        this.tv = tv;
        this.curtain = curtain;
    }

    public void infoOfTV(String n, String c)
    {
        tv.tvInfo(n,c);
    }

    public void brandOfCurtain(String b)
    {
        curtain.brandName(b);
    }
}
