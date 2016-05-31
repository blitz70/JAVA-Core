package kr.co.iamtek.java2.exception;

class A {
	private int[] arr = new int[3];
	A(){
		arr[0] = 0;
		arr[1] = 10;
		arr[2] = 20;
		//arr[3] = 30;
		//arr[4] = 40;
	};
	public void z(int first, int second) {
		try {
			System.out.println(arr[first]/arr[second]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		} catch (ArithmeticException e) {
			System.out.println(e.toString());
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}

public class ExceptionDemo1 {
	public static void main(String[] args) {

		A a = new A();
		a.z(10, 0);	//오류가 복수의 경우 하나만 인식
		a.z(1, 0);
	}

}
