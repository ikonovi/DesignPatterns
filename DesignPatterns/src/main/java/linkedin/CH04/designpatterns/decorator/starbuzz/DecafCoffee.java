package linkedin.CH04.designpatterns.decorator.starbuzz;

public class DecafCoffee extends Coffee {
	public DecafCoffee() {
		description = "Decaf Coffee";
	}
 
	@Override
	public double cost() {
		return 1.05;
	}
}

