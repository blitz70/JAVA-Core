package center.wiz.java3.java21_designpattern_strategy;

import center.wiz.java3.java21_designpattern_strategy.i.*;

public abstract class Robot {
	
	IFly fly;
	IMissile missile;
	ISword sword;

	public Robot() {
	}
	
	public void actionWalk() {
		System.out.println("can WALK");
	}
	
	public void actionRun() {
		System.out.println("can RUN");
	}
	
	public void shape() {
		System.out.println("has HEAD, BODY, ARMS and LEGS");
	}
	
	public abstract void name();
	
	public void actionRobot() {
		name();
		actionWalk();
		actionRun();
		this.fly.fly();
		this.missile.missile();
		this.sword.sword();
		shape();
	}

	public void setFly(IFly fly) {
		this.fly = fly;
	}

	public void setMissile(IMissile missile) {
		this.missile = missile;
	}

	public void setSword(ISword sword) {
		this.sword = sword;
	}

}
