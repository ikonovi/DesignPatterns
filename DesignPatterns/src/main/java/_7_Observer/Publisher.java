package _7_Observer;

import java.util.ArrayList;

public class Publisher implements IPublisher {

	private ArrayList<ISubscriber> subscribers = new ArrayList<>();

	@Override
	public ArrayList<ISubscriber> getSubscribers() {
		return subscribers;
	}

	@Override
	public void addSubscriber(ISubscriber subscriber) {
		subscribers.add(subscriber);
	}

	@Override
	public void removeSubscriber(ISubscriber subscriber) {
		subscribers.remove(subscriber);
	}

	@Override
	public void notifySubscribers(String message) {
		for (ISubscriber actionListener : subscribers) {
			actionListener.readMessage(message);
		}
	}

	public void publishMessage(String message) {
		System.out.println("Publisher printed message " + message);
		notifySubscribers(message); 				 // key point !!
	}

}
