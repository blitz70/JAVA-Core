package center.wiz.java3.java21_designpattern_strategy;

import center.wiz.java3.java21_designpattern_strategy.i.*;

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
