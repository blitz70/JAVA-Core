
package kr.co.iamtek.java2.object;

public class Calculator4b {

	static int left,  right;
	
	static void setOperands(int l, int r){
		left = l;
		right = r;
	};

	static void sum() {
		System.out.println(left + right);
	};
	
	static void ave() {
		System.out.println((left + right)/2);
	};

	public static void main(String[] args) {
		
		setOperands(10,20);
		sum();
		ave();
		
		setOperands(20,40);
		sum();
		ave();
		
	};
}
