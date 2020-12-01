package Ass14;

import java.text.NumberFormat;

public class FormattingNumber {
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getInstance();

        nf.setMaximumFractionDigits(2);
        double d = 123.3422;

        System.out.println(nf.format(d));
    }
    
}
