package _8_State._ik.playerstate;

public class RewindingPlayerState implements PlayerState {

	@Override
	public void stop() {
		System.out.println("Gears reset to start.");
	}

	@Override
	public void start() {
		// ignore not acceptable action 
	}

	@Override
	public void pause() {
		System.out.println("Gears stopped.");
	}

	@Override
	public void rewind() {
		// Do nothing - already rewinding 
	}

}
