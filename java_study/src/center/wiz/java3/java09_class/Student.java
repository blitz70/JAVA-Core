package center.wiz.java3.java09_class;

public class Student {

	// student data
	private String name;
	private int age;
	private int num;
	private String major;

	public Student() {

	}

	public Student(String name, int age, int num, String major) {
		super();
		this.name = name;
		this.age = age;
		this.num = num;
		this.major = major;
		System.out.println("학생:"+name + " 추가");
	}

	public void setStudent(String option, String info) {
		switch (option) {
		case "name":
			setName(info);
			break;

		case "age":
			setAge(Integer.parseInt(info));
			break;

		case "num":
			setNum(Integer.parseInt(info));
			break;

		case "major":
			setMajor(info);
			break;

		default:
			break;
		}
		System.out.println("학생:"+name +"의 "+option + " 수정");
	}

	public void getStudent() {
		System.out.println("이름:" + getName() + "나이:" + getAge() + "학번:" + getNum() + "전공:" + getMajor());
	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private int getAge() {
		return age;
	}

	private void setAge(int age) {
		this.age = age;
	}

	private int getNum() {
		return num;
	}

	private void setNum(int num) {
		this.num = num;
	}

	private String getMajor() {
		return major;
	}

	private void setMajor(String major) {
		this.major = major;
	}

}
