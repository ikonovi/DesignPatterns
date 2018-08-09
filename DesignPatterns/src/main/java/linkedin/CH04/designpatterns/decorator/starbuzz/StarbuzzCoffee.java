package linkedin.CH04.designpatterns.decorator.starbuzz;

import linkedin.CH04.designpatterns.decorator.starbuzz.condiment.Mocha;
import linkedin.CH04.designpatterns.decorator.starbuzz.condiment.Soy;

public class StarbuzzCoffee {

	public static void main(String args[]) {
		Coffee coffee = new EspressoCoffee();
		System.out.println(coffee.getDescription() + " $" + coffee.cost());

		Coffee beverage2 = new HouseBlendCoffee();
		beverage2 = new Soy(beverage2);
		beverage2 = new Mocha(beverage2);
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
	}
}
