package _4_wiki.Decorator;

class DecoratorSpace extends Decorator {

	public DecoratorSpace(InterfaceComponent c) {
		super(c);
	}

	@Override
	public void doOperation() {
		System.out.print(" ");
		super.doOperation();
	}

	@Override
	public void doNewOperation() {
		System.out.println("New space operation");
	}

}
