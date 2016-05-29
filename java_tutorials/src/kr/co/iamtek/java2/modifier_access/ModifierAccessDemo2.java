package kr.co.iamtek.java2.modifier_access;

class Calculator {
	
	private double left, right;
	
	private double _sum() {
		return this.left + this.right;
	};

	public void setOperands(double left, double right){
		this.left = left;
		this.right = right;
	};
	public void sum() {
		System.out.println(_sum());
	};
	public void sumDecoPlus() {
		System.out.println("+++++ "+_sum()+" +++++");
	};
	public void sumDecoMinus() {
		System.out.println("----- "+_sum()+" -----");
	};
};

public class ModifierAccessDemo2 {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOperands(10.0, 20.2);
		c1.sum();
		c1.sumDecoPlus();
		c1.sumDecoMinus();
		/*		내부 내용 감춤, 보안 강화
		c1.left = 10.0;
		c1.right = 20.2;
		c1._sum();
		*/
	}

}
