package org.opentutorials.java2.generic;

class StudentInfo2 {
	int grade;
	StudentInfo2(int grade) {this.grade = grade;}
}
class EmployeeInfo2 {
	int rank;
	EmployeeInfo2(int rank) {this.rank = rank;}
}
class StudentPerson2 {
	StudentInfo2 info;
	StudentPerson2(StudentInfo2 info) {this.info = info;}
}
class EmployeePerson2 {
	EmployeeInfo2 info;
	EmployeePerson2(EmployeeInfo2 info) {this.info = info;}
}

class Person2 {		//중복 제거 StudentPerson EmployeePerson
	Object info;
	Person2(Object info) {this.info = info;}
}

public class GenericDemo2 {

	public static void main(String[] args) {
		StudentInfo2 i1 = new StudentInfo2(2);
		StudentPerson2 p1 = new StudentPerson2(i1);
		System.out.println(p1.info.grade);	//2
		
		EmployeeInfo2 i2 = new EmployeeInfo2(1);
		EmployeePerson2 p2 = new EmployeePerson2(i2);
		System.out.println(p2.info.rank);		//1

		EmployeePerson2 p3 = new EmployeePerson2(new EmployeeInfo2(10));
		EmployeeInfo2 i3 = p3.info;
		System.out.println(p3.info.rank);		//10
		
		Person2 p4 = new Person2("부장");
		System.out.println(p4.info);
		EmployeeInfo2 i4 = (EmployeeInfo2)p4.info;		//compile단계에서 검출되지 않는 error, p3의 필드를 세팅 못함.
	}
}
