package Questions;

import java.util.Comparator;
import java.util.TreeSet;

public class Q3 {
    public static void main(String[] args) {
        TreeSet<String> h = new TreeSet(new Comparator2());
        System.out.println(h.comparator());

        })
    }
    
}

class comparator2 implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
    
}