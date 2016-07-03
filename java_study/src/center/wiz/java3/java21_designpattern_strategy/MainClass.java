package center.wiz.java3.java21_designpattern_strategy;

import center.wiz.java3.java21_designpattern_strategy.i.*;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("SuperRobot을 만들어 주세요!");
		Robot robot1 = new SuperRobot();
		robot1.setFly(new FlyFalse());
		robot1.actionRobot();
		/*
		Robot robot2 = new StandardRobot();
		robot2.actionRobot();
		Robot robot3 = new LowRobot();
		robot3.actionRobot();
		*/
	}

}
