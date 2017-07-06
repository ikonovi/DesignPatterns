package _2_FactoryMethod;

/**
 * 
 *
 */
public class FactoryMethodExampleWikiEn {

	public static void main(String[] args) {

		MazeGame ordinaryGame = new OrdinaryMazeGame();
		System.out.printf("Created %s object \n", ordinaryGame.getClass().getSimpleName());
		
		MazeGame magicGame = new MagicMazeGame();		
		System.out.printf("Created %s object \n", magicGame.getClass().getSimpleName());

	}

}

abstract class MazeGame {

	// factory method
	abstract protected Room makeRoom();
}

class MagicMazeGame extends MazeGame {
	
	@Override
	protected Room makeRoom() {
		return new MagicRoom();
	}
}

class OrdinaryMazeGame extends MazeGame {
	
	@Override
	protected Room makeRoom() {
		return new OrdinaryRoom();
	}
}

// *** Classes of objects to be created.

interface Room {
	void connect(Room room);
}

class MagicRoom implements Room {

	@Override
	public void connect(Room room) {		
	}
}

class OrdinaryRoom implements Room {

	@Override
	public void connect(Room room) {		
	}
}
