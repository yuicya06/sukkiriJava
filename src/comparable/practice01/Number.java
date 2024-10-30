package comparable.practice01;


//比較対象でなく、別のクラスにComparableを実装
public class Number implements Comparable <Number>{

	private int value;

	public Number(int value) {
		setValue(value);
	}

	@Override
	public int compareTo(Number n) {

		return  getValue() - n.getValue();

	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
