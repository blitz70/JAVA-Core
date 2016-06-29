package org.opentutorials.java2.inheritance;

class Calculator {
	
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

class CalculatorSub extends Calculator {
	
	public void sub() {
		System.out.println(this.left-this.right);
	};

};

public class CalculatorDemo1{
	
	public static void main(String[] args) {
		
		CalculatorSub c2 = new CalculatorSub();	
		c2.setOperands(1.5,2.0);
		c2.sum();	//3.5
		c2.ave();	//1.75
		c2.sub();	//-1.5
	};
}