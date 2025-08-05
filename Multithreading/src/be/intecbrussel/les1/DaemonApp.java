package be.intecbrussel.les1;

public class DaemonApp {
    public static void main(String[] args) {
        int n = 10; // Number of threads

        for(int i =0; i< n;i++){
            Thread object = new Thread(new MultiThreadingDemo());
            object.start();
        }
    }
}
