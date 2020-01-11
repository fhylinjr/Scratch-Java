package com.company;
import java.util.Arrays;

public class learning_array {
    public void automobiles() {
        String[] cars = {"BMW", "Chevrolet", "Benz", "Royce"};
        int[] num = {10, 20, 30, 40};
        for (int i = 0; i <= cars.length - 1; i++) {
            System.out.println(cars[i]);
        }
        int[][]nums = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i <= nums.length - 1; i++)
        {for (int si = 0; si <= nums[i].length - 1; si++){
            System.out.println(nums[i][si]);
        }}
        int n=0;
        int m=5;
        try{System.out.println(m/n);}
        catch(Exception e)
        {
            System.out.println("Incorrect operation");
        }

    }
    public void average() {
        int[] scores = {25, 30, 5, 150, 30};
        int total = 0;
        for (int i : scores) {
            total = total + i;
        }
        float mean = total / scores.length;
        System.out.println(mean);

        int minimum = 100, maximum = 0;
        for (int j : scores) {
            if (j < minimum) {
                minimum = j;
            }
            {
                if (j > maximum) {
                    maximum = j;
                }
            }
        }
        System.out.println(minimum);
        System.out.println(maximum);
        for(int d: scores) {
            for (int n : scores) {if(d == n){System.out.println("There is a duplicate " + d); return;}

            else;
            System.out.println("No duplicate");}
        }}

    public void exists(){
        String[] car = {"Bentley", "Aston Martin", "Bugatti", "Tesla"};
        Arrays.sort(car);
        for(String i: car){
            System.out.println(i);
            if (i == "Tesla"){System.out.println(true); return;}
            else;
            {System.out.println(false);}
        }

    }
    public void dance()
    {System.out.println("I am dancing.");}
    private void eat()
    {System.out.println("I am eating.");}
}
