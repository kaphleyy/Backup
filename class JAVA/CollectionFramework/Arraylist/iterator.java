import java.util.ArrayList;
import java.util.Iterator;

/**
 * clone
 */
public class iterator {

    public static void main(String[] args) {
        ArrayList<Integer> lis = new ArrayList<>();

        lis.add(43);
       lis.add(43);
       lis.add(43);
       lis.add(43);
       lis.add(43) ;

       Iterator<Integer> iter = lis.iterator();
       while(iter.hasNext()) {
           int s = iter.next();
        System.out.println(s);
       }

    }
}