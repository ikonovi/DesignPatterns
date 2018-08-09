package linkedin.CH04.designpatterns.decorator.starbuzz.condiment;

import linkedin.CH04.designpatterns.decorator.starbuzz.Coffee;

public class Whip extends CondimentDecorator {
	Coffee coffee;
 
	public Whip(Coffee coffee) {
		this.coffee = coffee;
	}
 
	@Override
	public String getDescription() {
		return coffee.getDescription() + ", Whip";
	}
 
	@Override
	public double cost() {
		return .10 + coffee.cost();
	}
}
