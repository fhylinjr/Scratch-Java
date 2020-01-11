package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class arraylist {
    public void editcars() {
        ArrayList<String> cars = new ArrayList<>(Arrays.asList("Lambo","GWagon","Lotus"));//you can use List.of() in place of Arrays.asList()
        cars.add("BWW");cars.add("Mercedes");cars.add("Bugatti");
        cars.set(2, "Ferrari");
        System.out.println(cars);
    }
    public void integers(){
        float sum = 0.0f;
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5); numbers.add(45); numbers.add(35); numbers.add(98); numbers.add(23);
        for(int i: numbers){sum=sum + i;}
        System.out.println(sum);
    }

}
