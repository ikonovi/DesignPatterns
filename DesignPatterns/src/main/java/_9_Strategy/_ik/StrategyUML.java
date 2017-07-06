package _9_Strategy._ik;

public class StrategyUML {

	public static void main(String... args) {
		Context ctx = new Context();
		ctx.contextMethod(new ConcreteStrategy1());
	}
}

interface Strategy {
	
	void algorithm();
	
}

class ConcreteStrategy1 implements Strategy {

	public void algorithm() {
		System.out.println("algorithm of Strategy 1");
	}

}

class ConcreteStrategy2 implements Strategy {

	public void algorithm() {
		System.out.println("algorithm of Strategy 2");
	}

}

/**
 * It doesn't keep reference to Strategy object.
 */
class Context {

	/**
	 * It's executed only once.
	 */
	public void contextMethod(final Strategy strategy) {
		strategy.algorithm();
	}

}
