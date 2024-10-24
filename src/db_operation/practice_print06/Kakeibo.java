package db_operation.practice_print06;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Kakeibo {

	//	・フィールド
	//	家計簿テーブルの列数だけ用意する
	//	※日付はjava.util.Date型

	private Date date;
	private String item;
	private String memo;
	private int deposit;
	private int withdrawal;

	/*コンストラクタ*/
	public Kakeibo(Date date, String item, String memo,int deposit, int withdrawl) {
		setDate(date);
		setItem(item);
		setMemo(memo);
		setDeposit(deposit);
		setWithdrawal(withdrawl);

	}

	/*メソッド*/
	public String formatter(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		return sdf.format(date);
	}
	
	
	public void show() {
		
//		======================
//				日付　：2022-02-03
//				費目　：食費
//				メモ　：コーヒーを購入
//				入金額：0
//				出金額：380
//		======================
		
		System.out.println("======================");
		System.out.println("日付　：" + formatter(getDate()));
		System.out.println("" +getItem());
		System.out.println("" +getMemo());
		System.out.println("" +getDeposit());
		System.out.println("" +getWithdrawal());
		System.out.println("======================");
		

	}

	/*getter/setter*/
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}

	public int getWithdrawal() {
		return withdrawal;
	}

	public void setWithdrawal(int withdrawal) {
		this.withdrawal = withdrawal;
	}

}
