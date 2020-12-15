
package Quetions;

import java.util.ArrayList;

public class Q2 {
   public static void main(String[] args) {
       ArrayList<Double> list = new ArrayList<Double>();

          for(int i=0 ; i<10 ; i++) {
          list.add(i+20.344);
      }

      list.remove(5);
      list.forEach(s -> System.out.println(s));
   } 
    
}
