package curriculum_B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {
	
	public static void main(String[] args) throws IOException {
		
		/*
		 * Q１~Q２までの内容
		 * 名前を入力する機能
		 */
		System.out.println("「名前を入力してください」");
		// ”名前を入力してください”と表示する	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 文字を入力できるようにする処理
		String name = br.readLine();
		// 	入力した文字をStr型変数に代入する
		
		
		if(name.matches("^[A-Za-z0-9]+$")) {
			// 入力した文字が半角英数字か判別し、ネストでtrueなら下記の条件処理を行う matchesが正規表現のパターンをチェックするメソッド
			if(name.length() > 10 ) {
				System.out.println("「名前を10文字以内にしてください」");
				// 入力した文字が10文字を超える場合は上記の文字を表示する　lengthは入力した文字の数を指す
			}else if(name.length() <= 0 || name == null) {
				System.out.println("「名前を入力してください」");
				// 入力した文字が０以下またはnull(空)値の場合は上記の文字を表示する
			}else {
				System.out.println("ユーザー名「" + name + "」を登録しました");
				// 正常に入力された場合は入力された値を表示する
			}
		}else{
			System.out.println("「半角英数字のみで名前を入力してください」");
			// 半角英数字意外を入力した場合は上記の文字を表示する
		}
		
		
		/*
		 * Q３からの内容
		 * じゃんけん機能の追加
		 */
		int user = getUser();
		// ユーザーの手を入れるメソッド　0~2で入力してもらう
		int pc = getPc();
		// エネミーの手を入れるメソッド　乱数で決める
		int count = getCount();
		// エネミーの手を入れるメソッド　乱数で決める
//		String result = judgeJanken(user,pc,count);
		// じゃんけんの勝敗を判定するメソッド
		showResult(user,pc,count,name);
		// じゃんけんの結果を表示するメソッド
	}
	
	
	public static int getCount() {
		int count = 0;
		// 勝利するまでの変数を初期化
		return count;
		// 初期化した値を返す。
	}
	
	
	public static int getUser() {
		Scanner numJanken = new Scanner(System.in);
		// じゃんけん入力の準備 scannerクラスは取得した入力情報使って処理する場合などに使う
		
		while(true) {
		// 無限ループの処理
			System.out.println("じゃんけんの手を入力して下さい");
			System.out.print("(グー：0，チョキ：1、パー：2)　--> ");
			if(numJanken.hasNextInt()) {
			// 入力された文字が整数かどうかをチェック
				int number = numJanken.nextInt();
				// 入力されたデータが整数として読み込む
				if(number < 0 || number > 2) {
				// 入力された整数が０、１、２かチェックする
					System.out.println("入力できるのは「0~2」までです。");
					// 0未満3以上の整数が入力された場合上記を表示する
					// 0はグー、1：チョキ、2：パー
					continue;
					// 以降の処理をスキップしてループ処理に戻る
				}else {
					return number;
					// ０〜２であればメソッドを抜ける。
				}
			}else {
			// 入力された文字が整数ではない場合の処理
				System.out.println("入力できるのは整数だけです。");
				// 整数以外が入力された場合上記を表示する
				numJanken.next();
				//不要なトークンをバッファから取り除く ※空白までの文字を取得する
			}
			numJanken=null;
		}
	}
	
	
	public static int getPc() {
		Random rand = new Random();
		// Randomクラスで正の整数で指定範囲の乱数を生成する
		return rand.nextInt(3);
		// ０〜２までの整数をランダムで生成して結果として返す
	}
	
	
	public static void showResult(int user,int pc,int count,String name) {
		String[][] jankenJudge= {
		// 二次元配列でじゃんけんの勝敗を判定する
		//			[コンピューターの手]
		// 			グー(0)　チョキ(1)　パー(2)
		// グー(0)	あいこ	勝ち		　負け
		// チョキ(1)	負け		あいこ	　勝ち
		// パー(2)　	勝ち		負け		　あいこ
		// [↑ユーザーの手]
				{"DRAW あいこ もう一回しましょう！","やるやん。次は俺にリベンジさせて","俺の勝ち！負けは次につながるチャンスです！ネバーギブアップ！"},
				{"俺の勝ち！なんで負けたか、明日まで考えといてください。そしたら何かが見えてくるはずです","DRAW あいこ もう一回しましょう！","やるやん。次は俺にリベンジさせて"},
				{"やるやん。次は俺にリベンジさせて","俺の勝ち！たかがじゃんけん、そう思ってないですか？それやったら次も、俺が勝ちますよ","DRAW あいこ もう一回しましょう！"}
		};
		
		String[] janken= {"グー","チョキ","パー"};
		// じゃんけんの手を配列で定義
		
		while(true) {
			count++;
			//　勝つまでカウントをインクリメント
			System.out.println(name + "の手は「" + janken[user] +"」");
			System.out.println("相手の手は「" + janken[pc] + "」");
			// お互いの手を表示する
			
			if((user == 0 && pc == 1) ||
		       (user == 1 && pc == 2) ||
		       (user == 2 && pc == 0)) {
			// 上記の勝ち手の場合は下記の処理を行う
				System.out.println(jankenJudge[user][pc]);
				// 配列に入っている文字列を出力
				System.out.println("勝つまでにかかった合計回数は" + count + "回です");
				// 勝利までのカウントを出力
				break;
				// 勝ったので処理を終わらせる
			}else {
				System.out.println(jankenJudge[user][pc]);
				// 配列に入ってる文字列を出力
				getUser();
				// もう一度入力処理に戻る
				getPc();
				// もう一度エネミーの手をランダム生成する処理に戻る
			}
		}
	 }
	
}
