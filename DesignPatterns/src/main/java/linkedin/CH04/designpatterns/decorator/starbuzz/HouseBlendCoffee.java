package linkedin.CH04.designpatterns.decorator.starbuzz;

public class HouseBlendCoffee extends Coffee {
	public HouseBlendCoffee() {
		description = "House Blend Coffee";
	}

	@Override
	public double cost() {
		return .89;
	}
}
