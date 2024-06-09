package OOP.Lesson3;

import java.util.Comparator;

public class UserComparator<T extends User> implements Comparator<T> {

    @Override
    public int compare(T o0, T o1) {
        String name0 = o0.getLastName() + o0.getFirstName() + o0.getMiddleName();
        String name1 = o1.getLastName() + o1.getFirstName() + o1.getMiddleName();
        return name0.compareToIgnoreCase(name1);
    }
}
