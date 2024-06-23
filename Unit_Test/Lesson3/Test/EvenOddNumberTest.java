import Unit_Test.Lesson3.EvenOddNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class EvenOddNumberTest {

    private EvenOddNumber evenOddNumber;

    @BeforeEach
    void setUp() {
        evenOddNumber = new EvenOddNumber();
    }


    @ParameterizedTest
    @ValueSource(ints = {-10, -8, -4, 0, 2, 22})
    void theNumberPassedIsEven(int n) {
        Assertions.assertTrue(evenOddNumber.evenOddNumber(n));
    }


    @ParameterizedTest
    @ValueSource(ints = {-17, -9, -1, 3, 15, 25})
    void theNumberPassedIsOdd(int n) {
        Assertions.assertFalse(evenOddNumber.evenOddNumber(n));
    }

}