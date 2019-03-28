package com.composition.house;

public class main {
    public static void main(String[] args)
    {
        size size = new size(14,21);
        tv tv = new tv("Sony", "black", size);
        info info = new info(15, "white");
        curtain curtain = new curtain("hanvico", info);
        livingRoom lr = new livingRoom(tv, curtain);

        lr.infoOfTV("aaa", "vvv");

    }
}
