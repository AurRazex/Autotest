package OOP.Lesson5.Service;

import OOP.Lesson5.Model.User;

import java.util.List;

public interface DataService {
    User create(User user);
    List<User> read();
}