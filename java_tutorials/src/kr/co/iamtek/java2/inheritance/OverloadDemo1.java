package kr.co.iamtek.java2.inheritance;

class CalculatorOv3 {
	
	double left, right;
	double third;
	
	public void setOperands(double left, double right){
		this.left = left;
		this.right = right;
	};
	
	public void setOperands(double left, double right, double third){
		this.setOperands(left, right);
		this.third = third;
	};

	public void sum() {
		System.out.println(this.left + this.right + this.third);
	};
	
	public void ave() {
		if (this.third == 0.0) {	//깔금하지 않음.
			System.out.println((this.left + this.right)/2);
		} else {
			System.out.println((this.left + this.right + this.third)/3);
		};
	};

};

public class OverloadDemo1{
	
	public static void main(String[] args) {
		
		CalculatorOv3 c1 = new CalculatorOv3();	
		c1.setOperands(10, 20);
		c1.sum();	//30
		c1.ave();	//15

		c1.setOperands(10, 20, 30);
		c1.sum();	//60
		c1.ave();	//20
};
}