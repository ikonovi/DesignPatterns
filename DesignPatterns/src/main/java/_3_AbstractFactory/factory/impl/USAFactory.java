package _3_AbstractFactory.factory.impl;

import _3_AbstractFactory.factory.interfaces.TransportFactory;
import _3_AbstractFactory.transport.impl.aircraft.Boeing747;
import _3_AbstractFactory.transport.impl.car.Porsche;
import _3_AbstractFactory.transport.interfaces.Aircraft;
import _3_AbstractFactory.transport.interfaces.Car;

// американские транспортные средства
public class USAFactory implements TransportFactory{

    @Override
    public Car createCar() {
        return new Porsche();
    }

    @Override
    public Aircraft createAircraft() {
        return new Boeing747();
    }

}
