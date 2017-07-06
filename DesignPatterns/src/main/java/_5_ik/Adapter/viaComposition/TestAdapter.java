package _5_ik.Adapter.viaComposition;

public class TestAdapter {

	public static void main(String[] args) {

		Target client = new Adapter();
		client.request();

	}

}
