package org.opentutorials.java2.progenitor;

class Student1 implements Cloneable {
	String name;
	Student1(String name) {
		this.name = name;
	}
	public Student1 clone() throws CloneNotSupportedException {	//Student 클래스 복제
		return (Student1)super.clone();
	};
    public String toString() {
        return this.name + ":" + super.toString();
    }
}

public class Progenitor_clone1{

	public static void main(String[] args) {
		Student1 s1 = new Student1("blitz");
		try {
			Student1 s2 = s1.clone();
			System.out.println(s1.toString());
			System.out.println(s2.toString());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
