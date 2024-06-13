package OOP.Lesson3_4_6.Controller;

import OOP.Lesson3_4_6.Service.StreamService;
import OOP.Lesson3_4_6.Service.StudentGroupService;
import OOP.Lesson3_4_6.Model.Stream;
import OOP.Lesson3_4_6.Model.Student;
import OOP.Lesson3_4_6.View.StudentView;

import java.util.List;

public class StudentController implements UserController<Student> {

    private final StudentGroupService studentGroupService = new StudentGroupService();

    private final StudentView studentView = new StudentView();

    public void removeStudentByFIO(Student firstName, String lastName, String middleName){
        studentGroupService.removeStudentByFIO(firstName, lastName, middleName);
    }

    public List<Student> getSortedStudentList() {
        List<Student> studentList = studentGroupService.getSortedStudentList();
        studentView.sendOnConsole(studentList);
        return studentList;
    }

    public List<Student> getSortedStudentByFIO() {
        List<Student> studentList = studentGroupService.getSortedStudentByFIO();
        studentView.sendOnConsole(studentList);
        return studentList;

    }
    private StreamService streamService;

    public StudentController(StreamService streamService) {
        this.streamService = streamService;
    }

    public void sortStreams(List<Stream> streams) {
        streamService.sortStreams(streams);
    }

    @Override
    public void create(String firstName, String lastName, String middleName) {
        studentGroupService.createStudent(firstName, lastName, middleName);
    }
}
