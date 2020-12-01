package Ass14;
import java.math.BigInteger;

public class Bigint {
    public static void main(String[] args) {
        BigInteger i = new BigInteger("-532523324343243232432432434324343");
        BigInteger i2 = new BigInteger("43435887687868769797935345346456456");
        BigInteger i3 = new BigInteger("-532523324343243232432432434324343");

        BigInteger sum = i.add(i2);
    BigInteger diff= i2.subtract(i);
    BigInteger product = i.multiply(i2);
    BigInteger abs = i.abs();
    BigInteger pow = i.pow(4);
    BigInteger quotient  = i.divide(i2);
    BigInteger negate = i.negate();
    int compareTo = i.compareTo(i2);
    boolean equals = i.equals(i3);
    float floatvalue = i.floatValue();
    int intValue = i.intValue();

    System.out.println("\n\nThe Game begins");
    System.out.println("i ==> "+ i);
    System.out.println("i2 ==> "+ i2);
    System.out.println("i3 ==> "+ i3+"\n\n");


    System.out.println("Sum: "+sum);
    System.out.println("Diff: " +diff);
    System.out.println("Product: " +product);
    System.out.println("Abs: " +abs);
    System.out.println("pow: " +pow);
    System.out.println("quotient: " +quotient);
    System.out.println("negate: " +negate);
    System.out.println("compareTo:" +compareTo);
    System.out.println("equals: " +equals);
    System.out.println("floatValue: " +floatvalue);
    System.out.println("intValue: "+ intValue);
    // System.out.println(i.divide(new BigInteger("0")));

    }
    
}
