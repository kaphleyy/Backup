package Questions;

import java.util.LinkedList;

public class Q2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("is");
        list.addFirst("This");
        list.addLast("cool");

        int i=0;
        int j = list.size() -1;
        System.out.println(list);

        while(i<j) {
            String temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
        System.out.println(list);
    }
    
}
