package center.wiz.java20_designpattern_strategy;

public class MainClass {

	public static void main(String[] args) {
		Robot robot1 = new SuperRobot();
		robot1.actionRobot();
		Robot robot2 = new StandardRobot();
		robot2.actionRobot();
		Robot robot3 = new LowRobot();
		robot3.actionRobot();
	}

}
