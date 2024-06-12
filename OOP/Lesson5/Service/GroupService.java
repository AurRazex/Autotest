package OOP.Lesson5.Service;

import OOP.Lesson5.Model.Student;
import OOP.Lesson5.Model.StudentGroup;
import OOP.Lesson5.Model.Teacher;

import java.util.ArrayList;

public class GroupService {
    public StudentGroup CreateGroup(Integer number, Teacher teacher, Student... students){
        ArrayList<Student> listStudent = new ArrayList<>();
        for (Student student: students){
            listStudent.add(student);
        }
        return new StudentGroup(number, teacher, listStudent);
    }
}