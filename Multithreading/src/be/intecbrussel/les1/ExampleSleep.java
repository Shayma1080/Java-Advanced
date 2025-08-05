package be.intecbrussel.les1;

public class ExampleSleep {
    public static void main(String[] args) throws InterruptedException{

        try{
            Thread thread1 = new Thread(new MyThread("@",10));
            Thread thread2 = new Thread(new MyThread("-",100));

            thread1.start();
            thread2.start();

            Thread.sleep(2000);
            thread1.interrupt();
            Thread.sleep(500);
            thread1.interrupt();
            Thread.sleep(500);
            thread1.interrupt();

        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}
