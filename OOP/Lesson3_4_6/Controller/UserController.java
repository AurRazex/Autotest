package OOP.Lesson3_4_6.Controller;

import OOP.Lesson3_4_6.Model.User;

public interface UserController<T extends User> {

    void create(String lastName,String firstName, String middleName);
}
