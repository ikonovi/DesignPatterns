package _2_FactoryMethod;

public class CarFactoryMethodExample {

	public static void main(String... args) {

		// передаем соотв.параметер для создания объекта
		Car car = CarSelector.getInstance().getCar(RoadType.CITY);
		car.drive();
		car.stop();

		car = CarSelector.getInstance().getCar(RoadType.OFF_ROAD);
		car.drive();
		car.stop();

		car = CarSelector.getInstance().getCar(RoadType.GAZON);

	}

}

interface Car {

	void drive();

	void stop();

}

// фабрика по созданию автомобилей: реализована как синлетон.
class CarSelector {

	private static CarSelector instance;

	private CarSelector() {
	}

	// возвращает экземпляр фабрики
	public static CarSelector getInstance() {
		if (instance == null) {
			instance = new CarSelector();
		}
		return instance;
	}

	// фабричный метод, который создает нужный автомобиль
	public Car getCar(RoadType roadType) {
		Car car = null;
		switch (roadType) {
		case CITY:
			car = new Porsche();
			break;
		case OFF_ROAD:
			car = new Geep();
			break;
		case GAZON:
			car = new NewGeep();
			break;
		}

		return car;
	}
}

class Geep implements Car {

	@Override
	public void drive() {
		System.out.println("Geep is driven at speed 50 km/h.");
	}

	@Override
	public void stop() {
		System.out.println("Geep stopped in 5 sec.");
	}

}

class NewGeep extends Geep {

	public void newFunction() {
		System.out.println("NewGeep has a new function.");
	}

}

class Porsche implements Car {

	@Override
	public void drive() {
		System.out.println("Porsche is driven at speed 150 km/h.");
	}

	@Override
	public void stop() {
		System.out.println("Porsche stopped in 1 sec.");
	}

}

enum RoadType {
	CITY, OFF_ROAD, GAZON
}
