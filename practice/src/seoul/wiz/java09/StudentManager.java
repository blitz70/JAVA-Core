package seoul.wiz.java09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class StudentManager {

	Collection<Student> students = new ArrayList<Student>();
	StudentListEx studentListEx = new StudentListEx();

	private void addStudent(String name, int age, int num, String major) {
		Student studentNew = new Student(name, age, num, major);
		students.add(studentNew);
		System.out.println(name+" 신규 학생 등록 완료.");
	}
	
	public static void main(String[] args) {
		
		StudentManager studentManager = new StudentManager();
		studentManager.addStudent("홍길동", 22, 20100001, "연극");
		studentManager.addStudent("홍길순", 24, 20100002, "수학");
		studentManager.addStudent("이은경", 21, 20100003, "국문");
		studentManager.addStudent("김철수", 23, 20100004, "체육");
		studentManager.addStudent("김순희", 26, 20100005, "무용");
		
		((ArrayList<Student>) studentManager.students).get(0).getStudent();
		Iterator<Student> list = studentManager.students.iterator();
		while(list.hasNext()) {
			list.next().getStudent();
		}
	}

}
