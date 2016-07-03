package center.wiz.java3.java20_designpattern_strategy;

public class LowRobot extends Robot {

	public LowRobot() {
	}
	
	@Override
	public void actionName() {
		System.out.println("[Low Robot]");
	}

	@Override
	public void actionFly() {
		System.out.println("can not FLY");
	}

	@Override
	public void actionMissile() {
		System.out.println("can not shoot MISSILES");
	}

	@Override
	public void actionSword() {
		System.out.println("can not use SWORD");
	}

}
