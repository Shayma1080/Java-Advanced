package be.intecbrussel.les1;


public class LambdaDaemonApp {
    public static void main(String[] args) {
        Thread thread1 = new Thread(()-> print(ThreadColors.ANSI_BLUE + "1",100));
        Thread thread2 = new Thread(() -> print (ThreadColors.ANSI_GREEN + "2", 100));

        // in dit geval kan de uitvoering van thread2 eindigen wanneer de mainmethod is voltooid
        thread2.setDaemon(true);
        thread1.start();
        thread2.start();

        //Aantal beschikbaar cores (CPU : capaciteit van pc) op te vragen
        System.out.println(Runtime.getRuntime().availableProcessors());
    }

    private static void print(String text, int count){
        for(int j = 0; j< count; j++){
            System.out.print(text);

            // De lus binnen de print methode roept bij elke stap Thread.yield() aan, waardoor de processortijd
            // beschikbaar wordt gemaakt voor doorgeven aan andere threads.
            Thread.yield();
        }
    }
}
