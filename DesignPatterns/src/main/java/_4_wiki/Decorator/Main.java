package _4_wiki.Decorator;

class Main {

	public static void main(String... args) {
		Decorator c = new DecoratorHello(new DecoratorComma(new DecoratorSpace(new WorldComponent())));
		c.doOperation(); // Результат выполнения программы "Hello, World!"
		System.out.print("\n");
		c.doNewOperation(); // New hello operation
	}

}
