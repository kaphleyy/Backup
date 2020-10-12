import java.util.Scanner;

public class FactApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find factorial");
        int n = sc.nextInt();
        Fact fact = new Fact(n);
        fact.factorial();
        sc.close();
    }
}

class Fact {
    int N;

    Fact(int N) {
        this.N = N;
    }

    void factorial() {
        int fact = N;
        for (int i = N - 1; i >= 1; i--) {
            fact *= i;
        }
        System.out.println("The factorial is : " + fact);

    }

}
