package _8_State._ik.playerstate;

import static java.util.Objects.isNull;

public class ContextPlayerState implements PlayerState {

	private PlayerState stoppedState;
	private PlayerState playingState;
	private PlayerState pausedState;
	private PlayerState rewindingState;

	private PlayerState currentState;

	public ContextPlayerState() {
		stoppedState = new StoppedPlayerState();
		currentState = stoppedState;
	}

	@Override
	public void stop() {
		currentState.stop();
		currentState = isNull(stoppedState) ? new StoppedPlayerState() : stoppedState;
		currentState.enterState();
	}

	@Override
	public void start() {
		currentState.start();
		currentState = isNull(playingState) ? new PlayingPlayerState() : playingState;
		currentState.enterState();
	}

	@Override
	public void pause() {
		currentState.pause();
		currentState = isNull(pausedState) ? new PausedPlayerState() : pausedState;
		currentState.enterState();
	}

	@Override
	public void rewind() {
		currentState.rewind();
		currentState = isNull(rewindingState) ? new RewindingPlayerState() : rewindingState;
		currentState.enterState();
	}

	/**
	 * for diagnostic use
	 * 
	 * @return state of player
	 */
	protected String getState() {
		return currentState.getClass().getSimpleName();
	}

	public static void main(String[] args) {
		
		ContextPlayerState ctx = new ContextPlayerState();
		System.out.println(ctx.getState());
		
		ctx.start();
		System.out.println(ctx.getState());
		ctx.pause();
		System.out.println(ctx.getState());
		ctx.start();
		System.out.println(ctx.getState());
		ctx.stop();
		System.out.println(ctx.getState());
		ctx.rewind();
		System.out.println(ctx.getState());
		
	}
}
