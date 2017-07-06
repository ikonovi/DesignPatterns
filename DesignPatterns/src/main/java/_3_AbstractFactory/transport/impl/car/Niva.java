package _3_AbstractFactory.transport.impl.car;

import _3_AbstractFactory.transport.interfaces.Car;

public class Niva implements Car {

    @Override
    public void drive() {
        System.out.println("Niva drive");
    }

    @Override
    public void stop() {
        System.out.println("Niva stopped");
    }
    
}
