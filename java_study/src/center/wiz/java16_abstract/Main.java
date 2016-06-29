package center.wiz.java16_abstract;

public class Main {

	public static void main(String[] args) {
		//object 방식으로 재설계
		StarCar low = new StarCarLow(CarSpecs.COLOR_BLUE, CarSpecs.TIRE_NORMAL, CarSpecs.DISPLACEMENT_2000, CarSpecs.HANDLE_NORMAL);
		StarCar hi = new StarCarHi(CarSpecs.COLOR_RED, CarSpecs.TIRE_WILD, CarSpecs.DISPLACEMENT_2200, CarSpecs.HANDLE_POWER);
		
		low.getSpec();
		hi.getSpec();
	}

}
