package org.opentutorials.java2.polymorphism;

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

public class PolymorphismCalculatorDemo1 {
	
	public static void execute(Calculator calc){	//class as argument, class polymorphism allows this
		System.out.println("실행결과");
		calc.run();
	}

	public static void main(String[] args) {
		Calculator c1 = new CalculatorDecoPlus();	//class polymorphism
		c1.setOperands(10.0, 20.0);
		c1.run();
		execute(c1);
		Calculator c2 = new CalculatorDecoMinus();	//class polymorphism
		c2.setOperands(10.0, 20.0);
		c2.run();
		execute(c2);
		PolymorphismCalculatorDemo1.execute(c2);
	}

}
