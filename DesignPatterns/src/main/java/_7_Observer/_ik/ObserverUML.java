package _7_Observer._ik;

import java.util.LinkedList;
import java.util.List;

public class ObserverUML {

	public static void main(String[] args) {
		
		Observable observable = new ConcreteObservable();
		
		Observer observer1 = new ConcreteObserver1(); 
		Observer observer2 = new ConcreteObserver2();
		
		observable.addObserver(observer1);
		observable.addObserver(observer2);
		
		observable.notifyObservers();

	}

}


interface Observer {

	public void handleNotification();

}


interface Observable {

	void addObserver(Observer o);
	
	void removeObserver(Observer o);
	
	void notifyObservers();
	
}


class ConcreteObservable implements Observable {

	List<Observer> observers;
	
	public ConcreteObservable() {
		observers = new LinkedList<>();
	}
	
	@Override
	public void addObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for (Observer o : observers) {
			o.handleNotification();
		}	

	}
}


class ConcreteObserver1 implements Observer {
	
	@Override
	public void handleNotification() {
		System.out.println("Event handled by " + this.getClass().getSimpleName());
	}	
}


class ConcreteObserver2 implements Observer {

	@Override
	public void handleNotification() {
		System.out.println("Event handled by " + this.getClass().getSimpleName());
	}

}
