import java.text.ChoiceFormat;

import java.util.Scanner;
public class ChoiceFormats {
    //2 constructors 1. two arrays input 2. string pattern input
    //!toPattern() returns the pattern in second constructor form 
    //!applyPattern() reassign pattern by overriding the previous pattern
    public static void main(String[] args) {
        // double[] limit = {0,1,2};         //limit (x,y,z) : <=x , y , >=z
        // String[] plurals = {"books","book","books"};
        // ChoiceFormat cf= new ChoiceFormat(limit,plurals);
        // int[] data = {-2,-1,0,1,2,3,9};
        //         System.out.println(cf.toPattern());

        // for(int i : data) {
        //     System.out.println("I am reading "+ i+ " " + cf.format(i));
        // }
        Scanner sc = new Scanner(System.in);
        ChoiceFormat cf2 = new ChoiceFormat("-1#negative mangoes|0#no mangoes|1#one mango|2#two mangoes|2<many mangoes");
        while (true) {
            System.out.println("Enter number (999 to exit)");
            int n = sc.nextInt();
            if(n==999)
            break;
            System.out.println("Found " + cf2.format(n));
        }
        System.out.println("Found " + cf2.format(Double.NEGATIVE_INFINITY));

        sc.close();

    }

    
    
}
