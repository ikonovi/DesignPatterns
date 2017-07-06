package _3_AbstractFactory.factory.impl;

import _3_AbstractFactory.factory.interfaces.TransportFactory;
import _3_AbstractFactory.transport.impl.aircraft.TU134;
import _3_AbstractFactory.transport.impl.car.Niva;
import _3_AbstractFactory.transport.interfaces.Aircraft;
import _3_AbstractFactory.transport.interfaces.Car;

// российские транспортные средства
public class RussianFactory implements TransportFactory{

    @Override
    public Car createCar() {
        return new Niva();
    }

    @Override
    public Aircraft createAircraft() {
        return new TU134();
    }

}
