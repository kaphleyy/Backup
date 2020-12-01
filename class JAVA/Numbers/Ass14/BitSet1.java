package Ass14;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.LinkedList;

public class BitSet1 {
    public static void main(String[] args) {
        String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(11);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);

        list2.add(3);
        list2.add(5);
        list2.add(7);
        list2.add(9);
        list2.add(11);
        list2.add(3);
        list2.add(3);
        list2.add(3);
        list2.add(3);
        list2.add(3);
        list2.add(3);
        list2.add(3);

        BitSet b= new BitSet();
            b.set(0);
            b.set(3);
            b.set(9);

        for (int i =0 ; i<months.length ; i++) {
            if(b.get(i)) {
            // System.out.println(months[i]);
            System.out.println(list2.get(i));
        }
    }}
    
}
