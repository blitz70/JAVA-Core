package kr.co.iamtek.java2.progenitor;

class Student {
	String name;
	Student(String name) {
		this.name = name;
	}
    public boolean equals(Object obj) {	//strict 비교 -> simple 비교 
        Student _obj = (Student)obj;	//obj는 name이 없음, Student로 형변환
        //System.out.println(this.name+" "+s.name);
        return (this.name == _obj.name);
    }
}

public class Progenitor_equals1 {

	public static void main(String[] args) {
		Student s1 = new Student("blitz");
		Student s2 = new Student("blitz");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}

}
