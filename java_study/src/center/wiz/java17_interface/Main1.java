package center.wiz.java17_interface;

public class Main1 {

	public static void main(String[] args) {
		InterfaceClass classEx = new InterfaceClass();
		classEx.calculate();
		classEx.getStr();
		
		InterfaceEx1 classI1 = new InterfaceClass();
		InterfaceEx2 classI2 = new InterfaceClass();
		classI1.calculate();
		classI2.getStr();

	}

}
