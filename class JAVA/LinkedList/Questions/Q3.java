package Questions;

import java.util.ArrayList;
import java.util.LinkedList;

public class Q3 {
    public static void main(String[] args) {
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("This"); list2.add("is"); list2.add("arraylist");
        LinkedList<String> list = new LinkedList<String>();
        list.add("This");
        list.add("is");
        list.add("LinkedList");
    
        list.addAll(list2);

        System.out.println(list);
    }
    
}
