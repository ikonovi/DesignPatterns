package _4_ik.Decorator;

class DecoratorPatternApp1 {

	public static void main(String... args) {

		PrinterDecorator componentDecoratated = 
				new PrintDecoratorHello(
					new PrintDecoratorSpace(
						new PrinterDecoratorExclamation(
							new PrinterComponentWorld())));
		componentDecoratated.print();
	}
}

/**
 * Plays role of Component interface in the pattern.
 * 
 * @author ikonovi
 *
 */
interface Printer {

	public void print();

}

/**
 * Plays role of component in Decorator pattern.
 * 
 * @author ikonovi
 *
 */
class PrinterComponentWorld implements Printer {

	@Override
	public void print() {
		System.out.print("World");
	}

}

abstract class PrinterDecorator implements Printer {

	protected Printer component;

	public PrinterDecorator(Printer c) {
		this.component = c;
	}

	// Delegation of method execution to Component.
	@Override
	public void print() {
		component.print();
	}

	/**
	 * Add another feature
	 */
	public void printSomethingNew() {
		System.out.println("It's printed something else.");
	}

}

class PrintDecoratorHello extends PrinterDecorator {

	public PrintDecoratorHello(Printer component) {
		super(component);
	}

	@Override
	public void print() {
		System.out.print("Hello");
		super.print();
	}

}

class PrintDecoratorSpace extends PrinterDecorator {

	public PrintDecoratorSpace(Printer component) {
		super(component);
	}

	@Override
	public void print() {
		System.out.print(" ");
		super.print();				
	}

}

class PrinterDecoratorExclamation extends PrinterDecorator {

	public PrinterDecoratorExclamation(Printer component) {
		super(component);
	}

	@Override
	public void print() {
		super.print();
		System.out.println("!");
	}

}
