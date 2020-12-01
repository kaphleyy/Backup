package RandomNumbers;

import java.util.Random;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args){
        Random r = new Random();
        int x = r.nextInt(10);
        Scanner sc = new Scanner(System.in);
        int c = 0;
        int sum = 0;
        for(int i=0 ; i<x ; i++) {
            int ip = sc.nextInt();
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
