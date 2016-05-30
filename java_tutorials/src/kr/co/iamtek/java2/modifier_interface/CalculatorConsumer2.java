package kr.co.iamtek.java2.modifier_interface;

class CalculatorTest2 implements CalculatorInterface{	//interface 약속에 따라 임시 클래스 정의

	public void setOperands(double first, double second, double third){};
	public double sum(){return 60;};
	public double ave(){return 20;};
};

public class CalculatorConsumer2 {

	public static void main(String[] args) {
		//Calculator가 업데이트 되는 동안 개발
		CalculatorTest2 c1 = new CalculatorTest2();
		c1.setOperands(15, 20, 25);
		System.out.println(c1.sum());
		System.out.println(c1.ave());
		
		//Calculator 업데이트 완료후 적용
		Calculator2 c2 = new Calculator2();
		c2.setOperands(15, 20, 25);
		System.out.println(c1.sum());
		System.out.println(c1.ave());
		
	}

}
