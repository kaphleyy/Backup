/**
 * IntToAnyBaseDemo
 */
public class IntToAnyBaseDemo {

    public static void main(String[] args) {
        int x =42;
      String bin =  Integer.toString(x,2); //! (int, radix)
      System.out.println(Integer.toString(x,8));
      System.out.println(Integer.toString(x,16));
        System.out.println(bin);
    }
}