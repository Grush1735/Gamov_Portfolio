import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;
@Tag("getter")
public class TestGetWordsCount extends TestSettings{

    //Метод получает количество слов в строке с учетом спецсимволов. Цифра или число за слово не считается

    @Test
    void getWordsCountTestDirectScript(){
        String sentence = "Проверяем прямой сценарий";
        new StringHelper(sentence);
        assertEquals(StringHelper.getWordsCount(), 3, "Ожидали, что вернется int со значением 3");
    }

    @ParameterizedTest
    @ValueSource(strings = {"Хитрая стринга!!0!", "Хитрая стринга!!01415..114", "4Хитрая стринга!!01415..114", "!$Хитрая стринга!! проверка"})
    void getWordsCountTest2(String sent){
        new StringHelper(sent);
        assertEquals(StringHelper.getWordsCount(), 3, sent);
    }

}
