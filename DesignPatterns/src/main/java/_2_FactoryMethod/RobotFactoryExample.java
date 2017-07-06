package _2_FactoryMethod;

/* 	Client */
public class RobotFactoryExample {

	public static void main(String[] args) {

		RobotFactory factory = new CombatRobotFactory();
		Robot robot = factory.makeRobot();
		System.out.printf("Created %s object \n", robot.getClass().getSimpleName());

	}
}

interface Robot {
	public String getType();
}

class CombatRobot implements Robot {

	@Override
	public String getType() {
		return "Type of CombatRobot.";
	}
}

class WorkerRobot implements Robot {

	@Override
	public String getType() {
		return "Type of WorkerRobot.";
	}
}

interface RobotFactory {
	public Robot makeRobot();
}

class CombatRobotFactory implements RobotFactory {

	@Override
	public Robot makeRobot() {
		return new CombatRobot();
	}
}

class WorkerRobotFactory implements RobotFactory {

	@Override
	public Robot makeRobot() {
		return new WorkerRobot();
	}
}
