package RandomNumbers;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;

public class Q2 {
   public static void main(String[] args) {
        Random r = new Random();
        int x = r.nextInt(5);
        Scanner sc = new Scanner(System.in);
        int c = 0;
        NumberFormat nf  = new DecimalFormat("########.##");
        float sum = 0;
        
        for(int i=0 ; i<x ; i++) {
            float ip = sc.nextFloat();
            ip = Float.parseFloat(nf.format(ip));
            sum +=ip;
            c++;
        }
        if(c<2) {
            System.out.println("Must contain at least 2 numbers , Error");
        }
        else {
            System.out.println("Sum is " + sum);
        }
        sc.close();
   } 
    
}
