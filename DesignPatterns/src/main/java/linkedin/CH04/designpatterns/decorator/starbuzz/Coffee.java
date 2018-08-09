package linkedin.CH04.designpatterns.decorator.starbuzz;

public abstract class Coffee {
	String description = "Unknown Beverage";
  
	public String getDescription() {
		return description;
	}
 
	public abstract double cost();
}
