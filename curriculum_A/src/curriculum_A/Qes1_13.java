package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		/*
		 * 問１
		 * ９つの型をローカル変数として宣言
		 */
		byte byteKadai;
		// バイト型の宣言
		short shortKadai;
		// 短整数型の宣言
		int intKadai;
		// 整数型の宣言
		long longKadai;
		// 長整数型の宣言
		float floatKadai;
		// 単精度浮動小数点数型の宣言
		double doubleKadai;
		// 倍精度浮動小数点数型の宣言
		char charKadai;
		// 文字型の宣言
		String stringKadai;
		// 文字列型の宣言
		boolean booleanKadai;
		// ブーリアン型の宣言

		
		/*
		 * 問２
		 * ９つの型にそれぞれ初期値を代入
		 */
		byteKadai = 0;
		// バイト型変数の初期化
		shortKadai = 0;
		// 短整数型変数の初期化
		intKadai = 0;
		// 整数型変数の初期化
		longKadai = 0L;
		// 長整数型変数の初期化
		floatKadai = 0.f;
		// 単精度浮動小数点数型変数の初期化
		doubleKadai = 0.0d;
		// 倍精度浮動小数点数型変数の初期化
		charKadai = '\0';
		// 文字型変数の初期化
		stringKadai = null;
		// 文字列型変数の初期化
		booleanKadai = false;
		// ブーリアン型変数の初期化
		
		
		/*
		 * 問３
		 * ９つの変数に値を代入
		 */
		byteKadai = 10;
		// バイト型変数に代入
		shortKadai = 100;
		// 短整数型変数に代入
		intKadai = 1000;
		// 整数型変数に代入
		longKadai = 10000L;
		// 長整数型変数に代入
		floatKadai = 9.5f;
		// 単精度浮動小数点数型変数に代入
		doubleKadai = 10.5d;
		// 倍精度浮動小数点数型変数に代入
		charKadai = 'a';
		// 文字型変数に代入
		stringKadai = "ハロー";
		// 文字列型変数に代入
		booleanKadai = true;
		// ブーリアン型変数に代入
		
		
		/*
		 * 問４
		 * 宣言した変数を使ってコンソール出力
		 */
		System.out.println(byteKadai + shortKadai + intKadai + longKadai);
		// 11110が出力されるように出力する
		System.out.println(byteKadai + byteKadai);
		// 20が出力されるように出力する
		System.out.println(charKadai + stringKadai + booleanKadai);
		// a ハロー trueが出力されるように出力する
		System.out.println(byteKadai + shortKadai + intKadai + longKadai + floatKadai + doubleKadai);
		// 11130が出力されるように出力する　※宣言した変数の数字は全て足す
		System.out.println(byteKadai * shortKadai * intKadai * longKadai);
		// 10000000000が出力されるように出力する　※宣言した変数の小数点以外の数字は全てかける
		System.out.println(doubleKadai / shortKadai);
		// 10.5割る100をした結果を出力する
		System.out.println(byteKadai - shortKadai);
		// 10引く100をした結果を出力する
		
		
		/*
		 * 問5
		 * ハローJAVA43と表示するように訂正する
		 */
		String num="20";
		// 文字列型変数に20を代入
		int num1=23;
		// 整数型変数に23を代入
		System.out.println("ハローJAVA"+(Integer.parseInt(num)+num1));
		//文字列型変数を整数型変数へキャスト(強制変換)
		
		
		/*
		 * 問6
		 * 『山田太郎 18歳 170.5cm 62.2kg 寿司』の情報を変数に代入して出力する
		 */
		String name = "山田太郎";
		// 文字列型変数に名前を代入
		int age = 18;
		// 整数型変数に年齢を代入
		double height = 170.5;
		// 小数点型変数に身長を代入
		double weight = 62.2;
		// 小数点型変数に体重を代入
		String like = "寿司";
		// 文字列型変数に好きな食べ物を代入
		
		System.out.println("初めまして" + name + "です");
		// 名前を出力する
		System.out.println("年齢は" + age + "歳です");
		// 年齢を出力する
		System.out.println("身長は" + height + "cmです");
		// 身長を出力する
		System.out.println("体重は" + weight + "kgです");
		// 体重を出力する
		System.out.println("好きな食べ物は" + like + "です");
		// 好きな食べ物を出力する

		
		/*
		 * 問７
		 * 問６で作成した自己紹介に続いてBMIを変数を使って出力する
		 */
		double bmi = weight / ((height / 100) * (height / 100));
		// 小数点型変数bmiに値を代入する　※計算式　BMI=（体重kg）÷（身長m の二乗）
		// 身長はcmで代入しているのでmに値を変換する
		System.out.println("BMIは" + String.format("%.1f", bmi) + "です");
		// 問６の人のBMIを出力する
		// String.formatで小数点１位以下を切り捨て　第一引数が桁数、第二引数が変数	
		
		
		/*
		 * 問８
		 * 問題６で宣言した変数を再代入して出力する
		 */
		name = "鈴木一郎";
		// 文字列型変数に名前を再代入
		age = 24;
		// 整数型変数に年齢を再代入
		height = 168.5;
		// 小数点型変数に身長を再代入
		weight = 64.2;
		// 小数点型変数に体重を再代入
		like = "オムライス";
		// 文字列型変数に好きな食べ物を再代入
		bmi = weight / ((height / 100) * (height / 100));
		// 小数点型変数bmiに値を再代入する
		
		System.out.println("初めまして" + name + "です");
		// 名前を出力する
		System.out.println("年齢は" + age + "歳です");
		// 年齢を出力する
		System.out.println("身長は" + height + "cmです");
		// 身長を出力する
		System.out.println("体重は" + weight + "kgです");
		// 体重を出力する
		System.out.println("好きな食べ物は" + like + "です");
		// 好きな食べ物を出力する
		System.out.println("BMIは" + String.format("%.1f", bmi) + "です");
		// BMIを出力する
		
		
		/*
		 * 問９
		 * 問題８で宣言した変数の数値を和算で自己代入
		 */
		age += age;
		// 整数型変数に和算の自己代入
		height += height;
		// 小数点型変数に和算の自己代入
		weight += weight;
		// 小数点型変数に和算の自己代入
		bmi = weight / ((height / 100) * (height / 100));
		// 小数点型変数bmiに値を再代入する
		
		System.out.println("初めまして" + name + "です");
		// 名前を出力する
		System.out.println("年齢は" + age + "歳です");
		// 年齢を出力する
		System.out.println("身長は" + height + "cmです");
		// 身長を出力する
		System.out.println("体重は" + weight + "kgです");
		// 体重を出力する
		System.out.println("好きな食べ物は" + like + "です");
		// 好きな食べ物を出力する
		System.out.println("BMIは" + String.format("%.1f", bmi) + "です");
		// BMIを出力する
		
		
		/*
		 * 問１０
		 * 問題８で宣言した年齢が25歳以上の時にtrueを出力するようにする
		 * if分は使わない
		 */
		age = 24;
		// 問８の値を整数型変数に年齢を再代入
		height = 168.5;
		// 問８の値を小数点型変数に身長を再代入
		weight = 64.2;
		// 問８の値を小数点型変数に体重を再代入
		boolean ageCompare = age >= 25;
		// 変数ageの値が25以上かどうかを比較判断する
		System.out.println(ageCompare);
		// 比較結果を出力する		
		
		
		/*
		 * 問１１
		 * 問題８で宣言した年齢・身長・体重を文字列型に型変換して繋げて出力するようにする
		 */
		String strAge = String.valueOf(age);
		// 年齢を代入している整数型変数を文字列型に変換して新しく文字列型変数に代入
		String strHeight = String.valueOf(height);
		// 身長を代入している整数型変数を文字列型に変換して新しく文字列型変数に代入
		String strWeight = String.valueOf(weight);
		// 体重を代入している整数型変数を文字列型に変換して新しく文字列型変数に代入
		System.out.println(strAge + strHeight + strWeight);
		// 変換した変数を出力する		
		
		
		/*
		 * 問１２
		 * 問題１１で変換した年齢・身長を整数型に変換して出力する
		 */
		int ageGenerate = Integer.parseInt(strAge);
		// 問１１で宣言した文字列を整数型変数に変換して代入
		double heightGenerate = Double.parseDouble(strHeight);
		// 問１１で宣言した文字列を小数点型変数に変換して代入
		System.out.println(ageGenerate);
		// 変換した変数を出力する	
		System.out.println((int)heightGenerate);
		// 小数点型変数から整数型変数にキャストして出力する	
		
		
		/*
		 * 問１２
		 * 問題12で変換した年齢・身長を【年齢が25もしくは身長が160以上】であればtrueで出力
		 */
		ageCompare = (ageGenerate == 25) || (heightGenerate >= 160);
		// 問10で使ったブーリアン型変数を使い回し、上記の条件で比較（or）を行う
		System.out.println(ageCompare);
		// 比較結果を出力する	
	}
}
