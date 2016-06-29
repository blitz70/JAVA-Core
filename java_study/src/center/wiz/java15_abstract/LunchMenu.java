package center.wiz.java15_abstract;

public abstract class LunchMenu {

	//기본 : 쌀밥 불고기 두부조림 미역국
	int rice;
	int bulgogi;
	int dubu_jorim;
	int miyuk_guk;
	
	//간식 : 요플레 바나나 우유 아몬드
	int yogurt;
	int banana;
	int milk;
	int almond;
	
	public LunchMenu(PriceTable price) {
		this.rice = price.rice;
		this.bulgogi = price.bulgogi;
		this.dubu_jorim = price.dubu_jorim;
		this.miyuk_guk = price.miyuk_guk;
		this.yogurt = price.yogurt;
		this.banana = price.banana;
		this.milk = price.milk;
		this.almond = price.almond;
	}
	
	public abstract int calculating();

}
