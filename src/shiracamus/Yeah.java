package shiracamus;
public class Yeah {

    /**
     * 入力された文字列に「い」または「イ」が合ったら、「イェー」に置き換えてください。
     * ただし、連続する場合は2回目以降は「ー」に置き換えてください。
     */
    public static String convert(String text) {
        final String target = "いイ";
        boolean lastWasHit = false;
        String[] separatedText = text.split("");
        for (int i = 0; i < separatedText.length; i++) {
            boolean currentIsHit = target.contains(separatedText[i]);
            if (currentIsHit) {
                separatedText[i] = lastWasHit ? "ー" : "イェー";
            }
            lastWasHit = currentIsHit;
        }
        return String.join("", separatedText);
    }
}