import java.util.ArrayList;
import java.util.Collections;


public class arrayList {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();



        //add
         list.add(0); 
         list.add(2 ); 
         list.add(3); 
         System.out.println(list);



         
         //get operations means getting  the elements from array on index 
         int elements =list.get(0);
         System.out.println(elements);


         //add elements in between
         list.add(3,4);// index and elements
         System.out.println(list);



         //set elements 
         list.set(0,5); //replace
         System.out.println(list);



         //delete 
         list.remove(3);
         System.out.println(list);


         //size 
         int size = list.size();
         System.out.println(size);


         //sorting array using util package in  java
         Collections.sort(list);
         System.out.println(list);

    }
    
}