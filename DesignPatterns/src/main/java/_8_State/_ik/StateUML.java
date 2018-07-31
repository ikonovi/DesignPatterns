package _8_State._ik;

public class StateUML {

	public static void main(String[] args) {
		State objInState1 = new StateA();
		Context stateCtx = new Context(objInState1);
		stateCtx.requestSmth();

		State objInState2 = new StateB();
		stateCtx.setState(objInState2);
		stateCtx.requestSmth();
	}
}

interface State {

	public void handle();

}

class StateA implements State {
	@Override
	public void handle() {
		System.out.println("Handle state A");
	}
}

class StateB implements State {
	@Override
	public void handle() {
		System.out.println("Handle state B");
	}
}

class Context {

	private State state;

	public Context(State state) {
		super();
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void requestSmth() {
		state.handle();
	}

}
