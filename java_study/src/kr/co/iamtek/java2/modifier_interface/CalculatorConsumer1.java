package kr.co.iamtek.java2.modifier_interface;

class CalculatorTest1 {	//Calculator가 업데이트 되는 동안 사용될 임시 클래스

	public void setOperands(double first, double second, double third){};
	public double sum(){return 60;};
	public double ave(){return 20;};
};

public class CalculatorConsumer1 {

	public static void main(String[] args) {
		//Calculator가 업데이트 되는 동안 개발
		CalculatorTest1 c1 = new CalculatorTest1();
		c1.setOperands(15, 20, 25);
		System.out.println(c1.sum());
		System.out.println(c1.ave());
		
		//Calculator 업데이트 완료후 적용
		Calculator1 c2 = new Calculator1();
		//c2.setOperands(15, 20, 25);				//error
		//System.out.println(c2.sum()+c2.ave());	//error
		
	}

}
