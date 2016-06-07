package kr.co.iamtek.java2.generic;

class EmployeeInfo3 {
	int rank;
	EmployeeInfo3(int rank) {this.rank = rank;}
}
class Person3<T, S> {	//class generic, 복수
	T info;
	S id;
	Person3(T info, S id) {
		this.info = info;
		this.id = id;
	}
	public <U> void printInfo (U info) {	//method generic
		System.out.println(info);
	}
}

public class GenericDemo3 {

	public static void main(String[] args) {
		EmployeeInfo3 i = new EmployeeInfo3(4);
		Integer id = new Integer(2);
		Person3<EmployeeInfo3, Integer> p1 = new Person3<EmployeeInfo3, Integer>(i, id);
		System.out.println(p1.id.intValue());
		System.out.println(p1.info.rank);
		p1.<EmployeeInfo3>printInfo(i);
		Person3 p2 = new Person3(i, id);		//인자를 통해 generic 파악 가능
		p2.printInfo(i);
	}
}
