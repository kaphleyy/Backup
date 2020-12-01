package Ass13;

public class isAlive implements Runnable {
    static String pawn= "aka";
    public static void main(String[] args) {
        isAlive obj = new isAlive();

        Thread thread = new Thread(obj);
        thread.start();

        while(thread.isAlive()) {
            System.out.print("Waiting.");
            System.out.print(".");
            System.out.print(".");
            System.out.print(".");
            System.out.println();
        }
        System.out.println(pawn);
        pawn = pawn + " also check if the thread has updated the value";
        System.out.println(pawn);
    }
    public void run() {
        pawn = "This part is added by the thread";
        
    }
    
}
