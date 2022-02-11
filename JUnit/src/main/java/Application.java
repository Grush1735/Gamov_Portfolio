import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application {
    public static void main(String[] args) {
        String sent1 = "Проверка проверка... ";
        String sent2 = "Проверка проверка... 1 2,3";
        String sent3 = "У меня здесь (в этой строке) более много символов ! У меня здесь (в этой строке) более много символов !У меня здесь (в этой строке) более много символов !";
        System.out.println(StringHelper.cut(sent3));
        //System.out.println(StringHelper.getWordsCount(sent2));
    }
}
