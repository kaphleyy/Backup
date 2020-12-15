import java.util.ArrayList;
import java.util.Scanner;

public class hashFunc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list =new ArrayList<>(30);
        for(int i=0 ; i<30 ; i++) {
            list.add(-1);
        }
        while(true) {
            System.out.println("Enter a number to enter to the list (-1111) to exit");
        
            int data = sc.nextInt();

            if(data == -1111){
                System.out.println(list);
                sc.close();
                 System.exit(0);
            }
                if (list.get(f(data)) != -1) {
                System.out.println("Collision Occured");
                sc.close();
                System.exit(0);
            }  
            list.set(f(data), data);
            System.out.println(list);
            }
        }
        
    static int f(int x) {
        return x % 30;
    }
}