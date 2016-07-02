package center.wiz.java21_designpattern_strategy;

import center.wiz.java21_designpattern_strategy.i.*;

public class SuperRobot extends Robot {
	
	public SuperRobot() {
		setFly(new FlyTrue());
		setMissile(new MissileTrue());
		setSword(new SwordLaser());
	}

	@Override
	public void name() {
		System.out.println("[Super Robot]");
	}

}
