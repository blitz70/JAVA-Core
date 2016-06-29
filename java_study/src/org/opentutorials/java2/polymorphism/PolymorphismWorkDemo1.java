package org.opentutorials.java2.polymorphism;

interface father{}
interface mother{}
interface religion{}
interface programmer{
	public String coding();
}
interface company{
	public String name();
}

class Steve implements father, religion, programmer, company{
	public String coding(){
		return "fast";
	};
	public String name(){
		return "Steve";
	}
}
class Rachel implements mother, religion, programmer, company{
	public String coding(){
		return "elegant";
	};
	public String name(){
		return "Rachel";
	}
}

public class PolymorphismWorkDemo1 {

	public static void main(String[] args) {

		programmer coder1 = new Steve();
		programmer coder2 = new Rachel();
		System.out.println(coder1.coding());
		System.out.println(coder2.coding());

		Steve person1 = new Steve();
		Rachel person2 = new Rachel();
		System.out.println(person1.name()+" codes "+person1.coding());
		System.out.println(person2.name()+" codes "+person2.coding());

	}

}
