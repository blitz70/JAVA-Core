package kr.co.iamtek.java2.inheritance;

class CalculatorMult extends CalculatorSub {
	
	public void mult() {
		System.out.println(this.left*this.right);
	};

};

public class CalculatorDemo2{
	
	public static void main(String[] args) {
		
		CalculatorMult c1 = new CalculatorMult();	
		c1.setOperands(10.5,20.5);
		c1.sum();	//31.0
		c1.ave();	//15.5
		c1.sub();	//-10.0
		c1.mult();	//215.25
	};
}