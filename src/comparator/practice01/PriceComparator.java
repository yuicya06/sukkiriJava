package comparator.practice01;

import java.util.Comparator;

//比較対象のクラスにはCoparatorは実装せず
//別のクラスを作成し実装する
//そして、型パラメータ<>に比較対象のインスタンスをしていする
//Comparableとcompare, compareToの引数の数が違う（自分自身を比べるかどうか的な）
public class PriceComparator implements Comparator<Product> {
	/*
		@Override
		public int compare(Product priceA, Product priceB) {
	
			//値段の比較
			//このまま返せない(戻り値はint型と決まっている)
			//キャスト(int)を使うと予期せぬ動きをする可能性がある
			
			double price = priceA.getPrice() - priceB.getPrice();
	
			if (price < 0) {
				return -1;
			} else if (price > 0) {
				return 1;
			} else {
				return 0;
			}
			
			
			
	
		}
		
		*/
	
	@Override
	public int compare(Product priceA, Product priceB) {

		//Doubleクラスのメソッドを使う
	
		return Double.compare(priceA.getPrice(), priceB.getPrice());
		
		//	public static int compare(double d1,double d2)
		//指定された2つのdouble値を比較します。返される整数値の符号は、次の呼出しで返される整数の符号と同じになります。
		//new Double(d1).compareTo(new Double(d2))
		//
		//パラメータ:
		//d1 - 比較する最初のdouble
		//d2 - 比較する2番目のdouble
		//戻り値:
		//d1がこのd2と同じ数値の場合は値0。d1がd2より小さい数値の場合は0より小さい値。
		//d1がd2より大きい数値の場合は0より大きい値。
		//導入されたバージョン:
		//1.4
		
		
		
		
	}

}
