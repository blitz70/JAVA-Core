package kr.co.iamtek.java2.modifier_interface;

class Calculator2 implements CalculatorInterface{		//interface 약속에 따라 Calculator 업데이트

	double first, second, third;
	public void setOperands(double first, double second, double third){
		this.first = first;
		this.second = second;
		this.third = third;
	};
	public double sum(){
		return (this.first + this.second + this.third);
	};
	public double ave(){
		return (this.first + this.second + this.third)/2;
	};
	
}
