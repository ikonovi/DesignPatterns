package _2_FactoryMethod;

/**
 * 
 * 
 */
public class FactoryMethodExampleWikiRu {

	public static void main(String[] args) {

		Creator creatorA = new ConcreteCreatorA();
		Creator creatorB = new ConcreteCreatorB();

		Product productA = creatorA.factoryMethod();
		Product productB = creatorB.factoryMethod();

		System.out.printf("Created %s object \n", productA.getClass().getSimpleName());
		System.out.printf("Created %s object \n", productB.getClass().getSimpleName());

	}
}

interface Product {
}

class ConcreteProductA implements Product {
}

class ConcreteProductB implements Product {
}

interface Creator {
	public Product factoryMethod();
}

class ConcreteCreatorA implements Creator {

	@Override
	public Product factoryMethod() {
		return new ConcreteProductA();
	}
}

class ConcreteCreatorB implements Creator {

	@Override
	public Product factoryMethod() {
		return new ConcreteProductB();
	}
}
