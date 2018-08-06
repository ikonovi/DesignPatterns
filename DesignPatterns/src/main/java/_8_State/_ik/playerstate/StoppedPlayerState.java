package _8_State._ik.playerstate;

public class StoppedPlayerState implements PlayerState {

	@Override
	public void stop() {
		// Do nothing - already stopped
	}

	@Override
	public void start() {
		System.out.println("Gears are running forward...");
	}

	@Override
	public void pause() {
		// Do nothing - already stopped
	}

	@Override
	public void rewind() {
		System.out.println("Gears are running backward...");
	}

	@Override
	public void enterState() {
		// setIcon(Icon.stopped);
	}
}
