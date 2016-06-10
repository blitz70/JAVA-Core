package kr.co.iamtek.java2.modifier_access.other;

public class Other {
	private void _private(){
		System.out.println("private other");
	};
	void _default(){
		System.out.println("default other");
	};
	protected void _protected(){
		System.out.println("protected other");
	};
	public void _public(){
		System.out.println("public other");
	};
}
