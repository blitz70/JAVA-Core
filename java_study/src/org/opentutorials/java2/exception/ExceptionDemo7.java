package org.opentutorials.java2.exception;

//예외 처리 : 직접 만들기

class DivException extends ArithmeticException {
	int left, right;
	DivException() {
		super();
	};
    DivException(String message, int left, int right) {
        super(message);
        this.left = left;
        this.right = right;
    };
}

class Calculator2 {
	int left, right;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void div() {
		if (right == 0) {
			throw new DivException("div by 0 not allowed.", this.left, this.right);
		};
		System.out.println(this.left/this.right);
	}
}

public class ExceptionDemo7 {	//Try catch

	public static void main(String[] args) {
		Calculator2 c1 = new Calculator2();
		c1.setOperands(10, 0);
		try {
			c1.div();
		} catch (DivException e) {
			System.out.println(e.getMessage());
			System.out.println("Left :" + e.left);
			System.out.println("Right :" + e.right);
		}
	}
}
