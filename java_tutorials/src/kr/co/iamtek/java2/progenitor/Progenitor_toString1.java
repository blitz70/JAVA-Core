package kr.co.iamtek.java2.progenitor;

class Calculator {		//class Calculator extends Object{} 와 동일
	
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
    @Override public String toString() {
    	return super.toString() + " Left:"+this.left +" Right:"+this.right;	//override, field값을 포함한 상세 내용
    }
};

public class Progenitor_toString1 {
	
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOperands(10,20);
		System.out.println(c1);				//kr.co.iamtek.java2.progenitor.Calculator@15db9742
		System.out.println(c1.toString());	//동일
	};
}