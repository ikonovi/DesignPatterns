package _4_Decorator.decorators;

import _4_Decorator.components.Component;

/**
 * Задает способ добавления новой функциональности. 
 *
 */
public abstract class Decorator implements Component {

	protected Component component;

	public Decorator(Component component) {
		this.component = component;
	}

	public abstract void afterDraw();

	@Override
	public void draw() {
		component.draw();
		afterDraw();
	}

}
