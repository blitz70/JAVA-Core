package kr.co.iamtek.java_tutorials.operator;

public class 단항연산자 {	//unary operator, a + b 는 binary operator

	public static void main(String[] args) {
		int i = 3;
		i++;
		System.out.println(i);		//4
		++i;
		System.out.println(i);		//5
		System.out.println(++i);	//6
		System.out.println(i++);	//6
		System.out.println(i);		//7
		int b=0;
		System.out.println( b---b );	//1
	}

}
