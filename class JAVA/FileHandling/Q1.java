import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

//! program for EMI
 public class Q1 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new  BufferedWriter(new FileWriter(new File("Q1.txt")));
        Scanner sc = new Scanner(System.in)
                System.out.println("\n\nEnter principle , rate per annum and number of payments");
        NumberFormat nf = new DecimalFormat("#####.##");
        double p = sc.nextDouble();
        double i = sc.nextDouble()/1200;
        int n = sc.nextInt();
        double payment;
        double Interest;
        double paymentTerm ;
        payment = i*p/(1-Math.pow(1+i, -n));

        bw.write("Principle       :$"  +p +"      Payment      :$" +nf.format(payment) + 
        "\nAnnual interest     :"+i*1200+"%"+"      Term     :" + n + " months\n\n\n\n\n");
        bw.write("SN          "+ "Interest           "+"PaymentTerm           " + "RemaningPrinciple     \n");
        int c=1;
        bw.write("------------------------------------------------------------------------------------------------------------------\n");
        
        
        while(c<=n) {
            
            Interest = p * i;
            paymentTerm = payment - Interest;
            p = p- paymentTerm;
            
            bw.write(c + "              "+ nf.format(Interest) +
             "            " + nf.format(paymentTerm) +"                "+nf.format(p)+"\n");
            c++;
        }

        bw.write("Final payment  "+"$"+nf.format(payment)+"\n");
        bw.write("------------------------------------------------------------------------------------------------------------------\n");
        System.out.println("Successfully written into the file Q1.txt");       
        sc.close();
        bw.close();

    }
    
}
