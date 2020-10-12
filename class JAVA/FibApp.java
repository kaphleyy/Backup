public class FibApp {
    public static void main(String[] args) {
        Fib fb = new Fib(10);
        fb.displaySeries();
    }

}

class Fib {
    int n;

    Fib(int n) {
        this.n = n;
    }

    void displaySeries() {
        int b = 0, a = 0;
        int c = 1;
        System.out.print("The series is : \n 0 ");
        for (int i = 1; i < n; i++) {
            System.out.print(c + " ");
            a = b;
            b = c;
            c = a + b;
        }

    }
}
