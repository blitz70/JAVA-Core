package kr.co.iamtek.java2.object;

class Calculator {	//class
	
	int left, right;
	
	public void setOperands(int l, int r){
		this.left = l;
		this.right = r;
	};
	
	public void sum() {
		int sum = this.left + this.right;
		System.out.println(sum);
	};
	
	public void ave() {
		int ave = (this.left + this.right)/2;
		System.out.println(ave);
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