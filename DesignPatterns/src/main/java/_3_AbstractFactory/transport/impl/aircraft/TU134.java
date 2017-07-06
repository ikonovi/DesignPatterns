package _3_AbstractFactory.transport.impl.aircraft;

import _3_AbstractFactory.transport.interfaces.Aircraft;

public class TU134 implements Aircraft {

	@Override
	public void flight() {
		System.out.println("TU-134 flight!");
	}

}
