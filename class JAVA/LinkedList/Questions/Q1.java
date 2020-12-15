package Questions;

import java.util.LinkedList;

public class Q1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int i=5 ; i<500 ; i*=2) list.add(i);
        int key = 20;

        if(list.contains(key)) System.out.println("The position of " + key +" is " + list.indexOf(key));
        else System.out.println("The element doesnot exist in the list");
        

    }
    
}
