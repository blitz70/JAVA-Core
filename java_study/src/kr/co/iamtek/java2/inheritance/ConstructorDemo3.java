package kr.co.iamtek.java2.inheritance;

class ConstructorCalculator3 {
	
	double left, right;
	
	public ConstructorCalculator3(){};		//defined because of sub class
		
	public ConstructorCalculator3(double left, double right){
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

class ConstructorCalculatorSub3 extends ConstructorCalculator3 {
	
	public ConstructorCalculatorSub3(double left,double right) {	//sub class constructor defined
		this.left = left;
		this.right = right;
	}

	public void sub() {
		System.out.println(this.left-this.right);
	};

};

public class ConstructorDemo3{
	
	public static void main(String[] args) {
		
		ConstructorCalculatorSub3 c1 = new ConstructorCalculatorSub3(10, 20);	
		c1.sum();	//30
		c1.ave();	//15
		c1.sub();	//-10
	};
}