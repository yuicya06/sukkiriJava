package sukkiri.lesson14.sample05;

public class Main {

	public static void main(String[] args) {
		
		/*14-14*/
		Hero.setRandomMoney();
		System.out.println(Hero.money); //ランダムな金額を表示
		Hero h1 = new Hero();
		System.out.println(h1.money); //同じ額を表示

	}

}
