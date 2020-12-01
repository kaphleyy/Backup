package randomQuestions;

import java.text.NumberFormat;

public class Q2 {
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMinimumIntegerDigits(3);
        nf.setMaximumFractionDigits(4);
        nf.setMinimumFractionDigits(2);

        double d = 34.353322;
        System.out.println(nf.format(d));
    }
    
}
