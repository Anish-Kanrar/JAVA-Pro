package Hashing;
//import java.util.HashMap;
import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        //country(key), population(value)
        HashMap<String, Integer> map=new HashMap<>();

        //Insertion
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);
        System.out.println(map); //{China=150, US=30, India=120}

        map.put("China", 190);
        System.out.println(map);  //{China=190, US=30, India=120}

        //Searching
        if(map.containsKey("India")){
            System.out.println("Key is present in the map");
        }
        else{
            System.out.println("Key is not present in the map");
        }

        //get function
        System.out.println(map.get("China")); //190
        System.out.println(map.get("Japan"));  //null

        int[] arr={11,22,33};
        //for loop
        for(int i=0;i<3;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        //for-each loop
        for(int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();

        //Iteration (1)
        for(Map.Entry<String, Integer> e:map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        //Iteration (2)
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key+" "+map.get(key));
        }

        //Removing
        map.remove("China");
        System.out.println(map);
    }
}
