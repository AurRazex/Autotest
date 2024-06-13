package OOP.Lesson5.Controller;

import OOP.Lesson5.Model.Student;
import OOP.Lesson5.Model.StudentGroup;
import OOP.Lesson5.Model.Teacher;
import OOP.Lesson5.Model.User;
import OOP.Lesson5.Service.GroupService;
import OOP.Lesson5.Service.UserService;
import OOP.Lesson5.View.StudentView;

import java.util.List;

public class Controller {
    private UserService userService;
    private GroupService groupService;
    private StudentView studentView;

    public Controller() {
        this.userService = new UserService();
        this.groupService = new GroupService();
        this.studentView = new StudentView();
    }

    public Student createStudent(Student student) {
        return (Student) userService.create(student);
    }

    public Teacher createTeacher(Teacher teacher) {
        return (Teacher) userService.create(teacher);
    }

    public StudentGroup createGroup(Integer numberGroup, Teacher teacher, Student... students) {
        return groupService.CreateGroup(numberGroup, teacher, students);
    }

    public void printStudents(Student student) {
        studentView.printStudent(student);
    }

    public List<User> returnStudents() {
        return userService.read();
    }
}