import java.util.Scanner;

//? Q write a program to read a decimal no from user and convert it to hexadecimal no.
public class Q1Next {
public static void main(String[] args) {
    System.out.println("Enter the number to convert into hex");
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    System.out.println(Integer.toString(x, 16));
    sc.close();
}
    
}
