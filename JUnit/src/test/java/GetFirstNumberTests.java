import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class GetFirstNumberTests extends TestSettings{

    // метод ищет подстроку str, начиная с индекса index.
    // Если str найдена после индекса index, то возвращает подстроку исходной строки, начиная от позиции вхождения str.
    // Если нет, то возвращается исходная строка.

    @ParameterizedTest
    @CsvSource({
            "У меня тут правильно выдано 15 ",
            "У меня тут правильно выдано 15!",
            "У меня тут правильно выдано$%15$%",
            "У меня тут правильно выдано %15 "
    })
    void findStringsTests(String sent){
        new StringHelper(sent);
        assertFalse(StringHelper.getFirstNumber() != "15", "Ожидалось, что метод вернет первое число (отделенное проблемами или спец. символами), которое встретится в строке");
    }

    @ParameterizedTest
    @CsvSource({
            "У меня тут неправильно выдано 15",
            "У меня тут неправильно выдано15!"
    })
    void findStringsTestsNegative(String sent){
        new StringHelper(sent);
        assertTrue(StringHelper.getFirstNumber() != "15", "Ожидалось, что метод вернет первое число (отделенное проблемами или спец. символами), которое встретится в строке");
    }
}
