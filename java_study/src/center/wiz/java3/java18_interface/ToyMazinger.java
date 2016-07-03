package center.wiz.java3.java18_interface;

public class ToyMazinger implements Move, Missile {

	public ToyMazinger() {
		toyName();
		canMove();
		canMissile();
		System.out.println("==========");
	}
	@Override
	public void canMove() {
		System.out.println("팔다리를 움직일수 있습니다.");
	}
	@Override
	public void canMissile() {
		System.out.println("미사일을 발사 할 수 있습니다.");
	}
	@Override
	public void toyName() {
		System.out.println("마징가 입니다.");
	}

}