package linkedin.CH04.designpatterns.decorator.starbuzz.condiment;

import linkedin.CH04.designpatterns.decorator.starbuzz.Coffee;

public class Mocha extends CondimentDecorator {
	Coffee coffee;
 
	public Mocha(Coffee coffee) {
		this.coffee = coffee;
	}
 
	@Override
	public String getDescription() {
		return coffee.getDescription() + ", Mocha";
	}
 
	@Override
	public double cost() {
		return .20 + coffee.cost();
	}
}
