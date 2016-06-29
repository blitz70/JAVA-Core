package org.opentutorials.java2.inheritance;

class CalculatorOv1 {
	
	double left, right;
	
	public void setOperands(double left, double right){
		this.left = left;
		this.right = right;
	};
	
	public void sum() {
		System.out.println(this.left + this.right);
	};
	
	public void ave() {
		System.out.println((this.left + this.right)/2);
	};

};

class CalculatorSubOv1 extends CalculatorOv1 {
	
	public void sum() {	//overrides superclass's method sum()
		System.out.println("실행 결과는 " + (this.left + this.right) + " 입니다.");
	};

	public void sub() {
		System.out.println(this.left-this.right);
	};

};

public class OverrideDemo1{
	
	public static void main(String[] args) {
		
		CalculatorSubOv1 c1 = new CalculatorSubOv1();	
		c1.setOperands(10.2, 21.5);
		c1.sum();	//싱행 결과는 31.7 입니다.
		c1.ave();	//15.85
		c1.sub();	//-11.3
	};
}