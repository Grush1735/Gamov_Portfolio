import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFind extends TestSettings{

    // метод ищет подстроку str, начиная с индекса index.
    // Если str найдена после индекса index, то возвращает подстроку исходной строки, начиная от позиции вхождения str.
    // Если нет, то возвращается исходная строка.

    static Stream<Arguments> findStrings(){
        return Stream.of(
                Arguments.arguments(5, "баг","багу мне найди, ооо!", "багу мне найди, ооо!"),
                Arguments.arguments(5, "баг","багу мне найди, багууу!", "багууу!"),
                Arguments.arguments(5, "баг","багубагу мне найди, багууу!", "багууу!"),
                Arguments.arguments(5, "баг","багу багу мне найди, багууу!", "багу мне найди, багууу!")

        );
    }

    @ParameterizedTest
    @MethodSource("findStrings")
    void findStringsTests(int index, String str, String sent, String result){
        new StringHelper(sent);
        assertEquals(StringHelper.find(index, str), result, "Ожидалось, что метод ищет подстроку str, начиная с индекса index. Если str найдена после индекса index, то возвращает подстроку исходной строки, начиная от позиции вхождения str. Если нет, то возвращается исходная строка.");
    }

}
