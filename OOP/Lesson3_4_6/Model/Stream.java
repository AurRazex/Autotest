package OOP.Lesson3_4_6.Model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {
    List<StudentGroup> studentGroups = new ArrayList<>();

    public void addAGroup(StudentGroup group) {
        studentGroups.add(group);
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return studentGroups.iterator();
    }
}
