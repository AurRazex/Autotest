package Unit_Test.Lesson6.Work;

import java.util.List;

public class CompareAverage {


    private final List<Integer> integerList1;


    private final List<Integer> integerList2;


    public CompareAverage(final List<Integer> one, final List<Integer> two) {
        this.integerList1 = one;
        this.integerList2 = two;
    }


    public String info(final AverageValue listOne, final AverageValue listTwo) {
        double averageList1 = listOne.avgValue();
        double averageList2 = listTwo.avgValue();

        if (averageList1 > averageList2) {
            return "Первый список имеет большее среднее значение.";
        } else if (averageList2 > averageList1) {
            return "Второй список имеет большее среднее значение.";
        }
        return "Средние значения равны.";
    }
}