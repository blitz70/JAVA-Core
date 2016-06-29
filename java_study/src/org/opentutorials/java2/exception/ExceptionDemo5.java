package org.opentutorials.java2.exception;

//예외 처리 : 직접 처리

class Calculator1{
	int left, right;		//double로 하면 /0 지원
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void div() {
		if (right == 0) {	//manual handling
			throw new ArithmeticException("/0 not allowed.");
		};
		System.out.println("계산 결과는 ");
		System.out.println(this.left/this.right);
		System.out.println(" 입니다.");
		System.out.println("Divide End");
	}
}

public class ExceptionDemo5 {	//Try catch

	public static void main(String[] args) {
		Calculator1 c1 = new Calculator1();
		c1.setOperands(10, 0);
		try {
			c1.div();
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}
