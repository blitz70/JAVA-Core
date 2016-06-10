package kr.co.iamtek.java2.inheritance;

class ConstructorCalculator4 {
	
	double left, right;
	
	//public ConstructorCalculator4(){};	//2. using super in subclass(1) works without super class's base constructor

	public ConstructorCalculator4(double left, double right){
		this.left = left;
		this.right = right;
	};
	
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

class ConstructorCalculatorSub4 extends ConstructorCalculator4 {
	
	public ConstructorCalculatorSub4(double left,double right) {	//sub class constructor defined
		super(left, right);	//1. must come first
	}

	public void sub() {
		System.out.println(this.left-this.right);
	};

};

public class ConstructorDemo4{
	
	public static void main(String[] args) {
		
		ConstructorCalculatorSub4 c1 = new ConstructorCalculatorSub4(10, 20);	
		c1.sum();	//30
		c1.ave();	//15
		c1.sub();	//-10
	};
}