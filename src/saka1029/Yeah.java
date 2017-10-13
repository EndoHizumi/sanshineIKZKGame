package saka1029;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
@auhtor "https://qiita.com/shiracamus";
*/
public class Yeah {
    static final Pattern PAT = Pattern.compile("[いイ]+");
    public static String convert(String s) {
        StringBuffer sb = new StringBuffer();
        Matcher m = PAT.matcher(s);
        while (m.find())
            m.appendReplacement(sb, "イェ" + m.group().replaceAll(".", "ー"));
        m.appendTail(sb);
        return sb.toString();
    }
}