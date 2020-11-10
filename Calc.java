package keisanki;
//計算クラス

public class Calc {

	public static int tasu(int i, int i2) {
		int ans = i + i2;
		System.out.println(ans);
		return ans;
	}

	public static int hiku(int i, int i2) {
		int ans = i - i2;
		System.out.println(ans);
		return ans;
	}

	public static int kake(int i, int i2) {
		int ans = i * i2;
		System.out.println(ans);
		return ans;
	}

	public static int waru(int i, int i2) {
		int ans = i / i2;
		System.out.println(ans);
		return ans;
	}
}
