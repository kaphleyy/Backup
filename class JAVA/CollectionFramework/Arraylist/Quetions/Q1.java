package Quetions;

import java.util.ArrayList;

public class Q1 {
   public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<Integer>();

       int key = 25;
      for(int i=0 ; i<10 ; i++) {
          list.add(i+20);
      }

    //   int k = 0 ;
    //   boolean found = false;
    //   for(int num : list) {
    //       if(num == key) {
    //       System.out.println("The list contains " + key + " at position " + k);
    //       found = true;
    //       break;
    //       }
    //       k++;
    //   }
    //   if(!found) System.out.println("The " + key + " doesnt exist in the list");
   System.out.println(list.contains(key)); 
   } 
    
}
