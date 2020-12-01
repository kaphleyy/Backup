/**
 * JavaThreads
 */

// ! multiThreading using extends Thread
// public class JavaThreads extends Thread {

//     public   void run() {
//         for(int i = 0 ; i<20 ; i++) {
//             System.out.println("Thread1 : " + i);
//         }

//     }
//     public static void main(String[] args) {
//         JavaThreads thread1 = new JavaThreads();
//         thread1.start();
        
//     for (int i = 20 ; i< 40 ; i++) {
//          System.out.println("MainThread : " + i);
//     }

//     }
// }


//! MultiThreading using Runnable interface 

/**
 * JavaThreads
 */
public class JavaThreads implements Runnable{

    public static void main(String[] args) {
        JavaThreads obj = new JavaThreads();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("This is outside the thread");
    }
    public void run() {
        System.out.println("This is in the thread 1");
    }
}