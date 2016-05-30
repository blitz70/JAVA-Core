package kr.co.iamtek.java2.modifier_abstract;

abstract class Calculator {
	double left, right;
	public void setOperands(double left, double right){
		this.left = left;
		this.right = right;
	};
	double _sum() {
		return this.left + this.right;
	};
	public abstract void sum();
	public abstract void ave();
	public void run(){
		sum();
		ave();
	};
};

class CalculatorDecoPlus extends Calculator {
	public void sum(){
		System.out.println("+++sum : "+ _sum());
	};
	public void ave(){
		System.out.println("+++ave : "+_sum()/2);
	};
};

class CalculatorDecoMinus extends Calculator {
	public void sum(){
		System.out.println("---sum : "+_sum());
	};
	public void ave(){
		System.out.println("---ave : "+_sum()/2);
	};
	
};

public class AbstractDemo2 {

	public static void main(String[] args) {
		CalculatorDecoPlus c1 = new CalculatorDecoPlus();
		c1.setOperands(10.0, 20.0);
		c1.run();
		CalculatorDecoMinus c2 = new CalculatorDecoMinus();
		c2.setOperands(10.0, 20.0);
		c2.run();
		

	}

}
