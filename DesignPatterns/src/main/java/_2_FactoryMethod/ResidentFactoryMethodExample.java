package _2_FactoryMethod;

public class ResidentFactoryMethodExample {

	public static void main(String[] args) {
		
		ResidentFactory factory = ResidentFactory.getInstance();
		Resident resident = factory.createResident(ResidentType.RURAL);
		System.out.printf("Created %s object \n", resident.getClass().getSimpleName());
	}

}

interface Resident {
	String getName();
}

class Villager implements Resident {

	@Override
	public String getName() {
		return "Village Person";
	}
}

class CityPerson implements Resident {

	@Override
	public String getName() {
		return "City Person";
	}
}

enum ResidentType {
	RURAL, URBAN
}

class ResidentFactory {

	private static ResidentFactory instance;
	
	private ResidentFactory() {
		super();
	}
	
	public static ResidentFactory getInstance() {
		if (instance == null) {
			instance = new ResidentFactory();
		}
		return instance;
	}
		
	Resident createResident(ResidentType type) {
		Resident resident = null;  
		switch (type) {
		case RURAL:
			resident = new Villager();
			break;
		case URBAN:
			resident = new CityPerson();
			break;			
		default:			
			break;
		}
		return resident;
	}

}
