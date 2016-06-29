package org.opentutorials.java2.inheritance;

class ConstructorCalculator1 {
	
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

class ConstructorCalculatorSub1 extends ConstructorCalculator1 {
	
	public ConstructorCalculatorSub1(double left, double right) {	//sub class constructor defined
		this.left = left;
		this.right = right;
	}
	
	public void sub() {
		System.out.println(this.left-this.right);
	};

};

public class ConstructorDemo2{
	
	public static void main(String[] args) {
		
		ConstructorCalculatorSub1 c1 = new ConstructorCalculatorSub1(10, 20);	
		c1.sum();	//30
		c1.ave();	//15
		c1.sub();	//-10
	};
}