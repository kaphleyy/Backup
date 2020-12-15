import java.util.LinkedList;

/**
 * intro
 */
public class intro {

    public static void main(String[] args) {
        
        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int i=1 ; i<20 ; i++) list.add(i);

        list.addFirst(111);
        list.addLast(999);
        System.out.println(list.contains(999));
        System.out.println(list.element());
        System.out.println(list.indexOf(6));
        list.offer(382839);
        System.out.println(list.getLast());
        System.out.println(list.peek());
        System.out.println(list.poll());
        System.out.println(list.element());
        System.out.println(list);
        System.out.println(list.pop());
        System.out.println(list);

        
    }
}