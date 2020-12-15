package Quetions;

import java.util.ArrayList;
// import java.util.Collections;

public class Q5 {
    public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<Integer>();

         for(int i=0 ; i<5 ; i++) {
          list.add(i+20);
      }
      System.out.println(list);
    //! shortcut   Collections.reverse(list);

       int i=0;
       int j =list.size() -1;

       while(i<j) {
           int temp = list.get(i);
           list.set(i, list.get(j));
           list.set(j, temp);
           i++; j--;
       }

       System.out.println(list);
 
    }
    
}
