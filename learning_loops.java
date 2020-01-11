package com.company;

public class learning_loops {
   public void evenNumbers() {
       int v =1;
       while (v <= 9) {
           if (v % 2 == 0) {
               System.out.println("It is even " + v);
           }
           v++;
       }
   }
   public void range_values() {
       for (int i = 5; i <= 10; i++) {
           System.out.println(i);
       }
   }
   public void models(){
       String[]cars = {"BMW", "Toyota", "Benz"};
       for(String i : cars){System.out.println(i);
       }
   }
   public void age(int x){
       if(x < 18){System.out.println("Access denied. You must be above 18");}
       else if(x>=18){System.out.println("Access created");}
   }
}
