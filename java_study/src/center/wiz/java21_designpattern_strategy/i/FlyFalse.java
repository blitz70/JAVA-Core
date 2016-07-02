package center.wiz.java21_designpattern_strategy.i;

public class FlyFalse implements IFly {

	@Override
	public void fly() {
		System.out.println("can not FLY");
	}

}
