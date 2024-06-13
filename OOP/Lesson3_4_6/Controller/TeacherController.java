package OOP.Lesson3_4_6.Controller;

import OOP.Lesson3_4_6.Service.TeacherService;
import OOP.Lesson3_4_6.Model.Teacher;
import OOP.Lesson3_4_6.View.TeacherView;

import java.util.List;

public class TeacherController implements UserController<Teacher>{

    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();
    @Override
    public void create(String lastName,String firstName, String middleName) {
        teacherService.create(lastName,firstName,middleName);
    }
    public void editTeacher(Integer teacherId, String lastName,String firstName, String middleName){
        teacherService.editTeacher(teacherId,lastName,firstName,middleName);
    }
    public void initTeacherList(List<Teacher> list){
        teacherService.initData(list);
    }
    public void printTeachers(){
        teacherView.sendOnConsole(teacherService.getAll());
    }
}