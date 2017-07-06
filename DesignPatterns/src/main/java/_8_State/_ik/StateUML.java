package _8_State._ik;

public class StateUML {

	public static void main(String[] args) {

		State objInState1 = new ConcreteStateA();
		State objInState2 = new ConcreteStateB();

		Context stateCtx = new Context(objInState1);
		stateCtx.requestSmth();
		stateCtx.setState(objInState2);
		stateCtx.requestSmth();

	}

}

interface State {

	public void handle();

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

class ConcreteStateB implements State {

	@Override
	public void handle() {
		System.out.println("State Concrete B");
	}

}

class ConcreteStateA implements State {

	@Override
	public void handle() {
		System.out.println("State Concrete A");
	}

}
