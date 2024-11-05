package lambdaExpression.practice01;
/*未解決*/

//関数型インタフェースの定義
interface Calculator {
	double calculate(int a, int b);
}

public class Main {
	public static void main(String[] args) {
		/*匿名クラス*/
		//インスタンス生成部分に匿名クラスを使用
		Calculator additionAnonymous = new Calculator() {
			@Override
			public double calculate(int a, int b) {
				return a + b;
			}
		};
		double resultAnonymous = additionAnonymous.calculate(5, 5);

		//インスタンス生成部分にラムダ式を使用し、関数型インタフェースを実装
		/*ラムダ式*/
		Calculator calcLambda = calculate(int a, int b) -> a + b;
		double resultLambda = calcLambda.calculate(4 , 4);

		System.out.println("resultAnonymous:" + resultAnonymous);
		System.out.println("resultLambda :" + resultLambda);
	}
}