package _4_Decorator.decorators;

import _4_Decorator.components.Component;

public class ShadowDecorator extends Decorator {

	public ShadowDecorator(Component component) {
		super(component);
	}

	@Override
	public void afterDraw() {
		System.out.println("... added shadow");
	}

}
