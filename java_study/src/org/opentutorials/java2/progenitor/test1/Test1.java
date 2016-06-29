package org.opentutorials.java2.progenitor.test1;
import org.opentutorials.java2.progenitor.test2.*;

public class Test1 extends Test2{

	public static void main(String[] args) {
		Test2 t1 = new Test2();
		//t1.meth();	//error, visibility
		Test1 t2 = new Test1();
		t2.meth();		//normal
	}
}
