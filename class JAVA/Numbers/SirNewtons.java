import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
//!needs debugging
public class SirNewtons {
    public static void main(String[] args) {

        int n,c;
        System.out.println("Enter the number and root");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        c = sc.nextInt();

        double xi = c/2;
        double xii =0;

        double err = 1;
        while(err>Math.pow(10,-6)){
            err = Math.abs(xii-xi);

            xii = xi - f(c,n,xi)/f_d(n,xi);
            System.out.println(xii);
            xi = xii;
        }
        NumberFormat nf = new DecimalFormat("###.######");
        System.out.println("The root is :" + nf.format(xii));
        sc.close();
    }
    public static double f(double c, int n, double x) {
        return Math.pow(x,n)-c;  
    }

    public static double f_d(int n , double x) {
        return n * Math.pow(x,n-1);
    }
}

