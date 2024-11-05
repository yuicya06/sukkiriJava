package lambdaExpression.example.example02;

//自作のインタフェース Calculator
interface Calculator {
	int calculate(int a, int b);

}

public class Main {

	public static void main(String[] args) {

		// メソッドに匿名クラスを引数として渡す
		arithmeticCalculate("Anonymous", new Calculator() {
			@Override
			public int calculate(int a, int b) {
				return a + b;
			}
		});

		//メソッドにラムダ式を引数として渡す
		arithmeticCalculate("Lambda", (a, b) -> {
			return a + b;
		});
	}

	//
	//メソッドの引数として匿名クラスを受け取る例

	public static void arithmeticCalculate(String str, Calculator calculator) {
		int result = calculator.calculate(10, 5);
		System.out.println(str + ":" + +result);

	}

}
