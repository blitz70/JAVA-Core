package kr.co.iamtek.java2.classinstance;

class C1 {
	static String class_variable = "class variable";	//class variable
	String instance_variable = "instance variable";	//instance variable
	
	static void class_method_class() {				//class method & class variable
		System.out.println(class_variable);
	};
	static void class_method_instance() {			//class method & instance variable
		//System.out.println(instance_variable);
	};
	void instance_method_class() {						//instance method & class variable
		System.out.println(class_variable);
	};
	void instance_method_instance() {					//instance method & instance variable
		System.out.println(instance_variable);
	};
}

public class Classmember {

	public static void main(String[] args) {
		
		C1 c = new C1();
		
		c.class_method_class();			//instance-class method OK, class method-class variable OK
		//c.class_method_instance();		//instance-class method OK, class method-instance variable NOTOK
		c.instance_method_class();		//instance-instance method OK, instance method-class variable OK
		c.instance_method_instance();	//instance-instance method OK, instance method-instance variable OK
		C1.class_method_class();		//class-class method OK, class method-class variable OK
		//C1.class_method_instance();	//class-class method OK, class method-instance variable NOTOK
		//C1.instance_method_class();	//instance-class method NOTOK
		//C1.instance_method_instance();	//instance-instance method  NOTOK
	}

}
