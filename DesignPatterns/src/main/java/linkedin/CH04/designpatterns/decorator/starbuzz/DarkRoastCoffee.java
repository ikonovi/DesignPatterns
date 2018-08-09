package linkedin.CH04.designpatterns.decorator.starbuzz;

public class DarkRoastCoffee extends Coffee {
	public DarkRoastCoffee() {
		description = "Dark Roast Coffee";
	}
	
	@Override
	public double cost() {
		return .99;
	}
}

