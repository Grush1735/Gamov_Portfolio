import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCut extends TestSettings{

    // Возвращает строку, обрезанную до 100 символов с использованием многоточия в конце.
    // Многоточие также входит в лимит 100 символов.
    // Если последний символ "укороченной" строки (перед многоточием) приходится на середину слова, то остаток этого слова выбрасывается.
    // Т.е. обрезание происходит всегда по границе слова

    static Stream<Arguments> cutStrings(){
        return Stream.of(
                Arguments.arguments("Сто символов - это как-то много для проверки! Сто символов - это как-то много для проверки!! Верни ка мне обрезаннусю строку",
                      "Сто символов - это как-то много для проверки! Сто символов - это как-то много для проверки!!..."),
                Arguments.arguments("Сто символов - это как-то много для проверки! Сто символов - это как-то много для проверки!! Хочу ка мне обрезаннусю строку",
                        "Сто символов - это как-то много для проверки! Сто символов - это как-то много для проверки!! Хочу...")
        );
    }

    @ParameterizedTest
    @MethodSource("cutStrings")
    void cutStringsTests(String Sent, String result){
        new StringHelper(Sent);
        assertEquals(StringHelper.cut(), result, "Ожидалось строка в <=97 символов, заканчивающаяся целым словом и троеточием");
    }

}
