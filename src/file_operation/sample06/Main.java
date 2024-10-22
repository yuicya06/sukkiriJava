package file_operation.sample06;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		

		CsvOperation co = new CsvOperation();
		ArrayList<Animal> list = new ArrayList<>();

		list = co.CsvFileReader();

		for (Animal animal : list) {
			animal.show();
		}

		int count = co.CsvFileWriter(list, "file\\AnimalData3.txt");

		if (count == 1) {
			System.out.println("書き込みました");
		} else {
			System.out.println("書き込みませんでした");
		}

		System.out.println("-------------------");

		//list = null; //参照なし
		list.clear();// 要素を空にする（参照はある）
		System.out.println(list);

		list = co.CsvFileReader("file\\AnimalData3.txt");

		for (Animal animal : list) {
			animal.show();
		}

	}

}
