package be.intecbrussel.les1;

public class MyThread extends  Thread{

    private  String sign;
    private Integer number;

    public MyThread(String sign, Integer number) {
        this.sign = sign;
        this.number = number;
    }

    public MyThread(String sign) {
        this.sign = sign;
    }

    public MyThread() {}

    @Override
    public void run() {
        for( int i = 0; i < 10 ; i++){
            System.out.println(sign + " " + number);
        }
    }
}
