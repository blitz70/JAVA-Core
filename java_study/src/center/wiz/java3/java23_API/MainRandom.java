package center.wiz.java3.java23_API;

import java.util.Random;

public class MainRandom {

	public static void main(String[] args) {

		double rn1 = Math.random();
		System.out.println(rn1);
		
		Random rn = new Random();
		int rn2 = rn.nextInt(100);
		System.out.println(rn2);
		
	}

}
