package linkedin.CH04.designpatterns.decorator.starbuzz.condiment;

import linkedin.CH04.designpatterns.decorator.starbuzz.Coffee;

public class Soy extends CondimentDecorator {
	Coffee coffee;

	public Soy(Coffee coffee) {
		this.coffee = coffee;
	}

	@Override
	public String getDescription() {
		return coffee.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		return .15 + coffee.cost();
	}
}
