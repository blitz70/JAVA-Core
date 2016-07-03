package center.wiz.java3.java17_interface;

public class PhoneA implements Ifunction {

	@Override
	public void isTalk() {
		System.out.println("통화 가능 합니다");
		
	}

	@Override
	public void isLTE() {
		System.out.println("불가능 합니다. 3G 입니다.");
	}

	@Override
	public void isTVRemote() {
		System.out.println("미탑재 되어 있습니다.");
	}

}
