package linkedin.CH04.designpatterns.decorator.starbuzz;

public class EspressoCoffee extends Coffee {

	public EspressoCoffee() {
		description = "Espresso";
	}

	@Override
	public double cost() {
		return 1.99;
	}
}
