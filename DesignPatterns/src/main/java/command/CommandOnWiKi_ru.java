package command;

/* Client class */

/**
 * Example of Command behavioral pattern taken on WiKi ru.
 *
 */
public class CommandOnWiKi_ru {

	public static void main(String[] args) {
		
		// receiver
		Light l = new Light();

		// concrete commands holding receiver with its state
		Command switchUp = new TurnOnLightCommand(l);
		Command switchDown = new TurnOffLightCommand(l);

		// invoker
		Switch s = new Switch(switchUp, switchDown);

		// actions of invoker
		s.flipUp();
		s.flipDown();
	}
}

/* Invoker class */

class Switch {
	private Command flipUpCommand;
	private Command flipDownCommand;

	public Switch(Command flipUpCommand, Command flipDownCommand) {
		this.flipUpCommand = flipUpCommand;
		this.flipDownCommand = flipDownCommand;
	}

	public void flipUp() {
		flipUpCommand.execute();
	}

	public void flipDown() {
		flipDownCommand.execute();
	}
}

/* Receiver class */

class Light {
	public Light() {
	}

	public void turnOn() {
		System.out.println("The light is on");
	}

	public void turnOff() {
		System.out.println("The light is off");
	}
}

/* Command interface */

interface Command {
	void execute();
}

/* Command for turning on the light 
 * 
 * Values for parameters of the receiver method are stored in the command.
 * 
 */

class TurnOnLightCommand implements Command {
	private Light theLight;

	public TurnOnLightCommand(Light light) {
		this.theLight = light;
	}

	public void execute() {
		theLight.turnOn();
	}
}

/* Command for turning off the light */

class TurnOffLightCommand implements Command {
	private Light theLight;

	public TurnOffLightCommand(Light light) {
		this.theLight = light;
	}

	public void execute() {
		theLight.turnOff();
	}
}
