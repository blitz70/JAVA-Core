package kr.co.iamtek.java2.exception;

class Calculator{
	int left, right;		//double로 하면 /0 지원
	
	public void setOperands(int left, int right){
		this.left = left;
		this.right = right;
	}
	public void div(){
		try {
			System.out.println("계산 결과는 ");
			System.out.println(this.left/this.right);
			System.out.println(" 입니다.");
			
		} catch (Exception e) {
			System.out.println("\n3: e.printStackTrace()");
			e.printStackTrace();	//처음 실행하면 정상인데 다시 실행하면 결과가 늦음?
			System.out.println("\n1: e.getMessage()\n" + e.getMessage());
			System.out.println("\n2: e.toString()\n" + e.toString());
		}
		System.out.println("Divide End");
	}
	/*
	Exception in thread "main" 계산 결과는 
	java.lang.ArithmeticException: / by zero
		at kr.co.iamtek.java2.exception.Calculator.div(ExceptionDemo1.java:12)
		at kr.co.iamtek.java2.exception.ExceptionDemo1.main(ExceptionDemo1.java:35)
	*/
}

public class ExceptionDemo0 {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		c1.setOperands(10, 0);
		c1.div();

	}

}
