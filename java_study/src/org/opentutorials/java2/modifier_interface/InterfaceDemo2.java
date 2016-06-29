package org.opentutorials.java2.modifier_interface;

interface I1{
	public void x();
	public void y();
};

interface I2{
	public void z();
};

interface I3 extends I1{		//interface 상속
	public void a();
	//private void b();			//error, interface method can't be private, 반드시 public? 
}

class C1 implements I1, I2{	//복수의 interface를 동시에 한개의 클래스로 구현 가능.
	public void x(){};
	public void y(){};
	public void z(){};
}

class C2 implements I3{

	public void x() {};

	public void y() {};

	public void a() {};

}

