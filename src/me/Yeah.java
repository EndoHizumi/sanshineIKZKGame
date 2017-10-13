package me;
import java.util.Arrays;

public class Yeah {
    /**
     * 入力された文字列に「い」または「イ」が合ったら、「イェー」に置き換えてください。
     * ただし、連続する場合は2回目以降は「ー」に置き換えてください。
     */
    public static String convert(String text) {
        boolean alwaysHit = false;
        String[] hit = {"い", "イ"};
        String[] strArray = toArray(text);
        for (int i = 0; i <= strArray.length - 1; i++) {
            if (Arrays.asList(hit).contains(strArray[i])){
                if (alwaysHit == false) {
                    strArray[i] = "イェー";
                    alwaysHit = true;
                } else {
                    strArray[i] = "ー";
                }
            }else{
                alwaysHit = false;
            }
        }
        return Arrays.toString(strArray).replace(" ", "").replace(",", "").replace("[", "").replace("]", "");
    }

    private static String[] toArray(String str) {
        String[] returnStr = new String[str.length()];
        // 変数strの長さ分回す
        for (int i = 0; i <= str.length() - 1 ; i++) {
            // 配列に順番に格納する
            returnStr[i] = String.valueOf(str.charAt(i));
        }
        return returnStr;
    }
}