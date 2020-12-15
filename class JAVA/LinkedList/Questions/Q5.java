package Questions;

import java.util.LinkedList;

public class Q5 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        
        for(int i =20 ; i<2000 ; i*=2) list.add(i);

        System.out.println(list);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);

        
    }
    
}
