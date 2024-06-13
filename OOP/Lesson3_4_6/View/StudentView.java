package OOP.Lesson3_4_6.View;

import OOP.Lesson3_4_6.Model.Student;

import java.util.List;

public class StudentView implements UserView<Student> {
    @Override
    public void sendOnConsole(List<Student> list) {
        for (Student student: list) {
            System.out.println(student.getStudentId());
        }
    }
}
