package be.intecbrussel.les1;

public class MultiThreadingDemo implements  Runnable{
    @Override
    public void run() {
        try{
            // Displaying the thread that is running
            System.out.println("Thread " + Thread.currentThread().getId() + " is running.");

        } catch (Exception e) {
            System.out.println("Exeption is caught.");
        }
    }
}
