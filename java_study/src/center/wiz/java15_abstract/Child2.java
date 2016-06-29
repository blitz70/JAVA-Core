package center.wiz.java15_abstract;

public class Child2 extends LunchMenu{

	public Child2(PriceTable price) {
		super(price);
	}

	@Override
	public int calculating() {
		//기본 : 쌀밥 불고기 두부조림 미역국
		//간식 : 요플레 바나나 (우유 아몬드)
		return (milk + almond) + (rice +bulgogi +dubu_jorim +miyuk_guk);
	}

}
