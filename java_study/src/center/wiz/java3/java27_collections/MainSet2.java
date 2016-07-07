package center.wiz.java3.java27_collections;

import java.util.HashSet;

class Student {
	
	private String name;
	private int grade;
	
	public Student(String name, int grade) {
		super();
		this.name = name;
		this.grade = grade;
	}
	@Override
	public String toString() {
		//return super.toString();			//열라 긴 내용
		return name + " : " + grade;		//홍길동 : 3, 장보고 : 1, 이순신 : 6]
	}
	@Override
	public boolean equals(Object obj) {
		return (this.toString()).equals(obj.toString());
	}
	@Override
	public int hashCode() {
		return toString().hashCode();
	}	
}

public class MainSet2 {

	public static void main(String[] args) {
		HashSet<Student> set = new HashSet<Student>();
		set.add(new Student("홍길동", 3));
		set.add(new Student("이순신", 6));
		set.add(new Student("장보고", 1));
		System.out.println(set);
		
		Student s = new Student("이순신", 6);
		set.remove(s);
		System.out.println(set);
	}

}
