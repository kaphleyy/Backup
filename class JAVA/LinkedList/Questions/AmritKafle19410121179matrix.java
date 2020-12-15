// Name : Amrit kafle 
// Regd : 19410121179


import java.util.LinkedList;
import java.util.List;

/**
 * 2DMa
 */
public class matrix {

    public static void main(String[] args) {
        List<List<Integer>> list = new LinkedList<>();

        for(int i=0 ; i<3 ; i++) list.add(new LinkedList<>());
        for(int i=0 ; i<3 ; i++) {
              for(int j =0 ; j<3 ; j++) {
                  list.get(i).add((int)(Math.random()*10));
              }
    }
    System.out.println(list);
    list.get(2).set(1,88);
    System.out.println(list);
    

}
}