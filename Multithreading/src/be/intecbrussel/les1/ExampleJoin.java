package be.intecbrussel.les1;

public class ExampleJoin {
    public static void main(String[] args) {
        try{
            Thread studeren = new Thread(new MyThread("Java"));
            Thread gamen = new Thread(new MyThread("Mario"));
            Thread eten = new Thread(new MyThread("Pasta"));

            // je begint met studeren
            studeren.start();
            //System.out.println(studeren.getState()); // mag ook zo geschreven worden

            // je beslist na 1000 ms om tijdens het studeren te gamen
            studeren.join(1000);

            // Gamen start dus pas na die 100 ms
            gamen.start();
            //System.out.println(gamen.getState());

            // Je specificieert geen tijd!
            studeren.join();
            //System.out.println(studeren.getState());

            // Pas als je klaar bent met studeren en gamen ga je eten
            eten.start();
            //System.out.println(eten.getState());
            System.out.println(eten.isDaemon());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
