package center.wiz.java3.java23_API;

public class MainWrapper {

	public static void main(String[] args) {
		
		Integer wrapInt = new Integer(234);
		int i = wrapInt.intValue();
		System.out.println(i);
		
		String str = "123";
		int i2 = Integer.parseInt(str);
		System.out.println(i2+27);
		
	}

}
