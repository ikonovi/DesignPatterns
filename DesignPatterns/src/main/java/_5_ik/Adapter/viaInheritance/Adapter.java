package _5_ik.Adapter.viaInheritance;

/**
 * This adapts the Adaptee so the client may use it.
 */
public class Adapter extends Adaptee implements Target {
	
	@Override
	public void request() {
		super.delegatedRequest();
	}

}
