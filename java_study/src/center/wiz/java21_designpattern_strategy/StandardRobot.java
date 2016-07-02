package center.wiz.java21_designpattern_strategy;

import center.wiz.java21_designpattern_strategy.i.*;

public class StandardRobot extends Robot {

	public StandardRobot() {
		setFly(new FlyFalse());
		setMissile(new MissileTrue());
		setSword(new SwordWood());
	}
	
	@Override
	public void name() {
		System.out.println("[Standard Robot]");
	}

}
