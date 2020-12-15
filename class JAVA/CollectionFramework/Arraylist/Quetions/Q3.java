package Quetions;

import java.util.ArrayList;

public class Q3 {
   public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<Integer>();
       
          for(int i=0 ; i<10 ; i++) {
          list.add(i+20);
      }
      list.clear();

      list.forEach(s -> System.out.println(s));
       
   } 
    
}
