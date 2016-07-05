package center.wiz.java3.java25_exception;

public class Throws {
	
	public Throws() {
		actionC();
	}
	
	private void actionA() throws Exception {	//throws 없어도 정상적으로 실행..?
		System.out.println("actionAstart");	//3
		int[] iArr = {1, 2, 3, 4};
		System.out.println(iArr[4]);
		System.out.println("actionAend");	//미실행
	}
	
	private void actionB() {
		System.out.println("actionBstart");	//2
		try {
			actionA();
		} catch (Exception e) {
			System.out.println("예외는 여기서 처리 : " + e.getMessage());	//4
		}
		System.out.println("actionBend");	//5
	}
	
	private void actionC() {
		System.out.println("actionCstart");	//1
		actionB();
		System.out.println("actionCend");	//6
	}

}
