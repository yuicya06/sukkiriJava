package sukkiri.lesson09.sample08;


public class Main {

	public static void main(String[] args) {
		Hero h1 = new Hero("ミナト");
		System.out.println(h1.name);
		
		System.out.println("--------------");
		
		Hero h2 = new Hero();
		System.out.println(h2.name);

	}

}
