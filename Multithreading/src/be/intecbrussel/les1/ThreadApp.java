package be.intecbrussel.les1;

public class ThreadApp {
    public static void main(String[] args) {
        MyThread myThread = new MyThread("*");
        MyThread myThread1 = new MyThread("-");

        System.out.println(myThread.getState()); // status NEW

        myThread.start();
        myThread1.start();

        System.out.println(myThread.getState()); // status RUNNABLE
    }
}
