package center.wiz.java21_designpattern_strategy.i;

public class MissileFalse implements IMissile {

	@Override
	public void missile() {
		System.out.println("can not shoot MISSILES");
	}

}
