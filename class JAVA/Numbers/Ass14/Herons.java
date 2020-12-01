package Ass14;

public class Herons {
    public static void main(String[] args) {

        try {
        double a = -2;
        double b = 3.4f;
        double c = 3.4;

        if(a<0 || b<0 || c<0) throw new Exception("a,b,c must be positive");

         else if(Double.isNaN(a) || Double.isNaN(b) || Double.isNaN(c)) throw new Exception("Not a number");

        else if(Double.POSITIVE_INFINITY == a || Double.POSITIVE_INFINITY == b|| Double.POSITIVE_INFINITY == c)
        throw new Exception("cant take +ve inf");

        else if(Double.NEGATIVE_INFINITY == a || Double.NEGATIVE_INFINITY == b|| Double.NEGATIVE_INFINITY == c)
        throw new Exception("cant take -ve inf");

        else {
            double s = (a+b+c)/2.0;
            double Area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("Area is : " + Area);
        }
        }

        
        catch(Exception e) {
            System.out.println("check this out " + e);
        }

    }
    
}
