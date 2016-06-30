package center.wiz.java17_interface;

public class InterfaceClass implements InterfaceEx1, InterfaceEx2 {

	@Override
	public String getStr() {
		System.out.println("getStr() 실제 구현은 여기서 해요");
		return null;
	}

	@Override
	public void calculate() {
		System.out.println("calculate() 실제 구현은 여기서 해요");
	}

}
