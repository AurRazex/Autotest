package OOP.Lesson5.Model;

public abstract class User {
    private String firstName;
    private String lastName;
    private Integer age;

    public User(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Имя - '" + firstName + '\'' +
                ", Фамилия - '" + lastName + '\'' +
                ", Год рождения - " + age;
    }
}