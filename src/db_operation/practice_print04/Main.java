package db_operation.practice_print04;

public class Main {

	public static void main(String[] args) {
		DbOperation db = new DbOperation();
		db.connect();
		db.select();
		db.disconnect();
	}

}
