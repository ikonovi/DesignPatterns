package _4_wiki.Decorator;

class DecoratorComma extends Decorator {

	public DecoratorComma(InterfaceComponent component) {
		super(component);
	}

	@Override
	public void doOperation() {
		super.doOperation();
		System.out.print(", ");		
	}

	@Override
	public void doNewOperation() {
		System.out.println("New comma operation");
	}
}
