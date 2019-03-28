package com.Polymophism;

class Movie
{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String script()
    {
        return "Empty Script";
    }

    public String getName() {
        return name;
    }
}

class Avenger extends Movie
{
    public Avenger() {
        super("avenger");
    }

    @Override
    public String script() {
        return "super hero fight Thanos";
    }
}

class bvs extends Movie
{
    public bvs() {
        super("bvs");
    }

    @Override
    public String script() {
        return "batman fight with superman";
    }
}

class baywatch extends Movie
{
    public baywatch() {
        super("baywatch");
    }

//    @Override
//    public String script() {
//        return "the rock saves girls";
//    }
}

public class Main{
    public static void main(String[] args)
    {
        for (int i=1; i<5;i++)
        {
            Movie movie = randomMovie();
            System.out.println("Movie number #" +i + " is " + movie.getName() + "\n" +
                    "and the script is " + movie.script() +"\n");
        }
    }

    public static Movie randomMovie()
    {
        int randomNumber = (int) (Math.random() * 3 + 1);
        System.out.println("Random Number generated was: " + randomNumber);
        switch (randomNumber)
        {
            case 1:
                return new Avenger();
            case 2:
                return new bvs();
            case 3:
                return new baywatch();
        }
        return null;
    }
}