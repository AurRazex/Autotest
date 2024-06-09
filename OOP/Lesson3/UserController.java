package OOP.Lesson3;

public interface UserController<T extends User> {

    void create(String lastName,String firstName, String middleName);
}
