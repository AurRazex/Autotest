package OOP.Lesson3;

import java.util.List;

public class Controller {

    private final StudentGroupService studentGroupService = new StudentGroupService();

    public void removeStudentByFIO(Student firstName, String lastName, String middleName){
        studentGroupService.removeStudentByFIO(firstName, lastName, middleName);
    }

    public List<Student> getSortedStudentList() {
       return studentGroupService.getSortedStudentList();
    }

    public List<Student> getSortedStudentByFIO() {
        return studentGroupService.getSortedStudentByFIO();

    }
    private StreamService streamService;

    public Controller(StreamService streamService) {
        this.streamService = streamService;
    }

    public void sortStreams(List<Stream> streams) {
        streamService.sortStreams(streams);
    }

}
