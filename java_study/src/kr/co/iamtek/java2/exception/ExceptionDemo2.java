package kr.co.iamtek.java2.exception;

//예외 처리 : finally

class A {
	public int[] arr = new int[3];
	A(){
		arr[0] = 0;
		arr[1] = 10;
		arr[2] = 20;
	};
	public void z(int first, int second) {
		try {
			System.out.println(arr[first]/arr[second]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		} catch (ArithmeticException e) {
			System.out.println(e.toString());
		} catch (Exception e) {		//general errors
			System.out.println(e.toString());
		} finally {	//꼭 실행 되는 로직, DB 접속해제 같은거
			System.out.println("Finally\n");
		}
	}
}

public class ExceptionDemo2 {	//Try catch finally
	public static void main(String[] args) {

		A a = new A();
		a.z(10, 1);	//오류가 복수의 경우 하나만 인식
		a.z(1, 0);
		a.z(2, 1);
	}

}
