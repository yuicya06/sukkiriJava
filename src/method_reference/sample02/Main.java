package method_reference.sample02;

import java.util.function.Supplier;

public class Main {
	public static void main(String[] args) {
		// インスタンスのメソッドの参照
		MyClass myClassInstance = new MyClass();
		// インスタンスのメソッドを参照して値を取得
		Supplier<Integer> supplier = myClassInstance::generateRandomNumber;
		int randomNumber = supplier.get();
		System.out.println("Random number generated: " + randomNumber);
	}
}

class MyClass {
	// インスタンスのメソッド
	public int generateRandomNumber() {
		return (int) (Math.random() * 100);
	}
}