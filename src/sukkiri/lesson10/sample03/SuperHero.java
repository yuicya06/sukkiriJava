package sukkiri.lesson10.sample03;

public class SuperHero extends Hero {
	
	//10-9
	@Override
	public void attack(Matango m) {
		super.attack(m);
		if(this.flying) {
			super.attack(m);
		}
	}
	
	
	
	
	
	
	boolean flying;
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
		
	}

	public void land() {
		this.flying = false;
		System.out.println("着地した！");
		
	}
	
	@Override
	public void run() {
		System.out.println(this.name + "は撤退した");
	}


}
