package com.company;

public class learning_methods {
    private String name;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    private int number = 1234567;
    private float balance = 500000.00f;
    public float getBalance(){
        return balance;
    }
    public void checkBalance(int number){
        if(number == this.number){
         System.out.println(getBalance());}
        else
        {System.out.println("Enter correct account number");}

    }






}
