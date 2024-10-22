package file_operation.practice.practice_print06;

public class Calculation {
	int first_num;
	int second_num;
	
	/*コンストラクタ*/
	public Calculation(int first_num,int second_num) {
		this.first_num = first_num;
		this.second_num = second_num;
	}
	
	//メインで受け付けた数値をもとに計算式を返す
	public String div() {
		int result = this.first_num / this.second_num;
		return this.first_num +" / "+this.second_num+" = "+result;
	}


}
