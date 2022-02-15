import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
@Tag("getter")
public class TestGetFirstNumber extends TestSettings{

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
