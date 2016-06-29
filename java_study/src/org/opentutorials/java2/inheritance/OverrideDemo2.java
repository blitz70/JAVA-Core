package org.opentutorials.java2.inheritance;

class CalculatorOv2 {
	
	double left, right;
	
	public void setOperands(double left, double right){
		this.left = left;
		this.right = right;
	};
	
	public void sum() {
		System.out.println(this.left + this.right);
	};
	
	public double ave() {
		return ((this.left + this.right)/2);
	};

};

class CalculatorSubOv2 extends CalculatorOv2 {
	
	@Override public void sum() {	//overrides superclass's method sum()
		System.out.println("실행 결과는 " + (this.left + this.right) + " 입니다.");
	};

	@Override public double ave() {
		return super.ave();	//superclass's method ave()
	};
	
	public void sub() {
		System.out.println(this.left-this.right);
	};

};

public class OverrideDemo2{
	
	public static void main(String[] args) {
		
		CalculatorSubOv2 c1 = new CalculatorSubOv2();	
		c1.setOperands(10.2, 21.5);
		c1.sum();	//싱행 결과는 31.7 입니다.
		System.out.println("result is " + c1.ave());	//result is 15.85
		c1.sub();	//-11.3
	};
}