package sukkiri_re.lesson15.practice_print15.practice01;

public class Main {

	//	問1　下記表はA君のテストの点数です。
	//	各科目を要素の値に持つString型の配列subjectと、
	//	各点数を要素の値に持つint型の配列scoreを作り、
	//	実行結果のような表示をしてください。
	//	英語	国語	数学	社会	理科
	//	 5	80	60	100	55
	//
	//	実行結果例
	//	英語：  5
	//	国語： 80
	//	数学： 60
	//	社会：100
	//	理科： 55

	public static void main(String[] args) {
		String[] subject = { "英語", "国語", "数学", "社会", "理科" };
		int[] score = { 5, 80, 60, 100, 55 };

		for (int i = 0; i < subject.length; i++) {
			System.out.printf("%s：%3d\n", subject[i], score[i]);
		}

	}

}
