package sukkiri_re.lesson05.practice_print05.practice11;

public class Main {

	//	問11　次のメソッドがある。呼び出すときに「10」を渡した場合の戻り値を答えなさい。
	//	　　　ただし、実行せずに処理内容を考えて導き出してください。
	public static int function(int n) {
		if(n==1) {
			return 1;
		}else {
			return n + function(n-1);
		}
		
	}

	public static void main(String[] args) {
		System.out.println(function(10001));
		

	}

}
