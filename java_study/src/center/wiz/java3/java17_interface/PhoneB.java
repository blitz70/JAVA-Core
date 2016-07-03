package center.wiz.java3.java17_interface;

public class PhoneB implements Ifunction {

	@Override
	public void isTalk() {
		System.out.println("통화 가능 합니다");
		
	}

	@Override
	public void isLTE() {
		System.out.println("가능 합니다.");
	}

	@Override
	public void isTVRemote() {
		System.out.println("탑재 되어 있습니다.");
	}

}
