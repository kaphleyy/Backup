package randomQuestions;

import java.text.NumberFormat;

public class Q1 {
    public static void main(String[] args) {
        double a = 123453.42378;
        NumberFormat nf  = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(4);
        nf.setMinimumFractionDigits(2);
        System.out.println(nf.format(a));
    }
    
}
