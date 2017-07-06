package _7_Observer;

public class Subscriber2 implements ISubscriber{

    @Override
    public void readMessage(String message) {
    	System.out.println(this.getClass().getSimpleName() + " read " + message);
    }

}
