package Ass14;

import java.util.BitSet;


public class Bitset {
    public static void main(String[] args) {
        String weeks[] = {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY"};
        BitSet b = new BitSet();
        b.set(1);
        b.set(3);

        for(int i=0 ; i<weeks.length ; i++) {
            if(b.get(i)) System.out.println(weeks[i]);
        }
    }
    
}
