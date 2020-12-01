package RandomNumbers;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Q4 {
   public static void main(String[] args) {
       int[] arrF = new int[120];
            double[] arrC = new double[120]; 
            NumberFormat nf = new DecimalFormat("######.##");
        for(int i=0 ; i<120 ; i++) {
            arrF[i] = i;
        }
        for(int i=0 ; i<120 ; i++) {
            arrC[i] = Double.parseDouble(nf.format(100*(arrF[i] -32)/180.0));
        }
        System.out.println("Fahrenheit        " + " celcius       ");
        for(int i=0; i<120; i++) {
            System.out.println(arrF[i] +"          " + arrC[i]);
        }
   } 

    
}
