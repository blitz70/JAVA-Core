package center.wiz.java09_class;

import java.util.ArrayList;
import java.util.Collection;

public class StudentListEx {

	private Collection<Student> studentListEx;
	
	public StudentListEx() {
		studentListEx = new ArrayList<Student>();
		System.out.println("과거 학생 목록 생성");
	}
	
	public void addStudent(Student student) {
		studentListEx.add(student);
		student.getStudent();
	}
	
}
