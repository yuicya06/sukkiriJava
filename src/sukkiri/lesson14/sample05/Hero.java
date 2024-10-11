package sukkiri.lesson14.sample05;


public class Hero {
	
	String name;
	int hp;
	
	/*14-9*/
	static int money; // 静的フィールド
	
	@Override
	public String toString() {
		return "名前：" + this.name + " / HP : " + this.hp;
	}
	
	/*14-7*/
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		
		if(o instanceof Hero h) {
			if(this.name.equals(h.name)) {
				return true;
			}
		}
		return false;
	}
	
	/*14-13*/
	public static void setRandomMoney() { //staticを付けたメソッド
		Hero.money = (int)(Math.random() * 1000);
	/*14-15*/
		System.out.println(this.name + "たちの所持金を初期化しました");
	}
	
	
	

	
	
	
}
