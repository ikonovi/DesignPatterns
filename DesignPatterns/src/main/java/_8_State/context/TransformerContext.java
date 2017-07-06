package _8_State.context;

import _8_State.state.ITransformerState;

public class TransformerContext implements ITransformerState {

	private ITransformerState state;

	public ITransformerState getState() {
		return state;
	}

	public void setState(ITransformerState state) {
		this.state = state;
	}

	@Override
	public void action() {
		this.state.action();
	}

}
