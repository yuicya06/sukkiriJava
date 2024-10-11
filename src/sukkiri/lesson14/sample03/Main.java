package sukkiri.lesson14.sample03;

public class Main {

	public static void main(String[] args) {
		/*14-4*/
//		Hero h = new Hero();
//		h.name = "ミナト";
//		h.hp = 100;
//		
//		System.out.println(h.toString());
		
		/*14-6*/
		/*一人目の勇者*/
		Hero h1 = new Hero();
		h1.name = "ミナト";
		h1.hp = 100;
		
		/*二人目の勇者*/
		Hero h2 = new Hero();
		h2.name = "ミナト";
		h2.hp = 100;
		
		
		/*3人目の勇者*/
//		Hero h3 = new Hero();
//		h2.name = "アサガ";
//		h2.hp = 100;
		
		
//		h2 = h1; //同じアドレスとなる
		
		if(h1.equals(h2)) {
			System.out.println("同じ内容です");
		} else {
			System.out.println("違う内容です");
		}
		
		if(h1 == h2) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		
		
		
		

	}

}
