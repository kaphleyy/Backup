package Ass14;

public class logDemo {
    public static void main(String[] args) {
        double x = 89076.8;
        double y =0;

        System.out.println("Math.log("+x+")="+Math.log(x));
        System.out.println("Math.log("+y+")="+Math.log(y));

        //! 1)Taking log to base e : log(x)
        // !2)LOG to other bases


        //! log1(x) = log(x)/log(1) where log1 is logarithm to base n

        //! log 10000 on base 10

        double res = Math.log(10000)/Math.log(10);
        System.out.println(res);


    }
    
}
