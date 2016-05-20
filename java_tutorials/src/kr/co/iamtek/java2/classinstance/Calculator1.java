package kr.co.iamtek.java2.classinstance;

class Calc1 {
	
	static double PI = 3.14;
	int left, right;
	
	public void setOperands(int l, int r){
		this.left = l;
		this.right = r;
	};
	
	public void sum() {
		int sum = this.left + this.right;
		System.out.println(sum);
	};
	
	public void ave() {
		int ave = (this.left + this.right)/2;
		System.out.println(ave);
	};
};

public class Calculator1 {

	public static void main(String[] args) {
		
		Calc1 c1 = new Calc1();		//instance
		System.out.println(c1.PI);
		
		Calc1 c2 = new Calc1();
		System.out.println(c2.PI);

		System.out.println(Calc1.PI);
		
	};
}
