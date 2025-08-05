package be.intecbrussel.les1;

public class ThreadApp2 {
    public static void main(String[] args) throws InterruptedException{
        myThread2 myThread1 = new myThread2();
        MyRunnable runnable = new MyRunnable();
        Thread myThread2 = new Thread(runnable);

        myThread1.start();
        myThread2.start();
    }
}
