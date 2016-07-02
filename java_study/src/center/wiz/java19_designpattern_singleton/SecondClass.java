package center.wiz.java19_designpattern_singleton;

public class SecondClass {

	public SecondClass() {
		SingletonClass singleton = SingletonClass.getSingleton();
		System.out.println("SecondClass");
		System.out.println("i = " + singleton.get());
	}
	
}
