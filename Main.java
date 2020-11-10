package keisanki;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("計算を行います");

		System.out.println("一つ目の数字を入力してください");
		int i = new java.util.Scanner(System.in).nextInt();

		System.out.println("2つ目の数字を入力してください");
		int i2 = new java.util.Scanner(System.in).nextInt();

		System.out.println("計算式を選択して");
		System.out.println("足し算:1 引き算:2 掛け算:3 割り算:4");
		int ape = new java.util.Scanner(System.in).nextInt();

		switch (ape) {
		case 1:
			Calc.tasu(i, i2);
			break;
		case 2:
			Calc.hiku(i, i2);
			break;
		case 3:
			Calc.kake(i, i2);
			break;
		case 4:
			Calc.waru(i, i2);
			break;
		}

	}//main

}//class
	//二つの数字を作る(箱作る)
	//演算子を配列で用意する(+(タス).-(ヒク).*(カケル).%(ワル))
	//その二つを呼び出して計算する(メソッド呼び出し)
	//
	//
	//
	//
	//
	//
