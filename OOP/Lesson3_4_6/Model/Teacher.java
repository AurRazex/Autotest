package OOP.Lesson3_4_6.Model;

public class Teacher extends User{
    private Integer teacherId;

    public Teacher(Integer teacherId, String lastName,String firstName, String middleName) {
        super(lastName, firstName, middleName);
        this.teacherId=teacherId;
    }
    public Integer getTeacherId() {
        return teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                "lastName='" + super.getLastName() + '\'' +
                ", firstName='" + super.getFirstName() + '\'' +
                ", middleName='" + super.getMiddleName() + '\'' +
                '}';
    }
}
