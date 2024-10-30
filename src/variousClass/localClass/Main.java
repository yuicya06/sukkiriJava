package variousClass.localClass;

public class Main {
	static void method(final int x) {
		
		
		class Local {
			int oddAbs(int t) {
				return (t % 2 == 0 ? t : -t);
			}
		}
		
		
		Local lc = new Local();
		int y = lc.oddAbs(x);
		System.out.printf("x=%d y=%d\n", x, y);

	}

	public static void main(String[] args) {
		method(3);
	}

}
