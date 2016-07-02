package center.wiz.java20_designpattern_strategy;

public class SuperRobot extends Robot {

	public SuperRobot() {
	}
	
	@Override
	public void actionName() {
		System.out.println("[Super Robot]");
	}

	@Override
	public void actionFly() {
		System.out.println("can FLY");
	}

	@Override
	public void actionMissile() {
		System.out.println("can shoot MISSILES");
	}

	@Override
	public void actionSword() {
		System.out.println("can use LASER SWORD");
	}

}
