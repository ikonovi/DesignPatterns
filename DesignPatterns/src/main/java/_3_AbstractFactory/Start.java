package _3_AbstractFactory;

import _3_AbstractFactory.factory.impl.RussianFactory;
import _3_AbstractFactory.factory.impl.USAFactory;
import _3_AbstractFactory.factory.interfaces.TransportFactory;

public class Start {
	
	private static TransportFactory factory;

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		if (true) {
			factory = new RussianFactory();
		} else {
			factory = new USAFactory();
		}

		factory.createAircraft();
		factory.createCar();

	}
}
