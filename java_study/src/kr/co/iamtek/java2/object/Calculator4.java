package kr.co.iamtek.java2.object;

class Calculator {	//class
	
	double left, right;
	
	public void setOperands(int left, int right){
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

public class Calculator4 {
	
	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();		//instance
		c1.setOperands(10,20);
		c1.sum();
		c1.ave();
		
		Calculator c2 = new Calculator();
		c2.setOperands(20,40);
		c2.sum();
		c2.ave();
		
	};
}