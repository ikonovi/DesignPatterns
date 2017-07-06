package _3_AbstractFactory.factory.interfaces;

import _3_AbstractFactory.transport.interfaces.Aircraft;
import _3_AbstractFactory.transport.interfaces.Car;

// фабрика по созданию транспортных средств
public interface TransportFactory {

	// что фабрика будет производить

	Car createCar();			// автомобили

	Aircraft createAircraft();  // самолеты

}
