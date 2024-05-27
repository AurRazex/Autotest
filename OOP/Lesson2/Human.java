package OOP.Lesson2;

public class Human extends Actor {


    @Override
    String getName() {
        return name;
    }

    @Override
    public void setMakeOrder() {
        isMakeOrderClass = true;
    }

    @Override
    public void setTakeOrder() {
        isTakeOrderClass = true;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrderClass;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrderClass;
    }
}
