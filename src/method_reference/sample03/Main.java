package method_reference.sample03;

import java.util.function.Supplier;

public class Main {
	public static void main(String[] args) {
		// コンストラクタの参照
		Supplier<MyClass> constructorRef = MyClass::new;
		// コンストラクタを使用して新しいインスタンスを生成
		MyClass instance = constructorRef.get();
		// インスタンスのメソッドを呼び出し
		instance.sayHello();
	}
}

class MyClass {
	public MyClass() {
		System.out.println("MyClassのコンストラクタが呼び出されました。");
	}

	public void sayHello() {
		System.out.println("Hello from MyClass!");
	}
}