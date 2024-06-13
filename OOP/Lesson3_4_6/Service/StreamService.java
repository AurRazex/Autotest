package OOP.Lesson3_4_6.Service;

import OOP.Lesson3_4_6.Comparate.StreamComparator;
import OOP.Lesson3_4_6.Model.Stream;

import java.util.Collections;
import java.util.List;

public class StreamService {
    public void sortStreams(List<Stream> streams) {
        Collections.sort(streams, new StreamComparator());
    }
}
