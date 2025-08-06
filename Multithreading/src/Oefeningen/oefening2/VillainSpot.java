package Oefeningen.oefening2;

import java.util.Random;

public class VillainSpot {
    public static void main(String[] args) {
        Random random = new Random();
        TimeBomb timerBomb = new TimeBomb(10); // Bomb has 10 sec!
        timerBomb.activate();

        try{
            Thread.sleep(random.nextInt(30000)); // It will take us between 0-30 secs to disarm the bomb.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        timerBomb.disarm();
    }
}
