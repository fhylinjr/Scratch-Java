package com.company;

public class calculator {
    public double add(double x, double y)
    {return x+y;}
    public double subtract(double x, double y)
    {return x-y;}
    public double multiply(double x, double y)
    {return x*y;}
    public void divide(double x, double y)
    {
     try{System.out.println(x/y);}
    catch(Exception e)
    {System.out.println("Incorrect operation.");}



}
}
