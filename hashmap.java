package com.company;
import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.util.HashMap;
import java.util.Map;


public class hashmap {


    HashMap<String, Integer> numbers = new HashMap<>(
            Map.of(
            "one",1,"two",2
    )
    );
    HashMap<String, String> cities = new HashMap<>(Map.of("England", "London", "France", "Paris", "Ghana", "Accra",
            "Ireland", "dublin", "South Korea", "Seoul"

    ));
    public void addHashMap()
    {
        numbers.put("three",3);
        numbers.get("two");
        numbers.remove("three");//.clear() removes the whole dictionary
        numbers.size();
        numbers.keySet();
        numbers.values();
        for(String i: numbers.keySet()){System.out.println(i);}
    }
    public void editCities(){
        cities.remove("Ghana");
        System.out.println(cities.size());
        String c = "";
        for(String i: cities.keySet()){
            c = c + i + ":" + cities.get(i) + " ";
        }
        System.out.println(c);


    }
}
