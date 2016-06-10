package kr.co.iamtek.java2.modifier_interface;

class Calculator1 {		//Calculator 업데이트 완료

	double left, right;
	public void setOperands(double left, double right){
		this.left = left;
		this.right = right;
	};
	public void sum(){
		System.out.println(this.left+this.right);;
		};
	public void ave(){
		System.out.println((this.left+this.right)/2);;
	};
	
}
