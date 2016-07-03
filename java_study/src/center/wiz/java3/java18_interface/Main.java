package center.wiz.java3.java18_interface;

public class Main {

	public static void main(String[] args) {
		Toy teddybear = new ToyTeddybear();
		Move teddybear1 = new ToyTeddybear();
		ToyTeddybear teddybear2 = new ToyTeddybear();
		Toy mazinger = new ToyMazinger();
		Toy airplane = new ToyAirplane();
		
		Toy[] toys = {
				airplane,
				mazinger,
				teddybear,
				teddybear1,
				teddybear2
		};
		for (int i = 0; i < toys.length; i++) {
			toys[i].toyName();;
		}
	}

}
