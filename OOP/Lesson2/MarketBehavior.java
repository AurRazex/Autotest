package OOP.Lesson2;


public interface MarketBehavior {

    void acceptToMarket(Actor actor);

    void releaseFromMarket(Actor actor);

    void update();
}
