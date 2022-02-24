import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringHelper {

    static String sentence;

    public StringHelper (String sentence){
        StringHelper.sentence = sentence;
    }

    //работает
    public static long getWordsCount(){
        Pattern pattern = Pattern.compile("[^\\d\\s]+");
        Matcher matcher = pattern.matcher(sentence);
        return matcher.results().count();
    }

    // работает
    public static String cut(){
        String match = null;
        if (sentence.length() > 97) {
            Pattern pattern = Pattern.compile("^(.{0,97})\\s");
            Matcher matcher = pattern.matcher(sentence);
            if (matcher.find()) match = matcher.group(1) + "...";
        } else match = sentence;
        return match;
    }

    // работает
    public static String find(int index, String str){
        String match = sentence;
        Pattern pattern = Pattern.compile(str);
        Matcher matcher = pattern.matcher(sentence);
        if (matcher.find(index))    match = sentence.substring(matcher.start());
        return match;
    }

    // работает
    public static String getFirstNumber() {
        String number;
        Pattern pattern = Pattern.compile("[\\D\\s](\\d+)[\\D\\s]");
        Matcher matcher = pattern.matcher(sentence);
        if (matcher.find()) number = matcher.group(1);
        else throw new RuntimeException("Невозможно найти число в строке");
        return number;
    }

}
