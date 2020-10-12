
import java.util.Scanner;

class Bank {
    String name;
    int acNo;
    int balance = 1000;

    public Bank() {
    };

    public Bank(String name, int acNo, int balance) {
        this.name = name;
        this.acNo = acNo;
        if (balance < 1000) {
            this.balance = 1000;
        } else
            this.balance = balance;

    }

    void deposit(int money) {
        balance += money;
    }

    void withdraw(int money) {
        if (balance - money < 1000) {
            System.out.println("You cant withdraw");
        } else {
            balance -= money;
        }
    }

    void display() {
        System.out.println("Name : " + name + " account NO: " + acNo + " balance : " + balance);
        System.out.println();
    }
}

public class BankApp {
    public static void main(String[] args) {

        BankArr bankArr = new BankArr();
        bankArr.insert("first", 1, 2000);
        bankArr.insert("second", 2, 3000);
        bankArr.insert("third", 3, 8000);
        bankArr.insert("fourth", 4, 8000);
        bankArr.insert("fifth", 5, 2000);
        System.out.println(bankArr.n);
        bankArr.display();
        bankArr.display(2);
        bankArr.operate();

    }
}

class BankArr {
    int n;
    Bank[] Bar;

    BankArr() {
        n = 0;
        Bar = new Bank[100];
    }

    void insert(String name, int acNo, int balance) {
        Bank b = new Bank(name, acNo, balance);
        Bar[n] = b;
        n++;
    }

    int search(int AccNo) {
        for (int i = 0; i < n; i++) {
            if (Bar[i].acNo == AccNo) {
                return i;
            }
        }
        return -1;
    }

    void display() {
        for (int i = 0; i < n; i++) {
            System.out.println("Name: " + Bar[i].name + ", AccNo: " + Bar[i].acNo + ", balance:  " + Bar[i].balance);
        }
        System.out.println();
    }

    void display(int acc) {
        for (int i = 0; i < n; i++) {
            if (Bar[i].acNo == acc) {
                System.out
                        .println("Name: " + Bar[i].name + ", AccNo: " + Bar[i].acNo + ", balance:  " + Bar[i].balance);
                System.out.println();

                return;
            }

        }
    }

    void operate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Bank Account no: ");
        int bNO = sc.nextInt();
        int flag = search(bNO);
        if (flag != -1) {
            boolean isRunning = true;

            while (isRunning) {
                System.out.println("1.Deposit   2.Withdraw   3.Display   4.Exit");
                int decision = sc.nextInt();
                switch (decision) {
                    case 1:
                        System.out.println("Enter the amount to deposit");
                        int money = sc.nextInt();
                        get(flag).deposit(money);
                        break;
                    case 2:
                        System.out.println("Enter the amount to withdraw");
                        int money2 = sc.nextInt();
                        get(flag).withdraw(money2);
                        break;
                    case 3:
                        get(flag).display();
                        break;
                    case 4:
                        System.out.println("Good Bye");
                        isRunning = false;
                        break;

                    default:
                        System.out.println("Enter either 1,2,3,4");
                        break;
                }
            }
            sc.close();
        }
    }

    Bank get(int i) {

        return Bar[i];
    }

}
