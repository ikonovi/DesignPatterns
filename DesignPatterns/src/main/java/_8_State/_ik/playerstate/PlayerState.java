package _8_State._ik.playerstate;

interface PlayerState {

	void stop();

	void start();

	void pause();

	void rewind();

	default void enterState() {
		// Only some states will need this
	}

}
