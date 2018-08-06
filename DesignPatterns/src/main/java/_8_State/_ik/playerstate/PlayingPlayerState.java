package _8_State._ik.playerstate;

public class PlayingPlayerState implements PlayerState {
	
	@Override
	public void stop() {
		System.out.println("Gears stopped, reset to start.");
	}

	@Override
	public void start() {
		// Do nothing 
	}

	@Override
	public void pause() {
		System.out.println("Gears stopped.");
	}

	@Override
	public void rewind() {
		System.out.println("Gears are running backward...");
	}

}
