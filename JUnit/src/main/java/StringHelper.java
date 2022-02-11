import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringHelper {


    //Pattern pattern = Pattern.compile("А.+а");

    public StringHelper (String sentence){


    }
    //работает
    public static long getWordsCount(String sentence){
        Pattern pattern = Pattern.compile("[^\\d\\s]+");
        Matcher matcher = pattern.matcher(sentence);
        return matcher.results().count();
    }

    // работает
    public static String cut(String sentence){
        if (sentence.length() > 97) {
            //sentence = sentence.substring(0, 97);
            Pattern pattern = Pattern.compile("^.{0,97}\\s");
            Matcher matcher = pattern.matcher(sentence);
            return matcher.results() + "...";
        } else return sentence;
    }

}
