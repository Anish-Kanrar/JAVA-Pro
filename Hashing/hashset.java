package Hashing;
import java.util.HashSet;
import java.util.Iterator;

public class hashset {
    public static void main(String[] args) {
        //Creating
        HashSet<Integer> set = new HashSet<>();
        //ArrayList<Integer> list=New ArrayList<>();

        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1); //set.add(el)

        //Size
        System.out.println("size of set is : "+set.size()); //3

        //Print all elements
        System.out.println(set);  //[1, 2, 3]

        //Iterator - HashSet does not have an order
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+ " ");
        }
        System.out.println();
        /*
        output->
        1
        2
        3
         */

        //Search-contains
        if(set.contains(1)){
            System.out.println("set contains 1");
        }
        if(!set.contains(6)){
            System.out.println("does not contain");
        }

        //Delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("does not contain 1 - we delete 1");
        }

        //isEmpty
        if(!set.isEmpty()){
            System.out.println("set is not empty");
        }
    }
}
