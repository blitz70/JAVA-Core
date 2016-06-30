package center.wiz.java17_interface;

public class Main2 {

	public static void main(String[] args) {

		PhoneA a1 = new PhoneA();
		PhoneB b1 = new PhoneB();
		PhoneC c1 = new PhoneC();

		Ifunction a2 = new PhoneA();
		Ifunction b2 = new PhoneB();
		Ifunction c2 = new PhoneC();
		
		Ifunction[] phones = {a1, a2, b1, b2, c1, c2};
		
		for (int i = 0; i < phones.length; i++) {
			phones[i].isTalk();
			phones[i].isLTE();
			phones[i].isTVRemote();
			System.out.println("===============");
		}
}

}
