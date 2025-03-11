package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //ArrayList<String> list = new ArrayList<>();
        //ArrayList<boolean> list = new ArrayList<boolean>();

        //add elements
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list); //[0, 2, 3]

        //get element
        int element = list.get(1);
        System.out.println(element);  //2

        //add element in between
        list.add(1, 1);
        System.out.println(list); //[0, 1, 2, 3]

        //set element
        list.set(0, 5);
        System.out.println(list); //[5, 1, 2, 3]

        //delete element
        list.remove(3);
        System.out.println(list); //[5, 1, 2]

        //size
        int size = list.size();
        System.out.println(size); //3

        //loop
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " "); //5 1 2
        }
        System.out.println();

        //sorting
        Collections.sort(list);
        System.out.println(list);
    }//[1, 2, 5]
}
