package Questions;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Scanner;


public class Q4 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     LinkedList<Integer> list = new LinkedList<Integer>();
     list.add(43);
     list.add(23);
     list.add(12);
     list.add(75);
     Collection<Integer> list2 = new LinkedList<>();
     list2.add(444);
     list2.add(555);
     list2.add(666);
     list2.add(777);


     int position = 2;
     int toAdd = 999;
System.out.println("What you want to input collection/single (c/s)");

char c = sc.next().charAt(0);
    switch (c) {
        case 'c':
            list.addAll(position, list2);
            break;
        case 's':
        list.add(position, toAdd); 
        default:
        System.out.println("oo , enter c or s");
            break;
    }
    System.out.println(list);

sc.close();
 }   
}
