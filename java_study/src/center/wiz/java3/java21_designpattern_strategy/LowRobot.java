package center.wiz.java3.java21_designpattern_strategy;

import center.wiz.java3.java21_designpattern_strategy.i.*;

public class LowRobot extends Robot {

	public LowRobot() {
		setFly(new FlyFalse());
		setMissile(new MissileFalse());
		setSword(new SwordNone());
	}
	
	@Override
	public void name() {
		System.out.println("[Low Robot]");
	}

}
