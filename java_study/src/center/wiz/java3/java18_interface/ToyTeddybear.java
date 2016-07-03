package center.wiz.java3.java18_interface;

public class ToyTeddybear implements Move {

	public ToyTeddybear() {
		toyName();
		canMove();
		System.out.println("==========");
	}
	@Override
	public void canMove() {
		System.out.println("팔다리를 움직일수 있습니다.");
	}
	@Override
	public void toyName() {
		System.out.println("곰돌이 입니다.");
	}

}
