import Unit_Test.Lesson3.NumberInInterval;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class NumberInIntervalTest {

    private NumberInInterval numberInInterval;

    @BeforeEach
    void setUp() {
        numberInInterval = new NumberInInterval();
    }


    @ParameterizedTest
    @ValueSource(ints = {26, 40, 58, 76, 99})
    void theTransmittedNumberFallsWithinTheRangeFrom25To100(int n) {
        Assertions.assertTrue(numberInInterval.numberInInterval(n));
    }


    @ParameterizedTest
    @ValueSource(ints = {-25, 0, 25, 100, 125})
    void theNumberPassedDoesNotFallWithinTheRangeOf25To100(int n) {
        Assertions.assertFalse(numberInInterval.numberInInterval(n));
    }
}