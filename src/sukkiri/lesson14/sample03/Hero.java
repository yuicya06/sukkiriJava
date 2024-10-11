package sukkiri.lesson14.sample03;

public class Hero {

	String name;
	int hp;

	/*14-5*/
	//	Objectクラスの中にtoString()があるので再定義
//	@Override
//	public String toString() {
//		return "名前：" + this.name + " / HP : " + this.hp;
//	}

	/*14-7*/
	@Override
	public boolean equals(Object o) {
		//this は h1(自分の)のアドレス oは h2
		System.out.println("o:" + o);
		if (this == o) {
			return true;
		}
		
		System.out.println("a");
		
		/////////////////////////////////////
		if (o instanceof Hero h) {
			System.out.println("b");
			
			if (this.name.equals(h.name)) {
				return true;
			}
		}
		///////////////////////////////////
		
		
		//objectクラスのフィールドにはnameはない（エラー）
//		if(this.name.equls(o.name)) {
//			System.out.println("c");
//			return true;
//		}
		
		System.out.println("c");
		return false;
	}

}
