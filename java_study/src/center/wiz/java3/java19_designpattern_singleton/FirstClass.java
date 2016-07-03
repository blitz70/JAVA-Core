package center.wiz.java3.java19_designpattern_singleton;

public class FirstClass {

	public FirstClass() {
		SingletonClass singleton = SingletonClass.getSingleton();
		System.out.println("FirstClass");
		System.out.println("i = " + singleton.get());
		singleton.setI(200);
		System.out.println("i = " + singleton.get());
	}
	
}
