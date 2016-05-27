package kr.co.iamtek.java2.accessmodifier.same;
import kr.co.iamtek.java2.accessmodifier.other.*;

class SameClassChecker{
	public SameClassChecker(){	
		this._public();
		this._protected();
		this._default();
		this._private();
	};
	private void _private(){
		System.out.println("private");
	};
	void _default(){
		System.out.println("default");
	};
	protected void _protected(){
		System.out.println("protected");
	};
	public void _public(){
		System.out.println("public");
	};
};

class SameChildClassChecker extends Same {
	public SameChildClassChecker(){
		this._public();
		this._protected();
		this._default();
		//this._private();
	};
};

class OtherChildClassChecker extends Other {
	public OtherChildClassChecker(){
		this._public();
		this._protected();
		//this._default();
		//this._private();
	};
};

public class ClassMemberhecker {

	public static void main(String[] args) {

		System.out.println("-----same class");
		SameClassChecker checker1 = new SameClassChecker();
		
		System.out.println("-----same package");
		Same checker2 = new Same();
		checker2._public();
		checker2._protected();
		checker2._default();
		//checker2._private();		//error

		System.out.println("-----same package inherited class");
		SameChildClassChecker checker3 = new SameChildClassChecker();

		System.out.println("-----other package inherited class");
		OtherChildClassChecker checker4 = new OtherChildClassChecker();

		System.out.println("-----other package");
		Other checker5 = new Other();
		checker5._public();
		//checker5._protected();
		//checker5._default();
		//checker5._private();
	}

}
