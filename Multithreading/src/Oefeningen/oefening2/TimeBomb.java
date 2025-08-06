package Oefeningen.oefening2;

public class TimeBomb extends Thread {
    private int timer;
    private boolean disarmed = false;

    public TimeBomb(int timer) {
        this.timer = timer;
    }

    public int getTimer() {
        return timer;
    }

    public void setTimer(int timer) {
        this.timer = timer;
        this.disarmed = disarmed;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                if (disarmed) {
                    System.out.println("Bomb is disarmed");
                    return;
                }

                System.out.println("Timer bomb: " + i);
                Thread.sleep(1000);
            }
            System.out.println("Bomb!!! To late...you die");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void activate() {
        this.start();
    }

    public void disarm() {
        disarmed = true;
        System.out.println("disarmed");
    }
}
