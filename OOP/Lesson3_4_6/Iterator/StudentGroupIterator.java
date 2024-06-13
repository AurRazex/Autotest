package OOP.Lesson3_4_6.Iterator;

import OOP.Lesson3_4_6.Model.Student;
import OOP.Lesson3_4_6.Model.StudentGroup;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {

    private int count;


    private final List<Student> studentList;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.count = 0;
        this.studentList = studentGroup.getStudentList();
    }


    @Override
    public boolean hasNext() {
        return count < studentList.size() -1;
    }

    @Override
    public Student next() {
        if (!hasNext()) {
            return null;
        }
        count++;
        return studentList.get(count);
    }

    @Override
    public void remove() {
        studentList.remove(count);
    }
}
