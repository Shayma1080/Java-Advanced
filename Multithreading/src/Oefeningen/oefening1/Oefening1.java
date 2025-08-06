package Oefeningen.oefening1;

import java.time.LocalDateTime;

public class Oefening1 extends Thread{


    @Override
    public void run() {
        for(int i =1; i<11;i++){
            System.out.println("now: " +LocalDateTime.now() + " sec: " + i);

            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("10 sec is afgelopen...");

    }

    public static void main(String[] args) {
        Oefening1 oefening1 = new Oefening1();

        System.out.println(oefening1.getState());

        oefening1.start();

        System.out.println(oefening1.getState());
    }
}
