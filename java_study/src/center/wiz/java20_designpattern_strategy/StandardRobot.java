package center.wiz.java20_designpattern_strategy;

public class StandardRobot extends Robot {

	public StandardRobot() {
	}

	@Override
	public void actionName() {
		System.out.println("[Standard Robot]");
	}

	@Override
	public void actionFly() {
		System.out.println("can not FLY");
	}

	@Override
	public void actionMissile() {
		System.out.println("can shoot MISSILES");
	}

	@Override
	public void actionSword() {
		System.out.println("can use WOODEN SWORD");
	}

}
