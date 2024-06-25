package Unit_Test.Lesson6.Work;

import java.util.ArrayList;
import java.util.List;

public class AverageValue {


    private List<Integer> list = new ArrayList<>();


    public AverageValue(final List<Integer> listNum) {
        this.list = listNum;
    }


    public final double avgValue() {
        int average = 0;
        int sum = 0;
        if (list.isEmpty()) {
            return 0;
        }
        for (int number : list) {
            sum += number;
        }
        average = sum / list.size();
        return average;
    }
}