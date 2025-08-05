package be.intecbrussel.les1;

public class SychronizeApp {
    public static void main(String[] args) {
        ExmpleSynchronize bankrekening = new ExmpleSynchronize();

        //Thread 1:
        Thread salaristoevoegen = new Thread(()->{
            try{
                Thread.sleep(1000);
                bankrekening.addAmountPerMonth(3500);
                System.out.println("Salaris toegevoegd.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

         // Thread 2:
        Thread rekenigenBetalen = new Thread(()->{
            bankrekening.payBills(1000);
            System.out.println("Rekeningen betaald.");
        });

        salaristoevoegen.start();
        rekenigenBetalen.start();

        try{
            salaristoevoegen.join();
            rekenigenBetalen.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Bankrekening Status: ");
        System.out.println("Totaal Geld: " + bankrekening.getMoneyOnBankAccount());
        System.out.println(" Genoeg Geld aanwezig? " + bankrekening.isEnoughOnBankAccount());
    }
}
