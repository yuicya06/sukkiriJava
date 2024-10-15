package sukkiri.practice.practice_print14.practice02;

//●Userクラス
//・フィールド　※アクセス修飾子はすべてprivate
//型	変数名・定数名
//String	name
//int	age
//・コンストラクタ
//　　　引数を2つ受け取り、フィールドにセット
//・メソッド
//　　equalsメソッド
//　　　：オーバーライドして、boolean型を返す。
//　　　　処理内容は、
//①	同じオブジェクトへの参照の場合、等しいとみなし、trueを返す。
//②	Userクラスのインスタンスである場合、名前と年齢が等しいなら等しい
//　　とみなし、trueを返す。
//③　①②以外はfalseを返す。
//各フィールドのgetter, setter

public class User {

	private String name;
	private int age;

	public User(String name, int age) {

		this.name = name;
		this.age = age;

	}

	@Override
	public boolean equals(Object o) {

		if (o instanceof User u) {

			if (u.name == name && u.age == age) {

				return true;
			}

		}
		return false;

	}

	/*getter/setter*/
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
