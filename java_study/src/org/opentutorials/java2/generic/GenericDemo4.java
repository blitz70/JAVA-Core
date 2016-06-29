package org.opentutorials.java2.generic;

interface Info {
	 int getLevel();
}

class EmployeeInfo4 implements Info {
	int rank;
	EmployeeInfo4(int rank) {this.rank = rank;}
	public int getLevel() {
		return this.rank;
	}
}
class Person4<T extends Info > {	//class generic, Info의 자식 클래스, interface도 가능
	T info;
	Person4(T info) {this.info = info;}
}

public class GenericDemo4 {

	public static void main(String[] args) {
		EmployeeInfo4 i = new EmployeeInfo4(1);
		Person4 p1 = new Person4(i);	//가능, EmployeeInfo는 Info의 자식임
		//Person4<String> p2 = new Person4<String>("부장");		//error, String는 Info의 자식이 아님
	}
}
