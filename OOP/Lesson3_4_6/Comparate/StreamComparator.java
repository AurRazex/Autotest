package OOP.Lesson3_4_6.Comparate;

import OOP.Lesson3_4_6.Model.Stream;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream>{
    @Override
    public int compare(Stream f1, Stream f2) {
        return Integer.compare(f1.studentGroup.size(), f2.studentGroup.size());
    }
}
