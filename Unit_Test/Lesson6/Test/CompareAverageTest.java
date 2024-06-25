import Unit_Test.Lesson6.Work.AverageValue;
import Unit_Test.Lesson6.Work.CompareAverage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CompareAverageTest {

    @DisplayName("Тест пустого листа")
    @Test
    void testCalculatingAverageListWithoutNumbers() {
        List<Integer> listWithoutNumbers = new ArrayList<>();
        AverageValue average = new AverageValue(listWithoutNumbers);
        assertTrue(listWithoutNumbers.isEmpty());
        assertThat(average.avgValue()).isEqualTo(0);
    }

    @DisplayName("Тест метода вычисления среднего значения")
    @Test
    void testCalculatingAverageListNumbers() {
        List<Integer> listNumbers = new ArrayList<>(Arrays.asList(10, 18, 32, 25, 59, 17, 30));
        AverageValue average = new AverageValue(listNumbers);
        assertThat(average.avgValue()).isEqualTo(27.0);
    }


    @DisplayName("Тест метода сравнения средних значений когда оно выше у первого листа")
    @Test
    void testComparisonOfAverageInFavorOfTheFirstList() {
        List<Integer> listOne = new ArrayList<>(Arrays.asList(10, 22, 33, 44, 55));
        List<Integer> listTwo = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        AverageValue averageOne = new AverageValue(listOne);
        AverageValue averageTwo = new AverageValue(listTwo);

        CompareAverage compareAverage = new CompareAverage(listOne, listTwo);
        assertThat(compareAverage.info(averageOne, averageTwo))
                .isEqualTo("Первый список имеет большее среднее значение.");
    }

    @DisplayName("Тест метода сравнения средних значений когда оно выше у второго листа")
    @Test
    void testComparisonOfAverageInFavorOfTheSecondList() {
        List<Integer> listOne = new ArrayList<>(Arrays.asList(11, 12, 13, 14, 15));
        List<Integer> listTwo = new ArrayList<>(Arrays.asList(22, 32, 42, 52, 62));
        AverageValue averageOne = new AverageValue(listOne);
        AverageValue averageTwo = new AverageValue(listTwo);

        CompareAverage compareAverage = new CompareAverage(listOne, listTwo);
        assertThat(compareAverage.info(averageOne, averageTwo))
                .isEqualTo("Второй список имеет большее среднее значение.");
    }


    @DisplayName("Тест метода сравнения средних значений когда они равны у обоих листов")
    @Test
    void testTheAveragesOfBothListsAreEqual() {
        List<Integer> listOne = new ArrayList<>(Arrays.asList(11, 22, 33, 44, 55));
        List<Integer> listTwo = new ArrayList<>(Arrays.asList(11, 22, 33, 44, 55));
        AverageValue averageOne = new AverageValue(listOne);
        AverageValue averageTwo = new AverageValue(listTwo);

        CompareAverage compareAverage = new CompareAverage(listOne, listTwo);
        assertThat(compareAverage.info(averageOne, averageTwo))
                .isEqualTo("Средние значения равны.");
    }
}