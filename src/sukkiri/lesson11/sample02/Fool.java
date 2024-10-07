package sukkiri.lesson11.sample02;

public class Fool extends Character implements Human {
	
	//Characterからhpやnameなどのフィールドを継承している
	//Characterから継承した抽象メソッドattack()を実装
	
	@Override
	public void attack(Matango m) {
		System.out.println(this.name + "は戦わず遊んでいる");		
	}	
	
	//さらにHumanから継承した４つの抽象メソッドを実装
	public void talk() {
		System.out.println(this.name + "は話す");
	}
	
	public void watch() {
		System.out.println(this.name + "は見る");
	}
	
	public void hear() {
		System.out.println(this.name + "は聞く");
	}
	
	public void run() {
		System.out.println(this.name + "は逃げる");
	}



}
