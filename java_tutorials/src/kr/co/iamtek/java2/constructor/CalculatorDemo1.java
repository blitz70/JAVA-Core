package kr.co.iamtek.java2.constructor;

class Calculator {
	
	int left, right;
	
	public Calculator(int left, int right){	//constructor, 메소드가 클래스명과 동일하면 생성자
		this.left = left;
		this.right = right;
	};
	
	public void sum() {
		System.out.println(left + right);
	};
	
	public void ave() {
		System.out.println((this.left + this.right)/2);
	};
};

public class CalculatorDemo1 {
	
	public static void main(String[] args) {
		
		Calculator c1 = new Calculator(10, 20);		//instance
		c1.sum();
		c1.ave();
		
		Calculator c2 = new Calculator(20, 40);
		c2.sum();
		c2.ave();
		
	};
}