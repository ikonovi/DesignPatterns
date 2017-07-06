package _1_Singleton;

public class SingletonExample {

	public static void main(String... args) {
		Singleton.getInstance().print();
		Singleton.getInstance().print();
		Singleton.getInstance().print();
	}
}

class Singleton {

	// Name of variable has meaning - mark of this pattern in code.
	// "volatile" - in case of POJO
	private static volatile Singleton instance;

	// Constructor is defined & hidden to prevent creation of class object
	// outside.
	private Singleton() {
	}

	// "synchronized" - in case of POJO
	public static synchronized Singleton getInstance() {
		// lazy initialization - creation class object by request.
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	public void print() {
		System.out.println(this);
	}

}
