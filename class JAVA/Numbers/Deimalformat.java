import java.text.DecimalFormat;
import java.text.NumberFormat;

//!Q1,2,3,4,5
public class Deimalformat {
    public static void main(String[] args) {

String[] arr = {"0000.#####","-#.###","%###.#####","##,##.##","Rs'.'###.###"};
double[]  test = {345.574, 3.454, 0.6756, 23435324.546, 550.45};

for(int i=0; i<=4 ; i++) {

    NumberFormat n = new DecimalFormat(arr[i]);
    System.out.println(n.format(test[i]));
}
    }
    
}
