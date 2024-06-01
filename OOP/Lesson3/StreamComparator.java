package OOP.Lesson3;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream>{
    @Override
    public int compare(Stream f1, Stream f2) {
        return Integer.compare(f1.studentGroups.size(), f2.studentGroups.size());
    }
}
