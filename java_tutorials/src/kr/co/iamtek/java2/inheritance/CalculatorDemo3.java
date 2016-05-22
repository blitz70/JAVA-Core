package kr.co.iamtek.java2.inheritance;

class CalculatorDiv extends CalculatorMult {
	
	public void div() {		//관련 클래스 left right를 int에서 double로 수정
		System.out.println(this.left/this.right);
	};

};

public class CalculatorDemo3{
	
	public static void main(String[] args) {
		
		CalculatorDiv c4 = new CalculatorDiv();	
		c4.setOperands(10.0,20.0);
		c4.sum();	//30.0
		c4.ave();	//15.0
		c4.mult();	//200.0
		c4.div();		//0.5

		/*
		Calculator c1 = new Calculator();	
		c1.setOperands(20.0,40.0);
		c1.sum();	//60.0
		c1.ave();	//30.0

		CalculatorSub c2 = new CalculatorSub();	
		c2.setOperands(10.0,20.0);
		c2.sum();	//30.0
		c2.ave();	//15.0
		c2.sub();	//-10.0

		CalculatorMult c3 = new CalculatorMult();	
		c3.setOperands(15.0,20.5);
		c3.sum();	//35.5
		c3.ave();	//17.75
		c3.sub();	//-5.5
		c3.mult();	//307.5
		 */

	};
}