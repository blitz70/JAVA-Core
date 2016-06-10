package kr.co.iamtek.java2.classinstance;

class Calc2 {
	
	static double PI = 3.14;
	static int base = 0;
	int left, right;
	
	public void setOperands(int l, int r){
		this.left = l;
		this.right = r;
	};
	
	public void sum() {
		int sum = this.left + this.right + base;	//base 값 포함
		System.out.println(sum);
	};
	
	public void ave() {
		int ave = (this.left + this.right + base)/2;	//base 값 포함
		System.out.println(ave);
	};
};

public class Calculator2 {

	public static void main(String[] args) {
		
		Calc2 c1 = new Calc2();
		c1.setOperands(10, 20);
		c1.sum();	// 30
		
		Calc2 c2 = new Calc2();
		c2.setOperands(20, 40);
		c2.sum();	// 60

		Calc2.base = 10;
		c1.sum();	// 40
		c2.sum();	// 70
	};
}
