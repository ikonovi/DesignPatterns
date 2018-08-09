package linkedin.CH05.designpatterns.singleton.threadsafe;

/**
 * Another way we can ensure thread safety is to use the synchronized keyword on
 * the getInstance method. In this example, we go back to creating the Singleton
 * in the getInstance method but hasn't already been created, but we make sure
 * that only one thread can access this method at a time. So there is no chance
 * of creating multiple instances of this Singleton. In a multithreaded
 * environment. We do this by adding the synchronized keyword to the getInstance
 * method definition. This solution creates the Singleton lazily, like the
 * classic Singleton does, so the object is created only if you really need it.
 * 
 * However, there is a downside to this solution. Synchronization is expensive.
 * That is, synchronized code takes a lot longer to run than unsynchronized
 * code. And because the get instance method is synchronized, every call to get
 * instance will be more expensive, not just the first call.
 *
 */
public class Singleton {
	private static Singleton uniqueInstance;

	private Singleton() {
	}

	public static synchronized Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}

	// other useful methods here
	public String getDescription() {
		return "I'm a thread safe Singleton!";
	}
}
