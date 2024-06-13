package OOP.Lesson3_4_6.View;

import OOP.Lesson3_4_6.Model.User;

import java.util.List;

public interface UserView<T extends User> {

         public void sendOnConsole(List<T> list);
}
