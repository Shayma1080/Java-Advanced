package be.intecbrussel.les1;

public class MuziekThreadvb {
    public static void main(String[] args) {
        Thread muziekThread = new Thread(() -> {
            // Thread die muziek afspeelt (achetergrondproces)
            try {
                while (true) {
                    System.out.println("Muziek speelt...");
                    Thread.sleep(1000); // Wacht 1 seconde
                }
            } catch (InterruptedException e) {
                System.out.println("MuziekThread is onderbroken");
            }
        });

        // stel deze thread in als daemen (achtergrond)
        muziekThread.setDaemon(true);

        // nu kunnen we thread starten
        muziekThread.start();

        // Hoofdthread (de winkel zelf)
        System.out.println(" winkel is open...");

        try {
            Thread.sleep(5000); // Winkel blijft 5 sec open
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(" Winknel sluit...");
        // Zondra de hoofdthread klaar is, stopt de daemen thread automatisch

    }
}
