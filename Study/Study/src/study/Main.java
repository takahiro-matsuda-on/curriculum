//package study;
//
//import java.util.ArrayList;
//import java.util.LinkedHashMap;
//import java.util.List;
//
///**
// * 本問題では、コレクションフレームワークのList系クラスとMap系クラスの基本的な記述を学びましょう。
// * 現場で必ず使用するものなので、ポイントをしっかり押さえておきましょう。
// *
// * 問①〜問③まであります。
// * 問②に関しては、コメントを記述してください。
// *
// */
//public class Main {
//
//    public static final String SHOP_SHOHIN_00 = "バナナ";
//    public static final String SHOP_SHOHIN_01 = "牛乳";
//    public static final String SHOP_SHOHIN_02 = "豚肉";
//    public static final String SHOP_SHOHIN_03 = "コロッケ";
//
//    public static void main(String args[]) {
//
//        // ① 定数を全て使って、String型のListを記述してください。
//    		List<String> shohinList = new ArrayList<String>();
//    		shohinList.add("バナナ");
//    		shohinList.add("牛乳");
//    		shohinList.add("豚肉");
//    		shohinList.add("コロッケ");
//    		
//
//        // ② 以下の「shopMap.put(shohinList.get(1), 180);」の処理について、コメントを記述してください。
//        /*
//         * shohinList内の2番目に追加した要素をshopMap変数内に指定
//         *
//         */
//        LinkedHashMap<String, Integer> shopMap = new LinkedHashMap<String, Integer>();
//        shopMap.put(shohinList.get(0), 125);
//        shopMap.put(shohinList.get(1), 180);
//        shopMap.put(shohinList.get(2), 350);
//        shopMap.put(shohinList.get(3), 100);
//
//        // ③ カリキュラムを参考に拡張for文を使って、問題の画像と同じ表示になるよう記述してください。
//        // 「shohinList」と「shopMap」が保持する値を上手く利用しましょう。
//        for (String i : shohinList) {
//			System.out.println(i  + "=" + shopMap.get(i) +"円になります！");
//		}
//
//
//
//    }
//}

package study;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * 本問題では、基本的な日付操作クラスの使い方を学びましょう。
 *
 * 問①から問③まであります。
 * 問②に関しては、コメントを記述してください。
 *
 * ※この問題に関しては課題実施日によって結果が異なるため、出力結果が個々で異なります。
 */
public class Main {

	public static void main(String args[]) {

        // Dateクラスのインスタンスを生成
        Date now = new Date();

        // 問① ローカル変数「now」を使用し、本日の日付を表示してください。
        System.out.println(now);

        // Calendarクラスのインスタンスを生成
        Calendar calendar = Calendar.getInstance();

        // 問② 「(Calendar.MONTH) + 数値」の処理は、想定していない値となる可能性があります。
        // その理由をコメントへ記述してください。
        // 13以上の数値も入れることが出来、12月以上の表示がされてしまう為
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH) + 1);
        System.out.println(calendar.get(Calendar.DATE));
        // 問③ 上記の「calendar」を使用し、本日から1年2ヶ月15日先の日付を表示しなさい。
        // - この課題に関しては問題実施日によって結果が異なりますので、Wikiの画像とは結果が異なります。
        // - また、うるう年の場合は設定内容が正しくとも日付がズレて表示される可能性があります。
        calendar.add(Calendar.YEAR, 1);
        calendar.add(Calendar.MONTH, 2);
        calendar.add(Calendar.DATE, 15);

        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH) +1);
        System.out.println(calendar.get(Calendar.DATE));

        // うるう年判定
        printLeapYear(calendar.get(Calendar.YEAR));
    }

	/**
	 * うるう年判定
	 * 問③で日付がズレる可能性があるため補足として出力
	 * @param year
	 */
	private static void printLeapYear(final int year) {
		System.out.println(year + "年は、うるう年" + (Year.isLeap(year) ? "です。" : "ではありません。"));
	}
}
