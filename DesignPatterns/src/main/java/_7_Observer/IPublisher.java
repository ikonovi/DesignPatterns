package _7_Observer;

import java.util.ArrayList;

public interface IPublisher {

	ArrayList<ISubscriber> getSubscribers();

	void addSubscriber(ISubscriber listener);

	void removeSubscriber(ISubscriber listener);

	void notifySubscribers(String message);

}
