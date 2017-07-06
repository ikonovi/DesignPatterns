package _6_Facade.facade;

import _6_Facade.parts.Door;
import _6_Facade.parts.Wheel;
import _6_Facade.parts.Zazhiganie;

public class CarFacade {

	private Door door = new Door();
	private Zazhiganie zazhiganie = new Zazhiganie();
	private Wheel wheel = new Wheel();

	public void go() {
		door.open();
		zazhiganie.fire();
		wheel.turn();
	}

}
