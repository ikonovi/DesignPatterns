package _8_State._ik.playerstate;

public class PausedPlayerState implements PlayerState {
	
	@Override
	public void stop() {
		System.out.println("Gears reset to start.");
	}

	@Override
	public void start() {
		System.out.println("Gears are running forward...");
	}

	@Override
	public void pause() {
		// Do nothing - already paused
	}

	@Override
	public void rewind() {		
		System.out.println("Gears are running backward...");
	}
	
	@Override
	public void enterState() {
		// setIcon(Icon.paused);		
	}

}
