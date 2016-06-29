package org.opentutorials.java2.modifier_final;

class Calculator {
	
	static final double PI = 3.14;	//final field, real constant
	double left, right;
	
	public void setOperands(double left, double right){
		this.left = left;
		this.right = right;
		//this.PI = 6;	//error
	};
	
	public void sum() {
		double sum = this.left + this.right;
		System.out.println(sum);
	};
	
	public void ave() {
		double ave = (this.left + this.right)/2;
		System.out.println(ave);
	};
};

public class FinalFieldDemo1 {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();		//instance
		System.out.println(c1.PI);
		
		Calculator c2 = new Calculator();
		System.out.println(c2.PI);

		System.out.println(Calculator.PI);
		
		//Calculator.PI = 10;	//error
		
	};
}
