package randomQuestions;

import java.text.NumberFormat;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getInstance();
        
        int maxFrac = sc.nextInt();
        int minFrac = sc.nextInt();
        int integer = sc.nextInt();

        nf.setMaximumFractionDigits(maxFrac);
        nf.setMinimumFractionDigits(minFrac);

        System.out.println(nf.format(integer));
        sc.close();
}
}