package center.wiz.java3.java20_designpattern_strategy;

public abstract class Robot {

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
	
	public abstract void actionName();
	public abstract void actionFly();
	public abstract void actionMissile();
	public abstract void actionSword();
	
	public void actionRobot() {
		actionName();
		actionWalk();
		actionRun();
		actionFly();
		actionMissile();
		actionSword();
		shape();
	}

}
