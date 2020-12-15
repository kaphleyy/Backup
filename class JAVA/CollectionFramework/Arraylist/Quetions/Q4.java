package Quetions;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Q4
 */
public class Q4 {

    public static void main(String[] args) {
          ArrayList<Integer> list = new ArrayList<Integer>();
       
          for(int i=0 ; i<10 ; i++) {
          list.add(i+20);
      }
       Integer arr[] = new Integer[list.size()]; 
        arr = list.toArray(arr); 
  
        System.out.println("Elements of ArrayList"
                           + " as Array: "
                           + Arrays.toString(arr)); 

    }
}