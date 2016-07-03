package center.wiz.java3.java19_designpattern_singleton;

public class SingletonClass {

	private static SingletonClass SINGLETON = new SingletonClass();
	public int i = 10;
	
	private SingletonClass() {
		
	}
	
	public static SingletonClass getSingleton() {
		if (SINGLETON == null) {
			SINGLETON = new SingletonClass();
		}
		return SINGLETON;
	}
	
	public int get() {
		return i;
	}
	
	public void setI (int i) {
		this.i = i;
	}
	
}
