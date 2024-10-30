package comparator.practice01;

import java.util.ArrayList;
import java.util.Collections;


//オブジェクト同士の比較、並び替え
//【補助プリント】comparable・comparator.pdf　を参考にする

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Product> price = new ArrayList<>();
		price.add(new Product("Laptop", 899.99));
		price.add(new Product("Phone", 599.99));
		price.add(new Product("Tablet", 349.99));

		PriceComparator pc = new PriceComparator();
		Collections.sort(price, pc);// 昇順
		
		for(Product p : price) {
			System.out.printf("Product:%s Product:%s", p.getName(), p.getPrice());
			System.out.println();
		}
		
		System.out.println("------------");
		
		Collections.sort(price, Collections.reverseOrder(pc)); //降順
		for(Product p : price) {
			System.out.printf("Product:%s Product:%s", p.getName(), p.getPrice());
			System.out.println();
		}
		
		
	}

}
