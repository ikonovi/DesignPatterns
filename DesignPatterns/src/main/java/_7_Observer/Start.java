package _7_Observer;

public class Start {

	public static void main(String[] args) {
		
		Publisher publisher = new Publisher();
		
		Subscriber1 subscriber1 = new Subscriber1();
		Subscriber2 subscriber2 = new Subscriber2();		

		publisher.addSubscriber(subscriber1);
		publisher.addSubscriber(subscriber2);

		publisher.publishMessage("\"My Message\"");
	}
}
