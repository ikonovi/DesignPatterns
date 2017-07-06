package _4_wiki.Decorator;

class DecoratorHello extends Decorator {

	public DecoratorHello(InterfaceComponent c) {
		super(c);
	}

	@Override
	public void doOperation() {
		System.out.print("Hello");
		super.doOperation();
	}

	@Override
	public void doNewOperation() {
		System.out.println("New hello operation");
	}

}
