package center.wiz.java3.java18_interface;

public class ToyAirplane implements Laser, Missile {

	public ToyAirplane() {
		toyName();
		canLaser();
		canMissile();
		System.out.println("==========");
	}
	@Override
	public void canLaser() {
		System.out.println("레이져를 발사 할 수 있습니다.");
	}
	@Override
	public void canMissile() {
		System.out.println("미사일을 발사 할 수 있습니다.");
	}
	@Override
	public void toyName() {
		System.out.println("비행기 입니다.");
	}
}