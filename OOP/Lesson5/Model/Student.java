package OOP.Lesson5.Model;

public class Student extends User{
    private Integer id;

    public Student(String firstName, String lastName, Integer age, Integer id) {
        super(firstName, lastName, age);
        this.id = id;
    }

    public Integer getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Студент: ID - '" + id + '\'' +
                ", Имя - '" + getFirstName() + '\'' +
                ", Фамилия - '" + getLastName() + '\'' +
                ", Год рождения - " + getAge();
    }
}