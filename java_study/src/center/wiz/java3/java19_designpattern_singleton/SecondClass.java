package center.wiz.java3.java19_designpattern_singleton;

public class SecondClass {

	public SecondClass() {
		SingletonClass singleton = SingletonClass.getSingleton();
		System.out.println("SecondClass");
		System.out.println("i = " + singleton.get());
	}
	
}
