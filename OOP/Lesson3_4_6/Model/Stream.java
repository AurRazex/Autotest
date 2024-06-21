package OOP.Lesson3_4_6.Model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {
    public List<StudentGroup> studentGroup = new ArrayList<>();

    public void addAGroup(StudentGroup group) {
        studentGroup.add(group);
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return studentGroup.iterator();
    }
}
