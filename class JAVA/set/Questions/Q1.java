package Questions;
import java.util.HashSet;

public class Q1 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i =0 ; i<10 ; i++) set.add(i);

        HashSet<Integer> arrToHs = new HashSet<Integer>();
        int[] arr = {12,54,32,64,2,12,45,45,43,43};


        // int[] arr = new int[set.size()];
        Integer[] hsToArr = new Integer[set.size()];
          hsToArr = set.toArray(hsToArr);

     for(int c : arr) arrToHs.add(c);

     System.out.println(arrToHs);

     System.out.print("[");
     for(int c: hsToArr) System.out.print( " " + c +",");
     System.out.print("]");

    }
}
