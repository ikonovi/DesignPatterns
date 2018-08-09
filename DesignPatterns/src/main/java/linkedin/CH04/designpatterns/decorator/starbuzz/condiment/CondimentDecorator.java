package linkedin.CH04.designpatterns.decorator.starbuzz.condiment;

import linkedin.CH04.designpatterns.decorator.starbuzz.Coffee;

public abstract class CondimentDecorator extends Coffee {
	@Override
	public abstract String getDescription();
}
