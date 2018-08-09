package linkedin.CH05.designpatterns.singleton.static_;

/**
 * We'll show you two ways to make the Singleton thread safe.
 * 
 * The first in Singleton state uses a static initializer to create the
 * Singleton as soon as the class is loaded by the JVM. This is guaranteed to be
 * !!thread safe!!. The JVM will create the instance before any thread accesses the
 * static variable. 
 * 
 */
public class Singleton {

	private static Singleton uniqueInstance = new Singleton();

	private Singleton() {
	}

	public static Singleton getInstance() {
		return uniqueInstance;
	}

	// other useful methods here
	public String getDescription() {
		return "I'm a statically initialized Singleton!";
	}
}
