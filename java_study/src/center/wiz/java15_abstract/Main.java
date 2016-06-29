package center.wiz.java15_abstract;

public class Main {
	
	public static void main(String[] args) {
		
		PriceTable price = new PriceTable();
		LunchMenu child1 = new Child1(price);
		LunchMenu child2 = new Child2(price);
		
		System.out.println("child1 아이의 식대: " + child1.calculating());
		System.out.println("child2 아이의 식대: " + child2.calculating());
	}

}
