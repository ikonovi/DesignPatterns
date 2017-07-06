package _4_wiki.Decorator;

abstract class Decorator implements InterfaceComponent {

	protected InterfaceComponent component;

	public Decorator(InterfaceComponent c) {
		this.component = c;
	}

	@Override
	public void doOperation() {
		component.doOperation();
	}

	public void doNewOperation() {
		System.out.println("Do new operation.");
	}

}
