package kr.co.iamtek.java2.classinstance;

class Calc3 {
	
	public static void sum(int left, int right) {
		System.out.println(left + right);
	};
	
	public static void ave(int left, int right) {
		System.out.println((left + right)/2);
	};
};

public class Calculator3 {

	public static void main(String[] args) {

		Calc3.sum(10, 20);	//30
		Calc3.ave(10, 20);		//15
		
		Calc3.sum(20, 40);	//60
		Calc3.ave(20, 40);		//30
	};
}
