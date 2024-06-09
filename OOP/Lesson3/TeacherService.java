package OOP.Lesson3;

import java.util.List;

public class TeacherService implements UserService<Teacher>{

    private List<Teacher> teacherList;
    private Integer maxTeacherId = 0;
    @Override
    public List<Teacher> getAll() {
        return teacherList;
    }

    @Override
    public void initData(List<Teacher> list) {
        this.teacherList = list;
        maxTeacherId = getNewMaxTeacherId();
    }

    @Override
    public void create(String lastName,String firstName, String middleName) {
        Teacher teacher = new Teacher(++maxTeacherId,lastName,firstName,middleName);
        teacherList.add(teacher);
    }
    public void editTeacher(Integer teacherId, String lastName,String firstName, String middleName){
        for (Teacher teacher: teacherList) {
            if (teacher.getTeacherId().equals(teacherId)){
                teacher.setLastName(lastName);
                teacher.setFirstName(firstName);
                teacher.setMiddleName(middleName);
            }
        }
    }
    private Integer getNewMaxTeacherId(){
        Integer result = teacherList.get(0).getTeacherId();
        for (Teacher teacher: teacherList) {
            if (result < teacher.getTeacherId()){
                result = teacher.getTeacherId();
            }
        }
        return result;
    }
}
