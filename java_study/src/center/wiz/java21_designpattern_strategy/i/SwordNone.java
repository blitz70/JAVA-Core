package center.wiz.java21_designpattern_strategy.i;

public class SwordNone implements ISword {

	@Override
	public void sword() {
		System.out.println("can not use SWORD");
	}

}
