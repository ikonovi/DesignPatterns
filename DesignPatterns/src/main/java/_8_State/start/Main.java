package _8_State.start;

import _8_State.context.TransformerContext;
import _8_State.state.*;

public class Main {

	public static void main(String... args) {

		TransformerContext context = new TransformerContext();

		ITransformerState stateMove = new MoveState();
		ITransformerState stateFire = new FireState();

		context.setState(stateFire);
		context.action();

		context.setState(stateMove);
		context.action();

	}
}
