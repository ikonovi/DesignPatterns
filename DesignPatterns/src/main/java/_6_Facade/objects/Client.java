package _6_Facade.objects;

import _6_Facade.facade.CarFacade;
import _6_Facade.parts.Door;
import _6_Facade.parts.Wheel;
import _6_Facade.parts.Zazhiganie;

public class Client {

	public static void main(String[] args) {
		// вызов без фасада
		Door door = new Door();
		door.open();

		Zazhiganie zazhiganie = new Zazhiganie();
		zazhiganie.fire();

		Wheel wheel = new Wheel();
		wheel.turn();

		// вызов с фасадом
		CarFacade carFacade = new CarFacade();
		carFacade.go();

	}
}
