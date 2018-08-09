package linkedin.CH04.designpatterns.decorator.starbuzz.condiment;

import linkedin.CH04.designpatterns.decorator.starbuzz.Coffee;

public class Milk extends CondimentDecorator {
	Coffee coffee;

	public Milk(Coffee coffee) {
		this.coffee = coffee;
	}

	@Override
	public String getDescription() {
		return coffee.getDescription() + ", Milk";
	}

	@Override
	public double cost() {
		return .10 + coffee.cost();
	}
}
