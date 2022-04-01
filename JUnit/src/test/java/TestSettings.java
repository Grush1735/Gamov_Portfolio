import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class TestSettings {

    @BeforeAll
    static void globalSetup(){
        System.out.println("Начинаю тестирование метода");
    }

    @BeforeEach
    void localSetup(){
        System.out.println("Ожидайте, начинаю следующий тест");
    }

    @AfterEach
    void localTeardown(){
        String sentence = null;
        System.out.println("Ожидайте, идет тестирование");
    }

    @AfterAll
    static void globalTeardown(){
        System.out.println("Тестирование метода завершено, все тесты пройдены успешно, можно выливать на ПРОД");
    }
}